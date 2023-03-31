import java.util.Scanner;
import java.util.Random;
public class FindNumGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ranGen = new Random();
        int ranNum, answer, count = 1;
        ranNum = ranGen.nextInt(100)+1;

        while(count<6) {

            System.out.println("1~100까지의 숫자를 입력해주세요 : ");
            answer = sc.nextInt();

            // if elseif 문을 사용해서 난수값이 입력값과 같을 경우, 클 경우, 작을 경우로 나눔
            // 교수님께서 정답이 맞을 확률과 맞지 않을 확률을 고려해서
            // if문을 작성하는 것이 좋다고 하셨다.
            // 프로그램 루핑을 조금이라도 줄이는 것이 좋다.
            if(ranNum < answer){
                System.out.println("랜덤 수가 입력값보다 작습니다.");
                System.out.println(count + "번 시도했습니다.");
                System.out.println("=====================");
                count+= 1;
            }else if(ranNum > answer){
                System.out.println("랜덤 수가 입력값보다 큽니다.");
                System.out.println(count + "번 시도했습니다.");
                System.out.println("=====================");
                count+= 1;	//count 횟수를 1씩 증가시켜 게임 횟수 늘리기
            }else{
                System.out.println("!!" + count + "번 만에 정답을 맞추었습니다 !!");
                break;	// break 키워드를 사용해서 정답일 경우 while문을 탈출
            }
        }
        if (count==6)
            System.out.println("정답을 5번 시도에 맞추지 못했습니다.");
    }
}