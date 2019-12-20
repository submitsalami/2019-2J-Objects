
/**
 * クラス Ex4Ex5Ex6 の注釈をここに書きます.
 * 
 * @author (Nyein)
 * @version (18/10/2019)
 */
public class Ex4Ex5Ex6{
    //create method
    public static void main(String[]args){
        String name = "Clever Nyein";
        String newName = name.replace("Clever","Eaindra");
        System.out.println(newName);
        //print newSub
        String newSub = name.substring(7);
        System.out.println(newSub);
        
        char str ='r';
        int newIndex = name.indexOf(str);
        System.out.println(newIndex);
    }
}
