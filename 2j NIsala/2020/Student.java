
/**
 * クラス student の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Student
{
   private String fName ;
   private String lName;
   private int stNumb ;
   private String email ;
   private String country ;
   public Student(String fName,String lName,int stNumb,String email,String country){
    this.fName =fName;
    this.lName =lName ;
    this.stNumb =stNumb ;
    this.email= email;
    this.country = country;
    
    }
    public String getFName(){
     return this.fName;
    }
    public String getLName(){
     return this.lName;
    }
    public int getstNumb(){
     return this.stNumb;
    }
    public String getEmail(){
     return this.email;
    }
    public String getCountry(){
     return this.country;
    }
   
}
