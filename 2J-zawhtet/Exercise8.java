import java.awt.Rectangle;
public class Exercise8{
    public static void main(String[] args){
        //call create Rectangle
        System.out.println(createRectangle(20,80,20,15));
    }
    public static Rectangle createRectangle(int x, int y,int width,int height){
        return new Rectangle(x,y,width,height);
    }
}