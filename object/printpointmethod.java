import java.awt.Point;
public class printpointmethod{
    public static void main(String[]args){
         Point name = new Point(10,5);
         
         printpoint (name);
    }
    public static void printpoint(Point name){
        System.out.println(name.x);
        System.out.println(name.y);
    }
}