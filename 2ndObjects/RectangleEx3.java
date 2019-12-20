
/**
 * Write a description of class RectangleEx3 here.
 *
 * @author (Pan Zun)
 * @version (2019/12/06)
 */
import java.awt.Rectangle;
public class RectangleEx3
{
   public static void main(String[]args){
    System.out.println(createRectangle(20,80,20,15));
    }
    // Return Rectangle
    public static Rectangle createRectangle(int x,int y,int width,int height){
        return new Rectangle(x,y,width,height);
    }
}
