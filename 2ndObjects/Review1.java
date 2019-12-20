
/**
 * Write a description of class Review1 here.
 *
 * @author (Pan Zun)
 * @version (2019/11/29)
 */
import java.awt.Point;
public class Review1
{
   public static void main(String[]args){
     //create a point coordinates(4,4)   
       int x = 4;
       int y = 4;
       createPoint(x,y);
    }
   //create a method (createPoint)
   //It takes two parameters x,y
   public static void createPoint(int x,int y){
      
       Point p = new Point(x,y);
       //change the attributes of your point to (5,5)
       p.x = 5;
       p.y = 5;
       printPoint(p);
    }
   //your point to amethod called printPoint which will print your point
   public static void printPoint(Point z){
        System.out.println(z);
    }
    
}
