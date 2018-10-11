/* This is a program to make digital people (basically a repost of Tron)
 * John Khachian
 * 10/5
*/

public class Person{

  //Fields
  
  private String name;
  
  private int inches;
  
  private int age;
  
  //Constructors
  
  public Person(String n){
  
    name = n;
    
    inches = 0;
    
    age = 0;
  
  }
  
  public Person(String n, int i, int a){
  
    name = n;
    
    inches = i;
    
    age = a;
  
  }
  
  //Methods
  
  //yearsTo100
  
  public String yearsTo100(){
  
    return "You will be 100 in " + (100 - age) + " years." ;
  
  }
  
  //inchesToFeet
  
  public String inchesToFeet(){
  
    return (inches/12 + " feet " + inches%12 + " inches");
    
  }
  
  //Mutators
  
  public void changeName(String n){name = n;}
  public void changeHeight(int i){inches = i;}
  public void changeAge(int a){age = a;}
  
  //Accessors
  
  public String getName(){return name;}
  public int getHeight(){return inches;}
  public int getAge(){return age;}
  
  //toString
  
  public String toString(){return name + ", " + inches + ", " + age;}

}