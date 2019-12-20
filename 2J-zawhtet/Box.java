
/**
 * クラス Box の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.awt.Rectangle;
public class Box{
    public static void main(String[] args){
      Rectangle box = new Rectangle(2,3,10,20);
      System.out.println("Attributes of box : \n" + box);
      Rectangle box2;
      box2 = box;
      System.out.println("Attributes of box2 : \n" + box2);
      box.translate(50,100);
      System.out.println("Attributes of box after using translate : \n" + box);
      System.out.println("Attributes of box2 after using translate : \n" + box2);
    }
}