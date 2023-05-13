class Shape{
    protected int x, y;
    public void draw(){
        System.out.println("Shape Draw");
    }
}

class Rectangle extends Shape{
    private int width, height;

    public void setWidth(int w){
        width = w;
    }
    public void setHeight(int h){
        height = h;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public void draw(){
        System.out.println("Rectangle Draw");
    }
}

class Triangle extends Shape{
    private int base, height;
    public int getBase(){
        return base;
    }
    public int getHeight(){
        return height;
    }
    public void draw(){
        System.out.println("Triangle Draw");
    }
}

class Circles extends Shape{
    private int radius;

    public int getRadius(){
        return radius;
    }
    public void draw(){
        System.out.println("Circle Draw");
    }
}


// 다형성의 장점
public class ShapeTest {
    private static Shape arrayOhShapes[];
    public static void main(String args[]){
        init();
        drawAll();
    }

    Shape s = getShape();
    if(s instanceof Rectangle){
        System.out.println("Rectangle이 생성되었습니다.");
    }else{
        System.out.println("Rectangle이 아닌 다른 객체가 생성되었습니다.");
    }
    public static void init(){
        arrayOhShapes = new Shape[3];
        arrayOhShapes[0] = new Rectangle();
        arrayOhShapes[1] = new Triangle();
        arrayOhShapes[2] = new Circles();
    }
    public static void drawAll(){
        for(int i=0; i< arrayOhShapes.length; i++){
            arrayOhShapes[i].draw();
        }
    }
    public static double clacArea(Shape s){
        double area = 0.0;
        if(s instanceof Rectangle){
            int w = ((Rectangle) s).getWidth();
            int h = ((Rectangle) s).getHeight();
            area = (double) (w*h);
        }
        if(s instanceof Triangle){
            int b = ((Triangle) s).getBase();
            int h = ((Triangle) s).getHeight();
            area = (double) (b*h*0.5);
        }
        if(s instanceof Circles){
            int r = ((Circles) s).getRadius();
            area = (double) (3.14*r*r);
        }
        return area;
    }
}
