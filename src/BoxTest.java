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
