import java.awt.Rectangle;
public class Exercise7{
    //createRectangle method
    public static void createRectangle(int x,int y,int width,int height){
        Rectangle R = new Rectangle(50,75,20,15);
        printRectangle(R);
    }
    //crate printRectangle method
    public static void printRectangle(Rectangle P){
        System.out.println(P);
    }
    public static void main(String[] args){
        int x = 50;
        int y = 75;
        int width = 20;
        int height = 15;
        createRectangle(50,75,20,15);
    }
}