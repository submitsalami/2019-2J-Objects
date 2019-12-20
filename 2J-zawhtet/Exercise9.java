//create abox
import java.awt.Rectangle;
public class Exercise9{
    public static void main(String[] args){
        //Rectangle R = new Rectangle(x2,y2);
        fineCenter(x2,y2);
    }
    // create a method called findcenter
    public static void fineCenter(int x1, int y1,int width,int heigth){
        int x2 = x1 + width/x1;
        int y2 = y1+ heigth/y1;
        System.out.print(x2,y2);
        
    }
}