/* 1번 상자의 속성 : 상자 안에 있는 물건, 색, 너비, 높이, 길이 */
class Box{
    /* 2번, 3번 필드 정의 */
    int width;
    int length;
    int height;
    
    /* 4번 설정자 메소드 */
    void setWidth(int width){
        this.width = width;
    }

    void setLength(int length){
        this.length = length;
    }

    void setHeight(int height){
        this.height = height;
    }

    /* 4번 접근자 메소드 */
    int getWidth(){
        return width;
    }

    int getLength(){
        return length;
    }

    int getHeight(){
        return height;
    }
    
    /* 5번 상자의 부피를 계산하는 메소드 getVolume()을 작성 */
    int getVolume() {
        return width * length * height;
    }

    /* 6번 상자의 속성값을 문자열로 만들어서 반환하는 toString() 메소드 */
    public String toString() {
        return "width=" + width + ", length=" + length + ", height=" + height;
    }
}

/* BoxTest라는 클래스를 작성하고 main() 메소드를 추가 */
 class BoxTest {
    public static void main(String args[]){
        Box box1; // 7번 참조 변수 정의
        box1 = new Box(); // 8번 객체 생성
        Box box2 = new Box(); // 12번

        /* 9번 설정자 메소드를 호출 */
        box1.setWidth(100);
        box1.setLength(100);
        box1.setHeight(100);

        int volume = box1.getVolume(); // 10번
        System.out.println("box1의 부피 : " + volume); // 10번

        System.out.println("box1 : " + box1); // 11번

        /* 12번 설정자 메소드 호출하여 값 설정 */
        box2.setWidth(200);
        box2.setLength(200);
        box2.setHeight(200);

        box1 = box2; // 13번 box1를 대입
        System.out.println("box1의 속성값 : " + box1.toString()); // 13번 box1의 속성값을 출력
    }
}

/* 10번 참조 변수 box1을 통하여 getVolume() 메소드를 호출하여 보자. 어떤 값이 반환되는가?
답 : 1000000

11번 System.out.println(box1); 하면 무엇이 출력되는가?
답 : width=100, length=100, height=100
Box 클래스에서 객체 자체를 호출하면
Object 클래스의 toString() 함수를 재정의한 함수인
Box 클래스의 toString() 함수가 자동 호출됨을 알 수 있다.

13번 참조 변수 box2의 값을 box1에 대입한 후에 접근자를 통하여 box1의 속성값을 출력하
여 보자. 무엇을 알 수 있는가?
답 : box1의 값이 box2의 값으로 변경되었다. box1과 box2가 같은 객체를 가리킨다는 것을 알 수 있다. */
