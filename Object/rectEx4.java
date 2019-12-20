import java.awt.*;
public class rectEx4{
    public static Point findCenter(int x1,int y1,int x2,int y2){
        Point a = new Point(x1,y1);
        Point b = new Point(x2,y1);
        Point c = new Point(x2,y2);
        Point d = new Point(x1,y2);
        
        int A = d.y-a.y;
        int B = c.x-a.x;
        
        int halfOfA = A/2;
        int halfOfB = B/2;
        
        return new Point(halfOfA,halfOfB);
    }
    
    public static void main(String[]args){
        System.out.print(findCenter(0,0,8,4));
    }
}