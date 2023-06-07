import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyByte {
    public static void main(String[] args) throws IOException {
        String sourceFile = args[0];
        String targetFile = args[1];

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(sourceFile);
            outputStream = new FileOutputStream(targetFile);

            byte[] buffer = new byte[4096];
            int bytesRead;
            long beforeTime = System.currentTimeMillis();

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("Success");

            // 파일 복사에 걸린 시간 계산 및 출력
            long afterTime = System.currentTimeMillis();
            long totalTime = afterTime - beforeTime;
            System.out.println("Total time : " + totalTime );

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Closing the file error: " + e.getMessage());
            }
        }
    }
}
