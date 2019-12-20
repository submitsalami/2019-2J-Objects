
/**
 * クラス Ex9 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * -
 * @version (2019/12/6)
 */
import java.awt.Point;
import java.awt.Rectangle;
public class Ex9{
    //called findCenter
    public static Point findCenter(int x,int y,int width,int height){
       Rectangle box = new Rectangle(x,y,width,height);
       //find x
       int x2 = box.x+width/2;
       //find y
       int y2 = box.y+height/2;
       //return a point
       return new Point(x2,y2);
    }
    public static void main(String[]args){
        System.out.print(findCenter(20,30,45,20));
    }
}
