public class exercise4{
    public static void main(String[]args){
        String fruit ="banana";
        System.out.print(pal(fruit));
    }
    public static String pal(String s){
        String r = "";
        for(int i = s.length()-1; i >=0; i--) {
           r= r + s.charAt(i);
       }
       return r;
    }
}