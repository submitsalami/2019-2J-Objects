

/**
 * クラス ex3 の注釈をここに書きます.
 * String traversal
 * @author (nisala)
 * @version (25-10-2019)
 */
public class ex4{
    public static void main(){
    String name;
    name ="nisal";
    System.out.print(n(name));
    
   }
    
    
   public static String n(String name){
    String r;
       r= "";
    for (int i=name.length()-1;i>=0;i--){

        r =r+name.charAt(i);
        
    }
     return r;
   }
   
}