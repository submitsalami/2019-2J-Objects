
/**
 * クラス person の注釈をここに書きます.
 * 
 * @author (nisala)
 * @version (9-1-2020)
 */

public class person
{
   
    private String name;
    private int age;
    private String phone;
    
     public person(String name,int age,String phone){
       
       this.name =name;
       this.age = age;
       this.phone =phone;
    
    
    
   }
    public String getName(){
     return this.name;
    }
    public int getAge(){
     return this.age;
    }
    public String getPhone(){
     return this.phone;
    }
   
   }
  