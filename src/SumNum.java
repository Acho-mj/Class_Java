import java.util.Scanner;
public class SumNum{
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        a = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        b = sc.nextInt();
        int sum = a + b;

        System.out.println(a + " + " + b + " = " + sum);
    }
}
