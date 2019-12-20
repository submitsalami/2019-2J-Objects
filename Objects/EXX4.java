/**
 * クラス EXX4 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/11/29)
 */
import java.awt.Point;
public class EXX4{
    public static void createPoint(int x,int y){
    Point a = new Point(x,y);
    a.x = 5;
    a.y = 5;
    printPoint(a);
    }
    public static void main(String[]args){
        int x = 4;
        int y = 4;
        createPoint(x,y);
        
    }
    public static void printPoint(Point b){
        System.out.print(b);
    }
}