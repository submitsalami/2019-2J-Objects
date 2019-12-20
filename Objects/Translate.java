
/**
 * クラス Translate の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/12/20)
 */
import java.awt.*;
public class Translate{
    //create a rectangle object called box
    public static void box(int x,int y,int width,int height){
        Rectangle box = new Rectangle(x,y,width,height);
        System.out.println(box);
        //create another rectangle object called box2
        Rectangle box2 = new Rectangle(x,y,width,height);
        //create new code
        box2 = box;
        System.out.println(box2);
        //use .translate method
        box.translate (50,100);
        //print box object
        System.out.println(box);
        //print box2 again
        System.out.println(box2);
    }
    // call main mathod
    public static void main(String[]args){
        int x = 2;
        int y = 5;
        int width = 20;
        int height = 10;
        box(x,y,width,height);
    }
}
