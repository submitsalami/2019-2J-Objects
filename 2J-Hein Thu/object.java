
/**
 * クラス object の注釈をここに書きます.
 * 
 * @author (Hein Thu)
 * @version (2019/11/22)
 */
import java.awt.Point;
public class object{
    public static void main(String[] args){
      Point x = new Point(10,5);
      System.out.println(x); 
      
      x.x = 20;
      x.y = 50;
      System.out.println(x);
      System.out.print("("+x.x + "," + x.y +")");
    }
}