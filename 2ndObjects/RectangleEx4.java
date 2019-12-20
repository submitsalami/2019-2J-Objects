
/**
 * Write a description of class RectangleEx4 here.
 *
 * @author (Pan Zun)
 * @version (2019/12/06)
 */
import java.awt.Point;
import java.awt.Rectangle;
public class RectangleEx4
{
   // create a box
   //create a method called findCenter
   public static void main(String[]args){
      System.out.println(findCenter(20,40,60,80));
    }
   public static Point findCenter(int x,int y,int width,int height){
       Rectangle box = new Rectangle(x,y,width,height);
       //center of Rectangle
       int a = box.x+width/2;
       int b = box.y+height/2;
       //return a point
       return new Point(a,b);
    } 
}
