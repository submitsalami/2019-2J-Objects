public class ex4and5and6{
    public static void main(String[]args){
        String name ="handsome salami";
        String newName = name.replace("salami","Phyoe");
        System.out.println(newName);
        
        String newSub = name.substring(9);
        System.out.println(newSub);
        
        char str = 'm';
        int newIndex = name.indexOf(str);
        System.out.println(newIndex);
    }
}