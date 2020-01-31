
/**
 * Write a description of class Time2Client here.
 *
 * @author (Nyein)
 * @version (2020/1/24)
 */
public class Time2Client{
     public static void main(String[]args){
       Time2 time = new Time2(11,12,13.2);
       //Mutator or SETTERS(Change)
       time.setHour(10);
       time.setMinute(56);
       time.setSecond(6.5);
       System.out.println(time.getHour());
       //int result = time.getHour();
       //System.out.println(result);
       System.out.println(time.getMinute());
       System.out.println(time.getSecond());
    }
}

