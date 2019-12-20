






/**
 * クラス point の注釈をここに書きます.
 * 
 * @author (nisala)
 * @version (11-22)
 */
import java.awt.*;
public class pythogrs

{
   //create a method called  create point with two para paramenteersd x y 
     public static  void  createPoint( Point p1,Point p2,Point p3){
         //find a 
         int a = p2.x-p1.x;
         //find b
         int b = p3.y-p2.y;
         //calculate the distance
         
        double c =Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        //print the result    
        System.out.print(c);
        
         
         
    }
    public static void main (String[]args){
          
        //creat the points
        Point p1 = new Point(3,2);
          Point p2 = new Point(7,2);
          Point p3 = new Point(7,5);
         //call the createPoint method
            createPoint(p1,p2,p3);
        
         
    
    }
    
    
    
}

    