
/**
 * クラス Exe4 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (2019/11/1)
 */
public class Exe4{
    //create method
    public static void main(String[]args){
     String fruit = "banana";
     System.out.println(NN(fruit));
    }
     public static String NN(String s){
    String r = "";
    for(int i = s.length()-1; i >=0; i--){
        r= r + s.charAt(i);
    }
    return r;
    }
   }   


