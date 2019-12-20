package objects;
import java.awt.Point;

/**
 * Write a description of class ex8 here.
 *
 * @author (sandun)
 * @version (2019/9/29)
 */
public class ex8
{//use createpoint method 
   public static void creatPoint(Point p1,Point p2,Point p3){
     //using pythagos low calculate the distance
     //find your a
       int a =p2.x -p1.x;
     //find your b
       int b =p3.y -p2.y;
     //square a and square b
     double c =Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
       System.out.print(c);
       
       
    
    }
   public static void main(String[]args){
     //making three point objects
     Point p1 =new Point(3,2);
     Point p2 =new Point(7,2);
     Point p3 =new Point(7,5);
     creatPoint(p1,p2,p3);
    
    }
}
