public class compoareTo{
    public static void main (String[]args){
        String name1 = "Ahmed Jisan";
        String name2 = "Ahmed Kalan";
        String name3 = "Ahmed Jisan";
        
        System.out.println("name1 and 2 :" + name1.compareTo(name2));
        System.out.println("name1 and 3 :" + name1.compareTo(name3));
        System.out.println("name2 and 3 :" + name2.compareTo(name3));
    }
}