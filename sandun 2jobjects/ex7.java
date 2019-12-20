package objects;
import java.awt.Point;    
    
    /**
     * Write a description of class creatpoint here.
     *
     * @author (sandun)
     * @version (2019/11/29)
     */
    

    public class ex7{ 
          //creat main methodandtakes two parameters
    public static void creatPoint(int x,int y){
      //use to creat point to creat point
         Point s= new Point(x,y);
        //using x and y change the x and y attributes of your point
        s.x=5;
       s.y=5;
      printPoint(s);
      
      

      
        } 
        //creatPoint in main method and pass aragument to creat following point
    
        public static void main(String[]args){
      
      int x=4;
      int y=4;
      creatPoint(x,y);
    }
    //creat method called printpoint
     public static void printPoint(Point s){
        System.out.print(s);
        } 
     
}   
      

   
    
 

