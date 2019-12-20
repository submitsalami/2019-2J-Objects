public class slength{
    public static void main(String[]args){
        String s = fruit("Banana");
        System.out.println(s);
    }
    public static String fruit (String s){
        
        String r = " ";
        for (int i = s.length()-1; i>=0; i--){
            r = r + s.charAt(i);
        }
        return r;
    }
}