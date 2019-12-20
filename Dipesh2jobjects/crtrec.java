
/**
 * クラス crtrec の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.awt.Rectangle;
public class crtrec{
    public static void main(String[]args){
          //Rectangle box = new Rectangle(50,75,20,15);
          int x =50;
          int y = 75;
           int width = 20;
           int height = 15;          
          createRectangle(x,y,width,height);
        }
        //create a method called createRECTANGLE it take x  y ,WIDTH,HEIGHT
    public static void createRectangle(int x, int y, int width, int height){
        //use createRectangle to create your Rectangle. 
        Rectangle box = new Rectangle(x,y,width,height);
       //pass printRectangle to PrintRectangle Method 
       printRectangle(box);      
    } 
    //create print 
        public static void printRectangle(Rectangle box){
            // print rectangle
         System.out.println(box);  
         
         
     }
 }