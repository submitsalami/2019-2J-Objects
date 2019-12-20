import java.awt.Rectangle;
public class return1{
    public static void main(String[]args){
          Rectangle box = new Rectangle(50,75,20,15);
         
           printRectangle(box);
        }
        //create a method called createRECTANGLE it take x  y ,WIDTH,HEIGHT
    public static Rectangle createRectangle(int x, int y, int width, int height){
        //use createRectangle to create your Rectangle. 
        Rectangle box = new Rectangle(x,y,width,height);
       //pass printRectangle to PrintRectangle Method 
       return box;
       //printRectangle(box);      
    } 
    //create print 
        public static void printRectangle(Rectangle box){
            // print rectangle
         System.out.println(box);  
         
         
     }
 }