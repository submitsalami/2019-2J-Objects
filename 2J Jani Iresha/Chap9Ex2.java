
/**
 * クラス Chap9Ex2 の注釈をここに書きます.
 * 
 * @author (jani)
 * @version (8/11/2019)
 */
import java.util.Arrays;
public class Chap9Ex2
{
    public static void main(String[]args){
        String fruit ="BaNAna";
        System.out.println(Arrays.toString(letterHist(fruit)));
    }
    
    public static int[]letterHist(String s ){
        //
        int[]histResult = new int[26];
        //converting
        String UpperCaseFruit = s.toUpperCase();
        for(int i = 0; i < s.length() ; i++){
            int character = UpperCaseFruit.charAt(i);//we get a single character
            int result = character - 65;
            histResult[result]++;
        
        }
        
        return histResult;
    
        
       
        
    
    
    
    }
        
    
    
    
    
    
    
}
