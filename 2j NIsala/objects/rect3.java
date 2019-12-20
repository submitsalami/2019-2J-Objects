

/**
 * クラス rect2 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.awt.*;

public class rect3
{
    //create rectangle method
   public static Rectangle createRectangle(int x,int y,int width,int height){
       //give attribute for rectangle
    return new Rectangle(x,y,width,height);
    //call print method  
    //printRectangle(blank);
  }
  //make a method for print 
 /* public static void printRectangle(Rectangle a){
    System.out.print(a);
  }
  */
  
  public  static void main(String[]args){
     // call createRecangle method
   System.out.print(createRectangle(50,75,20,15)) ;
    
    }
  
    
    }
