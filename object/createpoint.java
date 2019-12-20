import java.awt.Point;
public class createpoint{
    //create a createpoint method
    //it take two parameter x,y
    public static void createPoint(int x,int y){
        Point name= new Point(x,y);
        
    }

    public static void main(String[]args){
        Point name= new Point(4,4);
         name.x=5;
         name.y=5;
       
       printPoint(name);
    }
    public static void printPoint(Point name){
        System.out.println("("+ name.x + ","+ name.y +")");
    }
}    