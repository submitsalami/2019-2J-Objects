import java.awt.Point;
public class pointEx3{
    //use create point to create three point
    public static void createPoint(Point p1,Point p2,Point p3){
        //get the distance between p1 and p2
        int a = p2.x - p1.x;
        //get the distance between p2 and p3
        int b = p3.y - p2.y;
        //use pythagoras theory
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        //call method
        System.out.print(c);
    }
    public static void main(String[]args){
        Point p1 = new Point(3,2);
        Point p2 = new Point(7,2);
        Point p3 = new Point(7,5);
        createPoint(p1,p2,p3);
    }
}