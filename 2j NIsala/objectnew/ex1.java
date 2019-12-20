
/**
 * クラス ex1 の注釈をここに書きます.
 * 
 * @author (nisala)
 * @version (20-12)
 */
    
import java.awt.*;
public class ex1
{


   public static void main (String[]args){
    
      //create reactangle
      Rectangle box=new Rectangle(2,5,10,20);
      //print box
      System.out.println(box);
      //box2 rectangle
      Rectangle box2=box;
      //print box2
      System.out.println(box2);
      //use tranlate
      box.translate(50,100);
      //print box after translate
      System.out.println(box);
      //print box2 after translate
      System.out.println(box2);
      
    
    
    }
}