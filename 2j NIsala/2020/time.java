
/**
 * クラス clock の注釈をここに書きます.
 * 
 * @author (Nisala)
 * @version (9-01-2020)
 */
public class time
{
   
    private int hour;
    private int minute;
    private double second;
    
   public time(int hour,int minute,double second){
    this.hour =hour;
    this.minute = minute;
    this.second =second;
    
    
    
   }
  public int getHour(){
     return this.hour;
    }
    public int getMinute(){
     return this.minute;
    }
    public double getSec(){
     return this.second;
    }
  

}
