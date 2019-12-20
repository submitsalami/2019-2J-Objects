
/**
 * クラス Ex5 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/11)
 */
import java.awt.Point;
public class Ex5{
    public static void createPoint(Point p1,Point p2,Point p3){
        //find  a
        int a = p2.x-p1.x;
        //find b
        int b = p3.y-p2.y;
        //using a pythagoras law
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.print(c);
    }
    public static void main(String[]args){
      Point p1 = new Point(3,2);
      Point p2 = new Point(7,2);
      Point p3 = new Point(7,5);
      createPoint(p1,p2,p3);
    }
}

