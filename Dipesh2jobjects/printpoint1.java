
/**
 * クラス printpoint の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.awt.Point;
public class printpoint1{
    
    //need your main method
        public static void main(String[]args){
          Point n= new Point(20,50);
          printPoint(n);
        }
    public static void printPoint(Point n){
       System.out.println(n.x);
       System.out.println(n.y);
    }
}
