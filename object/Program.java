import java.util.Arrays;
 public class Program
{
    public static void main(String[] args) {
     String fruit = "Banana";
     
    System.out.println(Arrays.toString(histLetter(fruit)));
         
    }
     
    public static int[] histLetter (String s) {
       int[] hist = new int[26];
       String upperCasefruit = s.toUpperCase();
       for(int i = 0 ; i < upperCasefruit.length() ; i ++){
           int fruit = upperCasefruit.charAt(i);
           
          
           
           System.out.println(fruit);
       }
       return hist;
    }
    }
