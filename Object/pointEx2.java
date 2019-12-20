import java.awt.Point;
public class pointEx2{
    //Create a method called createPoint
    //that takes two parameters x and y
    public static void createPoint(int x,int y){
        //use createPoint to create a point
        Point z = new Point(x,y);
        //using .x and .y change the x and y attributes
        z.x = 5;
        z.y = 5;
        
        printPoint(z);
    }
    //call createPoint in main method and pass arguments x and y 
    public static void main(String[]args){
        int x = 4;
        int y = 4;
        
        createPoint(x,y);
    }
    //create method called printPoint
    public static void printPoint(Point p){
        System.out.print(p);
    }
}