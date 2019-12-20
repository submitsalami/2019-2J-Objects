
/**
 * クラス Exercise の注釈をここに書きます.
 * 
 * @author (Hein Thu)
 * @version (2019/11/29)
 */
import java.awt.Point;
//create a method called createPoint include 3 parameter
public class Pythagoras{
   public static void createPoint(Point p1,Point p2,Point p3){
       //Find a
      int a = p2.x - p1.x;
      //Find b
      int b = p3.y - p2.y;
      //Find c
      double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
      //print distance p1 from p3
      System.out.print(c);
   }
   public static void main(String[] args){
       //pass arguments for p1,p2,p3
         Point p1 = new Point(3,2);
         Point p2 = new Point(7,2);
         Point p3 = new Point(7,5);
         //called method
         createPoint(p1,p2,p3);
    }
}
