import java.awt.Rectangle;
public class day1220{
      public static void main(String[]args){
          Rectangle box = new Rectangle(2,5,20,10);
          System.out.println(new Rectangle(box));
          //create another rectangle box2
          
          Rectangle box2 = box;
          System.out.println(box2);
          //use .translatemethod
          box.translate(50,100);
          System.out.println("attributes of box after translate:" + box);
          System.out.println("attributes of box2 after translate:" + box2);
          
          
          
    
       }
}