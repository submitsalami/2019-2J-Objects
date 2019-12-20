
/**
 * クラス createPoint の注釈をここに書きます.
 * 
 * @author (Hein Thu)
 * @version (2019/11/29)
 */
import java.awt.Point;
//create a method called createPoint include 2 parameter
public class createPoint{
   public static void createPoint(int x,int y){
       Point z = new Point(x,y);
       z.x = 5;
       z.y = 5;
       printPoint(z);
   }
   //main method
   public static void main(String[] args){
          //pass arguments to x and y
          int x = 4;
          int y = 4;
          createPoint(x,y);
   }
   //print point by passing point to a method called printPoint
   public static void printPoint(Point p){
            System.out.print(p);
    }
}
