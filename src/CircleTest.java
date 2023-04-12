//원 반지름 입력 받아 넓이, 둘레 구하는 프로그램
import java.util.Scanner;

class Circle{
    // 필드 설정
    double radius;
    final double PI = 3.141592;

    // 원의 반지름 설정자
    void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    // 원의 반지름 접근자
    double getRadius() {
        return radius;
    }

    // 원의 넓이 반환 메소드
    double getArea() {
        return radius * radius * PI;
    }

    // 원의 둘레 반환 메소드
    double getPerimeter() {
        return 2 * radius * PI;
    }
}

public class CircleTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 객체 생성
        Circle myCircle = new Circle();

        // 반지름 입력
        System.out.print("원의 반지름을 입력하세요 : ");
        double myRadius = sc.nextDouble();
        myCircle.setRadius(myRadius);

        // 원의 넓이와 둘레 출력
        System.out.println("원의 넓이 : " + myCircle.getArea());
        System.out.println("원의 둘레 : " + myCircle.getPerimeter());
    }
}

