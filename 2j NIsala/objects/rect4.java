

/**
 * クラス rect2 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.awt.*;

public class rect4
{
    Rectangle blank;
    //create rectangle method
   public static Rectangle createRectangle(int x,int y,int width,int height){
       //give attribute for rectangle
    Rectangle blank= new Rectangle(x,y,width,height);
    //call print method  
    return blank;
  }
  //make a method for print 
  public static void printRectangle(Rectangle a){
    System.out.print(a);
  }
  
  public  static void main(String[]args){
     // call createRecangle methodght
    //createRectangle(50,75,20,15) ;
    Rectangle Created = new createRectangle(50,75,20,15);
    System.out.println(findCenter(createRectangle(50,75,20,15),createRectangle.x,createRectangle.y));
    }
    public static Point findCenter(Rectangle blank,int x, int y){
            x = blank.x +(blank.width/2);
            y = blank.y +(blank.height/2);
    
               return new Point(x,y);
    }
    
}
    
  
    
   
