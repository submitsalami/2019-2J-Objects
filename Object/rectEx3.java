import java.awt.*;
public class rectEx3{
    public static Rectangle createRectangle(int x,int y,int w,int h){
        return new Rectangle(x,y,w,h);
    }
    public static void main (String[]args){
        System.out.print(createRectangle(20,80,20,15));
    }
}