import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args)throws IOException {
        FileReader reader  = null;
        try{
            reader = new FileReader("poem.txt");
            while(true){
                int data = reader.read();
                if(data == -1)
                    break;
                char ch = (char)data;
                System.out.println(ch);
            }
        }catch(FileNotFoundException fnfe){
            System.out.println("X");

        }
    }
}
