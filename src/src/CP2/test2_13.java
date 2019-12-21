package CP2;
//Point类，求几个点之间的距离
public class test2_13 {
    public static void main(String[] args){
        Point P1 = new Point();
        P1.x = 1;
        P1.y = 1;
        System.out.println("P1 to Origin = "+ P1.distanceToOrigin());

        Point P2 = new Point();
        P2.x = 2;
        P2.y = 2;
        System.out.println("P1 TO P2 = "+ P2.distanceToPoint(P1));
    }
}
class Point {
    double x, y;

    double distanceToOrigin(){
        return Math.sqrt(x*x+ y*y);
    }

    double distanceToPoint(Point p){
        return Math.sqrt((x- p.x)*(x - p.x) + (y - p.y)*(y - p.y));
    }
}