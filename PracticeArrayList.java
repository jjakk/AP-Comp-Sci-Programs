
import java.util.ArrayList;

public class PracticeArrayList{

  public static void main(String [] args){
  
    ArrayList<String> nameList = new ArrayList<String>();
    
    nameList.add("bob");
    nameList.add("frank");
    nameList.add("larry");
    System.out.println("1. When larry added return true : " + true);
    System.out.println(nameList);
    System.out.println("2. Size : " + nameList.size());
    System.out.println("3. Adds two names at specific positions");
    nameList.add(0, "Moe");
    System.out.println("Moe at the beginnning : " + nameList);
    nameList.add(nameList.size()/2, "Bill");
    System.out.println("Bill in the middle : " + nameList);
    nameList.set(1, "michael");
    nameList.remove("Bob");
    System.out.println("4. Second name removed = bob\nSecond Changed : " + nameList);
    System.out.println("5. Tells second to last name : " + nameList.get(nameList.size() - 2));
    System.out.println("6. Removes middle name : " + nameList.get(nameList.size()/2));
    nameList.remove(nameList.get(nameList.size()/2));
    System.out.println(nameList);
  
  }

}