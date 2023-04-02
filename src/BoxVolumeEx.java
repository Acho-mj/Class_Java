import java.util.Scanner;
import java.util.InputMismatchException;

public class BoxVolumeEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //변수를 초기화함
        int width = 0;
        int height = 0;
        int length = 0;

        // 너비 입력받기
        while (true) { // 무한루프로 설정하여 특정 정수값이 들어올 때까지 계속 실행되게 함
            System.out.print("> 상자 너비를 입력하세요: ");
            try {
                width = sc.nextInt(); // 입력 받기
            } catch (InputMismatchException e) {    // nextInt()와 일치하지 않은 데이터 타입이 입력됐을 때 발생하는 예외처리
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                sc.nextLine();  // 버퍼에 잘못된 입력값을 지워 새로운 입력값을 받았을 때 에러가 생기지 않게 함.
                continue;   // 다시 입력 받도록 함.
            }
            if (width > 100 || width <=0) { // 입력값이 100 초과, 0 이하일 경우 다시 입력받게 함.
                System.out.println("0 이상 100 이하의 값만 입력 가능합니다. 다시 입력해주세요.");
            } else {
                break;  // 조건에 알맞은 값이 들어오면 while 문을 탈출함.
            }
        }

        // 높이 입력받기
        while (true) {  // 무한루프로 설정하여 특정 정수값이 들어올 때까지 계속 실행되게 함
            System.out.print("> 상자 높이를 입력하세요: ");
            try {
                height = sc.nextInt();  // 입력 받기
            } catch (InputMismatchException e) {    // nextInt()와 일치하지 않은 데이터 타입이 입력됐을 때 발생하는 예외처리
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                sc.nextLine();  // 버퍼에 잘못된 입력값을 지워 새로운 입력값을 받았을 때 에러가 생기지 않게 함.
                continue;   // 다시 입력 받도록 함.
            }
            if (height > 100 || height <= 0) {  // 입력값이 100 초과, 0 이하일 경우 다시 입력받게 함.
                System.out.println("0 이상 100 이하의 값만 입력 가능합니다. 다시 입력해주세요.");
            } else {
                break;  // 조건에 알맞은 값이 들어오면 while 문을 탈출함.
            }
        }

        // 길이 입력받기
        while (true) {  // 무한루프로 설정하여 특정 정수값이 들어올 때까지 계속 실행되게 함
            System.out.print("> 상자 길이를 입력하세요: ");
            try {
                length = sc.nextInt();  // 입력 받기
            } catch (InputMismatchException e) {    // nextInt()와 일치하지 않은 데이터 타입이 입력됐을 때 발생하는 예외처리
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                sc.nextLine();  // 버퍼에 잘못된 입력값을 지워 새로운 입력값을 받았을 때 에러가 생기지 않게 함.
                continue;   // 다시 입력 받도록 함.
            }
            if (length > 100 || length <=0) {   // 입력값이 100 초과, 0 이하일 경우 다시 입력받게 함.
                System.out.println("0 이상 100 이하의 값만 입력 가능합니다. 다시 입력해주세요.");
            } else {
                break;  // 조건에 알맞은 값이 들어오면 while 문을 탈출함.
            }
        }

        // 정사면체 부피 계산하기
        int volume = width * height * length;
        System.out.println("정사면체의 부피는 " + volume + "입니다.");
    }
}

