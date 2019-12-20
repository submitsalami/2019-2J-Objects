import java.awt.Point;
public class findingthedistance{
    //use a create point method and phythagorus theorem 
    
    public static void createPoint(Point p1,Point p2,Point p3){
       int a= p2.x - p1.x;
       int b= p3.y - p2.y;
       //sqrt a,b,c
       double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
       System.out.println(c);
    }
    public static void main(String[]args){
        //create 3point
        Point p1=new Point(3,2);
        Point p2=new Point(7,2);
        Point p3=new Point(7,5);
        createPoint(p1,p2,p3);
    }
    
    
}