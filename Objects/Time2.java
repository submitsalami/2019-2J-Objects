
/**
 * Write a description of class Time2 here.
 *
 * @author (Nyein)
 * @version (2020/1/24)
 */
public class Time2{
    //create a time
   private int hour;
   private int minute;
   private double second;

   // call public time
   public Time2(int hour,int minute,double second){
     this.hour = hour;
     this.minute = minute;
     this.second = second;
     
   }  
   
   public int getHour(){
       return this.hour;
   }
   public int getMinute(){
       return this.minute;
   }
   public double getSecond(){
       return this.second;
   }
   //Mutators OR SETTERS
   public void setHour(int hour){
        this.hour = hour;
    }
   public void setMinute(int minute){
        this.minute = minute;
    }
   public void setSecond(double second){
        this.second = second;
    }
}


