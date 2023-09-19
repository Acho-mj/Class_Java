// 프리미티브 타입 데이터를 출력하는 DataOuputStream 클래스 사용하기
import java.io.*;

public class DataOuputExample {
    public static void main(String args[]){
        DataOutputStream out = null;
        try{
            out = new DataOutputStream(new FileOutputStream("output.dat"));
            int arr[] = {0,1,2,3,4,5,6,7,8,9};
            for(int cnt = 0; cnt < arr.length; cnt++)
                out.writeInt(arr[cnt]);
        } catch(IOException ioe){
            System.out.println("출력할 수 없습니다.");
        } finally{
            try{
                out.close();
            } catch(Exception e){
        }
        }
    }
}
