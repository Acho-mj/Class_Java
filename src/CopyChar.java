import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyChar {
    public static void main(String[] args) throws IOException{
        // args 배열 활용
        String sourceFile =args[0];
        String targetFile =args[1];

        FileReader reader = null;
        FileWriter writer = null;
        try{
            reader = new FileReader(sourceFile);
            writer = new FileWriter(targetFile);
            
            // sourceFile의 내용을 담을 배열
            char[] charArray = new char[4096];
            int size = 0;

            int data;
            // 파일의 끝이 아닐경우 while문 실행하고, 파일에서 한 문자씩 data에 저장
            while((data = reader.read()) != -1){
                charArray[size++] = (char)data; // 배열에 파일 내용 저장
            }
            //파일의 내용을 targetFile에 복사
            writer.write(charArray, 0, size);

            System.out.println("success");
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found: " + fnfe.getMessage());
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("closing the file error: " + e.getMessage());
            }
        }
    }
}
