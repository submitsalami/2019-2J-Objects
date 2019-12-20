import java.awt.*;
public class rectEx5{
    //create method called shiftbox
    public static void box(int x,int y,int w,int h){
        Rectangle box = new Rectangle(x,y,w,h);
        System.out.println("Original value of box : " + box);
        
    }
    //let shift the box
    public static void shiftbox(int x,int y,int w,int h){
         //to shift the box add value
         Rectangle p = new Rectangle(x,y,w,h);
        int x =x + 3;
        int y =y + 5;
        //a and b will be new value of x and y;
        
        
        System.out.print("new box : " + p);
    }
    public static void main (String[]args){
        int x = 7;
        int y = 30;
        int w = 23;
        int h = 5;
        box(x,y,w,h);
        shiftbox(x,y,w,h);
    }
}