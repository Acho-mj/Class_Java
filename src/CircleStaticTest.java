class CircleStatic {
    private double radius;
    // PI 라는 이름으로 3.141592로 초기화된 정적 상수
    static final double PI=3.142592;

    // 1번_원의 반지름을 매개 변수로 받는 생성자를 작성한다.
    public CircleStatic(double radius){
        this.radius = radius;
    }

    // 2번_매개 변수가 없는 생성자로서 원의 반지름을 0.0으로 설정한다.
    public CircleStatic(){
        this.radius = 0.0;
    }

    // 3번_설정자 메소드인 setRadius()를 작성한다.
    public void setRadius(double radius){
        this.radius = radius;
    }

    // 4번_접근자 메소드인 getRadius()를 작성한다.
    public double getRadius() {
        return this.radius;
    }

    // 5번_double형의 값을 제곱하여 반환하는 square()메소드를 작성한다.
    // 전용메소드로 선언하라.
    private double square(double value) {
        return value * value;
    }

    // 6번_원의 면적을 계산하는 getArea()메소드를 작성한다.
    public double getArea() {
        return PI * square(this.radius);
    }

    // 7번_원의 둘레를 계산하는 getPerimeter()메소드를 작성한다.
    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    // 8번_PI값을 반환하는 정적 메소드 getPI()메소드를 작성한다.
    public static double getPI() {
        return PI;
    }

    // 9, 11번_Circle클래스 안에 main()을 추가하고 다음과 같이 square() 메소드를 호출하여 보자.
    // 어떤 결과가 발생 하는가? 또 그 이유는 무엇인가?
    public static void main(String args[]){
        //		square(10.0);
        CircleStatic c1 = new CircleStatic(5.0);
        c1.square(10.0);
        getPI();
    }
}

public class CircleStaticTest {
    public static void main(String[] args) {
        /* 11번_Circle 클래스를 테스트하기 위하여 별도의 클래스인 CircleTest클래스를 작성하라.
         * main() 안에서 Circle 객체를 생성하고
         * getArea()와 getPerimeter()를 호출하여서 원의 면적과 둘레를 구하라.*/
        CircleStatic c1 = new CircleStatic(5.0);
        System.out.println("원의 넓이: " + c1.getArea());
        System.out.println("원의 둘레: " + c1.getPerimeter());

        // 12, 15번_ CircleTest 클래스 안에서 다음과 같이 radius를 참조하여 보라. 어떤 결과가 나오는가? 그 이유는?
        // Circle.radius = 10.0;
        // Circle.square(20.6);
    }
}

/* 9번. 컴파일에러가 난다. square() 메소드가 private로 선언되어 있어서 main() 메소드에서 직접 호출할 수 없다.


12번. 컴파일에러가 난다. Circle 클래스의 radius 필드와 square() 메소드가 private로 선언되어있다. private 접근 제한자를 붙인 radius 경우 외부에서 필드값을 변경하지 못하도록 막기 때문에 에러가 난다.


13번. 컴파일에러가 난다. static 변수가 아닌 radius 필드에 접근하려고 했기 때문에 발생하는 에러이다. main() 메소드도 정적 메소드이기 때문에 객체 생성 없이 인스턴스 필드를 바로 사용할 수 없다. 즉, 인스턴스 필드인 radius 변수에 접근하는 방법이 잘못됐다.


14번. 컴파일에러가 난다. radius 변수가 public으로 선언되어 있지만 non-static 변수이기 때문에 13번과 같은 이유로 에러가 난다. 추가로 인스턴스 변수는 클래스로 직접 접근하지 못하고, 객체이름.변수이름;으로 접근해야한다.


15번. 컴파일에러가 난다. private으로 선언되어 있어서 외부에서 접근할 수 없기 때문이다.
// 교수님의 피드백 : 클래스 이름으로 호출했으나 정적 함수로 선언되어 있지 않았기 때문이기도 하다.


16번. -는 private(전용), +는 public(공용)이다.

             Circle
----------------------------------
 -radius: double
 +PI: double {readonly}
----------------------------------
 + Circle(radius: double)
 + Circle()
 + setRadius(radius: double): void
 + getRadius(): double
 - square(value: double): double
 + getArea(): double
 + getPerimeter(): double
 + static getPI(): double
---------------------------------- */

