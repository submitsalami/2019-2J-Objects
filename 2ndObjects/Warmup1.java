
/**
 * Write a description of class Warmup1 here.
 *
 * @author (Pan Zun)
 * @version (2019/12/20)
 */
import java.awt.Rectangle;
public class Warmup1
{   public static void main(String[]args){
         int x = 2;
         int y = 5;
         int height = 10;
         int width = 20;
         box(x,y,width,height);
    }
    //Create a Rectangle object called box
    public static void box(int x,int y,int width,int height){
        Rectangle box = new Rectangle (x,y,width,height);
        System.out.println(box);
        //Create another Rectangle object called box 2
        Rectangle box2 = new Rectangle(x,y,width,height); 
        //Run the line of code box2 = box
        box2 = box;
        System.out.println(box2);
        //use the .translate method
        box.translate(50,100);
        //print your box object What does .translate do
        System.out.println(box);
        //4 Print box2 attritubes again
        System.out.println(box2);
    }
    
}
