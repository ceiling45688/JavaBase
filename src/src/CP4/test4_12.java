package CP4;

public class test4_12 {
    public static void main(String[] args){
        Line line = new Line();
        //调用类方法,这里其实有一个先向上转型，再通过强制转换向下转型转回line，使其获得子类line的全部功能
        Shape.draw(line);
    }
}

class Shape{
    static public void draw(Shape s){
        if (s instanceof Line){
            Line line = (Line) s;
            line.drawLine();
        }
        if (s instanceof Circle){
            Circle circle = (Circle) s;
            circle.drawCircle();
        }
    }
}
class Line extends Shape{
    public void drawLine(){
        System.out.println("Draw Line!");
    }
}
class Circle extends Shape{
    public void drawCircle(){
        System.out.println("Draw Circle!");
    }
}
