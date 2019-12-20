package objects;
import java.awt.Point;

/**
 * クラス ex3 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex3{
    public static void main(String[]args){
      Point a= new Point(10,5);
      System.out.println(a);
      System.out.println("The value of x"+a.x);
      System.out.println("The value of y"+a.y);
     
      a.x=(20);
      a.y=(50);
      System.out.println("X"+a.x);
      System.out.println("y"+a.y);
      
       }
    

   
}

