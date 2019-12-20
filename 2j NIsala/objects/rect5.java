
/**
 * クラス rec5 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.awt.*;

public class rect5
{
    //create  ractangle
     public static Rectangle createRectangle(int x,int y,int width,int height){
       //give attribute for rectangle
    Rectangle blank= new Rectangle(x,y,width,height);
    //call print method  
    return blank;
     }
     //create the start points to shift
   public static void shift(Rectangle  blank,int a, int b){
    blank.x=blank.x+a;
    blank.y=blank.y+b;
    
    //return  new Point(a,b);
    }
     public static void main(String[]args){
  
     Rectangle box =createRectangle( 7,30,23,5);
     //print thw original rectangle
     System.out.println("original  : "+createRectangle( 7,30,23,5));
     //call shift method
     shift(box,3,5);
     //print the shifted rectangle
      System.out.println("shifted  : "+box);

  }
  }