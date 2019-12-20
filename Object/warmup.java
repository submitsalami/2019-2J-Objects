import java.awt.*;
public class warmup{
    //create rectangle object called box
    public static void box(int x,int y,int w,int h){
        Rectangle box = new Rectangle(x,y,w,h);
        System.out.println(box);
        //create another rectangle object called box2
        Rectangle box2 = new Rectangle(x,y,w,h);
        //run new code
        box2 = box;
        //print box2
        System.out.println(box2);
        //used translate method
        box.translate(50,100);
        //print box after translate
        //translate add value of x and y
        System.out.println("translated box :" + box);
        //print box2 again
        System.out.println(box2);
        /* box2 also changed values because 
        box2 reference box with the code box2=box */
    }
    public static void main(String[]args){
        box(2,5,20,10);
    }
}