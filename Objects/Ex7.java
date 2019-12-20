
/**
 * クラス Ex7 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/12/6)
 */
import java.awt.Rectangle;
public class Ex7{
    //Create a method called createRectangle
    public static void createRectangle(int x,int y,int width,int height){
      Rectangle R = new Rectangle(50,75,20,15); 
      printRectangle(R);
    }
    public static void main(String[]args){
        //takes a rectangle objects
        int x = 50;
        int y = 75;
        int width = 20;
        int height = 15;
       createRectangle(50,75,20,15); 
    }
    //called a printRectangle
    public static void printRectangle(Rectangle P){
       System.out.print(P);
    }
}
