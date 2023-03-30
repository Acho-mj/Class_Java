import java.util.Scanner;
public class BoxVolume{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int volume = 1;

        for (int i = 0; i < 3; i++) { //변수 i를 따로 선언하지 않아도 되는 for문으로 메모리 사용량 줄임
            int dimension;

            do { //do-while문으로 유효하지 않은 값을 저장하지 않아도 되기 때문에 메모리 사용량 감소

                System.out.print("상자의 " + (i + 1) + "번째 길이를 입력하세요: ");
                dimension = sc.nextInt();	//상자의 길이를 입력받음.
            }while(dimension > 100);	//입력받은 값이 100을 초과하면 재입력하게 됨.
            volume *= dimension;  //부피를 바로 계산하기 때문에 메모리 사용량이 감소함.
        }
        System.out.println("상자의 부피는 " + volume + "입니다.");
    }
}
