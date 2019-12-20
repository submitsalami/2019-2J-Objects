import java.awt.Rectangle;
public class exercisebox{
    public static void Rectangle(int x,int y,int  width,int height){
       
        //create a Rectangle object called box
        Rectangle box= new Rectangle(x,y,width,height);
        //print the box object
        System.out.println(box);
        //create another box
        Rectangle box2=new Rectangle(x,y,width,height);
        box2=box;
        System.out.println(box2);
        //then use .translte method on box object 
         box.translate(50,100);
         //print box to see what translate does?
         System.out.println(box);
         //print box2 again to see any change
         System.out.println(box2);
    }
    public static void main(String[]args){
        int x=50;
        int y=75;
        int width=20;
        int heigth=15;
        
        System.out.println(x + " " + y +" "+ width +" "+ heigth);
        
    }
}