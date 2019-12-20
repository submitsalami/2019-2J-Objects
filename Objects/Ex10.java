
/**
 * クラス Ex10 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.awt.Rectangle;
public class Ex10{
    //create method called shiftBox
    //takes as parameters: a box, distanceRight, distanceUpwards
    public static void shiftBox(int x,int y,int width,int height){
        
        //shift the box
        Rectangle box = new Rectangle(x,y,width,height);
        System.out.println(box);
    }
    public static void main(String[]args){
        //rectangle objects
        int x = 7;
        int y = 30;
        int width = 23;
        int height = 5;
        //call shiftBox
        shiftBox(x,y,width,height);
        //create new Rectangle
        Rectangle box2 = new Rectangle(x,y,width,height);
        int a = box2.x+3;
        int b = box2.y+5;
        shiftBox(a,b,width,height);
    }
}
    
    