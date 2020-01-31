
/**
 * Write a description of class Person here.
 *
 * @author (nyein)
 * @version (2020/1/10)
 */
//create a person class
public class Person{
   private String name;
   private int age;
   private String phoneNumber;
   
   //call public person
   public Person(String name,int age,String phoneNumber){
       this.name = name;
       this.age = age;
       this.phoneNumber =phoneNumber;
       
   }
   public String getName(){
       return this.name;
   }
   public int getAge(){
       return this.age;
   }
   public String getPhoneNumber(){
       return this.phoneNumber;
   }
   public static void printPerson(Person P){
        System.out.println(P.name);
        System.out.println(P.age);
        System.out.println(P.phoneNumber);
    }
   //Mutators OR SETTERS
   public void setNmae(String name){
        this.name = name;
    }
   public void setAge(int age){
        this.age = age;
    }
   public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}
