import java.awt.Rectangle;
public class rectangleexercise1{
    public static void main(String [] args){
        int x=50;
        int y=75;
        int width=20;
        int heigth=15;
        
        System.out.println(x + " " + y +" "+ width +" "+ heigth);
        
    }
    public static void createRectangle(int x,int y , int width, int heigth){
        Rectangle name = new Rectangle(50,75,20,15);
        printRectangle(name);
    }
    public static void printRectangle(Rectangle name){
        System.out.println(name);
    }
    
}