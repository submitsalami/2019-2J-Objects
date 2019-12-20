import java.awt.Point;
public class Exercises5{
     public static void main(String[]args){
         Point p = new Point(10,5);
         printPoint(p);
         
     }
     public static void printPoint(Point p){
        // Point blank = new Point(10,5);
        System.out.println(p.x + "," + p.y);
        }
     
}