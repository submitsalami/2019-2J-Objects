
/**
 * Write a description of class Ex2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Point;
public class Ex2
{
    public static void main(String[]args){
    Point b = new Point(10,5);
    System.out.println(b);
    b.x = 20;
    b.y = 50;
    //Print b.y and  b.x
    System.out.print("(" + b.y + "," + b.x  + ")");
    }
}
