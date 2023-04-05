import java.util.Scanner;
// 사용자가 입력한 문자열에서 각각의 문자들이 나타나는 횟수를 계산
class CountLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 52개의 정수를 저장할 수 있는 배열 count를 선언하고 생성함.
        int[] count = new int[53];

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
                // ch문자의 알파벳 순서에서 a의 알파벳 순서를 뺀 값
                count[ch - 'a']++;
            // 대문자인 경우
            }else if(ch >= 'A' && ch <= 'Z') {
                // 대문자이면 count 배열의 해당 인덱스 값을 1 증가
                // ch문자의 알파벳 순서에서 A의 알파벳 순서를 뺀 값에
                // 26를 더한 이유는 소문자가 26개(인덱스25)이기 때문임.
                count[ch-'A'+26]++;
            }
        }

        // 배열에 저장된 횟수를 출력하는 반복문
        for(int i=0; i<count.length; i++) {
            // 해당 문자가 1번 이상 등장했을 경우 실행
            if(count[i] > 0) {
                // if-else문을 사용하지 않기 때문에 실행 횟수를 줄일 수 있음
                // 삼항연산자를 사용하여 대/소문자로 변환함.
                char ch = (char)(i < 26 ? i+'a' : i+'A'-26);
                System.out.println(ch + " : " + count[i] + "번");
            }
        }
    }
}

