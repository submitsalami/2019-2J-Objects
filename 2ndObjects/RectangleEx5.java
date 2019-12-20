
/**
 * Write a description of class RectangleEx5 here.
 *
 * @author (Pan Zun)
 * @version (2019/12/13)
 */
import java.awt.Rectangle;
public class RectangleEx5
{
    public static void main(String[]args){
      //box.x = 7 and box.y = 30; box.width is 23 and box.height is 5.
      int x = 7;
      int y = 30;
      int width = 23;
      int height = 5;
      shiftBox(x,y,width,height);
      //Create new Rectangle
      Rectangle box2 = new Rectangle(x,y,width,height);
      //Shift the box rightwards (on the X coordinate) by 3 
      
        int a = box2.x + 3;
      // upwards (the Y coordinate) by 5
        int b = box2.y + 5;
      shiftBox(a,b,width,height);
    }
    //Create a method called shiftBox
    public static void shiftBox(int x,int y,int width,int height){
        Rectangle box = new Rectangle(x,y,width,height);
        System.out.println(box);
    }
}
