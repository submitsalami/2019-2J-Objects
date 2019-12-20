import java.awt.Rectangle;
public class rectangleexercise2{
    public static Rectangle createRectangle(int x,int y , int width, int heigth){
        return new Rectangle(x,y,width,heigth);
    }
    
    public static void main(String[]args){
        System.out.println(createRectangle(20,80,20,15));
        
    } 
        
       
}