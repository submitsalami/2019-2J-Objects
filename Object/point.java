import java.awt.Point;
public class point{
    public static void main (String[]args){
        Point a = new Point(10,5);
        //ex1
        System.out.println(a);
        //ex2
        System.out.println("x value = " + a.x);
        //ex3
        System.out.println("y value = " + a.y);
        //ex4
        a.x = 20;
        a.y = 50;
        System.out.println("new x value = " + a.x);
        System.out.println("new y value = " + a.y);
        
        System.out.println("(" + a.y + "," + a.x + ")");
        //ex5
        printPoint(a);
    }
    public static void printPoint(Point p){
        System.out.println("x value = " + p.x);
        System.out.println("y value = " + p.y);
    }
}