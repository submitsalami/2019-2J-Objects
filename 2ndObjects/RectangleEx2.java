
/**
 * Write a description of class RectangleEx2 here.
 *
 * @author (Pan Zun)
 * @version (2019/12/06)
 */
import java.awt.Rectangle;
public class RectangleEx2
{   
    public static void main(String[]args){
        int x = 50;
        int y = 27;
        int width = 20;
        int height = 15;
        createRectangle(x,y,width,height);
    }
    //create a method called createREctangle
    public static void createRectangle(int x,int y,int width,int height){
        //use the attritube x = 50,y = 75,width = 20,height = 15
        Rectangle b = new Rectangle(50,27,20,15);
        printRectangle(b);
    }
    //create another merhod printRectangle
    public static void printRectangle(Rectangle z){
        //print it use printRectangle
        System.out.println(z);
    }
}
