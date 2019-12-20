
/**
 * クラス ex2 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.awt.Point;
public class ex2{
   public static void main(String[] args){
     Point p = new Point(30,50);
     printPoint(p);  
   }
   
   public static void printPoint(Point p){
        System.out.println("The Value of X:" +p.x);
        System.out.print("The Value of Y:" +p.y);
   }
   
}