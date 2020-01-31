
/**
 * Write a description of class Time here.
 *
 * @author (Nyein)
 * @version (2020/1/10)
 */
//create a time
public class Time{
   private int hour;
   private int minute;
   private double second;

   // call public time
   public Time(int hour,int minute,double second){
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
   public static void printTime(Time T){
       System.out.print(T.hour);
       System.out.print(":");
       System.out.print(T.minute);
       System.out.print(":");
       System.out.print(T.second);
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

