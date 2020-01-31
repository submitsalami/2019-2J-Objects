
/**
 * Write a description of class Student here.
 *
 * @author (Nyein)
 * @version (2020/1/24)
 */
public class Student{
   private String firstName;
   private String lastName;
   private String studentNumber;
   private String eMail;
   private String country;

   public Student(String firstName,String lastName,String studentNumber,String eMail,String country){
          this.firstName=firstName;
          this.lastName=lastName;
          this.studentNumber=studentNumber;
          this.eMail =eMail;
          this.country=country;
   }
   public String getFirstName(){
          return this.firstName;
   }
   public String getLastName(){
          return this.lastName;
   }
   public String getStudentNumber(){
          return this.studentNumber;
   }
   public String getEMail(){
          return this.eMail;
   }
   public String getCountry(){
          return this.country;
   }
   public static void printStudent(Student S){
         System.out.println(S.firstName);
         System.out.println(S.lastName);
         System.out.println(S.studentNumber);
         System.out.println(S.eMail);
         System.out.println(S.country);
        }
   //Mutators OR SETTERS
   public void setFirstName(String firstName){
        this.firstName = firstName;
   }
   public void setLastName(String lastName){
        this.lastName = lastName;
   }
   public void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
   }
   public void setEmail(String eMail){
        this.eMail = eMail;
   }
   public void setCountry(String country){
        this.country = country;
   }
}

