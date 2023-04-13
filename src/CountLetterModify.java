import java.util.Scanner;

public class CountLetterModify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 25개의 소문자/대문자를 저장할 수 있는 배열 생성
        int[] countLower = new int[26];
        int[] countUpper = new int[26];

        System.out.print("문자열 입력: ");
        // 사용자가 입력한 문자열을 buffer 변수에 저장한 후 버퍼를 비움.
        String buffer = sc.nextLine();

        // 입력받은 문자열을 읽어서 반복적으로 처리함.
        for(int i=0; i< buffer.length(); i++) {
            // buffer 변수에서 i번째 문자를 ch 변수에 저장함.
            // charAt은 특정 문자의 위치를 반환함.
            char ch = buffer.charAt(i);

            // 만약 스페이스이면 반복을 계속함
            if(ch == ' ') {
                continue;
            }
            // 소문자인 경우
            if (ch >= 'a' && ch <= 'z') {
                // 소문자이면 count 배열의 해당 인덱스 값을 1 증가
                countLower[ch - 'a']++;

                // 대문자인 경우
            }else if(ch >= 'A' && ch <= 'Z') {
                // 대문자이면 count 배열의 해당 인덱스 값을 1 증가
                countUpper[ch-'A']++;
            }
        }

        // 소문자 횟수 출력
        for(int i=0; i<countLower.length; i++) {
            // 해당 문자가 1번 이상 등장했을 경우 실행
            if(countLower[i] > 0) {
                char ch = (char)(i+'a');
                System.out.println(ch + " : " + countLower[i] + "번");
            }
        }

        // 대문자 횟수 출력
        for(int i=0; i<countUpper.length; i++) {
            // 해당 문자가 1번 이상 등장했을 경우 실행
            if(countUpper[i] > 0) {
                char ch = (char)(i+'A');
                System.out.println(ch + " : " + countUpper[i] + "번");
            }
        }
    }
}
