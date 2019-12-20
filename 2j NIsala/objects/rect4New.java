
/**
 * クラス point の注釈をここに書きます.
 * 
 * @author (nisala)
 * @version (12-13)
 */
import java.awt.*;

public class rect4New{
              
   
    //create rectangle method
       public static Rectangle createRectangle(int x,int y,int width,int height){
       //give attribute for rectangle
    Rectangle blank= new Rectangle(x,y,width,height);
    //call print method  
    return blank;
  }
    public static Point findCenter(Rectangle baka,int a ,int b){
    a = baka.x +(baka.width/2);
   b = baka.y +(baka.height/2);
    return new Point(a,b);
    }
    public static void main(String []args){
       Rectangle box =createRectangle(10,20,50,40);
   System.out.print(findCenter(box,box.x,box.y));
    
    }
    
    }
    






    
    