import java.awt.Point;
import java.awt.Rectangle;
public class findcenter{
    //create find center
    public static void main(String[]args){
         
         System.out.println(findCenter(2,4,6,8));
     
    }
    //create findcenter method that take box object
    //return point object
    public static Point findCenter(int x,int y,int width ,int height){
        Rectangle box = new Rectangle(x,y,width,height);
        int a=box.x+width/2;
        int b=box.y+height/2;
        //return point
        return new Point(a,b);
    }
}