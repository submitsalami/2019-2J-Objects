public class equal{
    public static void main(String[]args){
        String name1 = "apple A";
        String name2 = "apple B";
        String name3 = "apple A";
        boolean isEqual1 = name1.equals(name2);
        boolean isEqual2 = name1.equals(name3);
        boolean isEqual3 = name2.equals(name3);
        System.out.println(isEqual1);
        System.out.println(isEqual2);
        System.out.println(isEqual3);
    }
}