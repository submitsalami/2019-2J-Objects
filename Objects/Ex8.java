
/**
 * クラス Ex8 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/12/6)
 */
import java.awt.Rectangle;
public class Ex8{
  //Create a method called createRectangle
    public static Rectangle createRectangle(int x,int y,int width,int height){
      return new Rectangle(x,y,width,height); 
      } 
    public static void main(String[]args){
        //takes a rectangle objects
        System.out.print(createRectangle(20,80,20,15)); 
    }  
}