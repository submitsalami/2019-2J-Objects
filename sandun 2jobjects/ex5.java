package objects;
import java.awt.Point;

/**
 * クラス ex5 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex5{
   public static void printPoint(Point x){
      Point a= new Point(20,50);
      //System.out.println(a);
      System.out.println(x.x);
      System.out.println(x.y);
     
      

      
         }    
      public static void main(String[]args){
      Point x= new Point(20,50);
      
      //a.x=(20);
      //a.y=(50);
      printPoint(x);
      

   
   }
}