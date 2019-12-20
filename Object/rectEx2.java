import java.awt.*;
public class rectEx2{
    public static void createRectangle(int x,int y,int w,int h){
        Rectangle one = new Rectangle(x,y,w,h);
        printRectangle(one);
    }
    public static void printRectangle(Rectangle z){
        System.out.print(z);
    }
    public static void main(String[]args){
        int x = 50;
        int y = 75;
        int w = 20;
        int h = 15;
        createRectangle(x,y,w,h);
    }
}