import java.awt.Point;
public class point{
    public static void main (String [] args){
        Point blank = new Point(10,5);
        System.out .println(blank);
        System.out.println(blank.x);
        System.out.println(blank.y);
         blank.x=20;
        blank.y=50;
        System.out.println(blank.x);
        System.out.println(blank.y);
    }
}