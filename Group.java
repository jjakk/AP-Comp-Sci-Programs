import java.util.ArrayList;
public class Group{

  private ArrayList <Student> groupList;
  
  public Group(String people){
  
    groupList = new ArrayList <Student> ();
    
    boolean last = false;
    
    int space = people.indexOf(" ");
    
    String next;
    
    do{
    
      if(space < 0){
      
        space = people.length();
        
        last = true;
      
      }
      
      next = people.substring(0, space);
      
      groupList.add(findPlace(next), new Student(next));
      
      //System.out.println(groupList);
      
      if(!last){
        
        people = people.substring(space + 1);
        
      }
        
        space = people.indexOf(" ");
    
    }while(!last);
  
  }
  
  public ArrayList<Student> getGroupList (){return groupList;}
  
  public int findPlace(String n){
    
    return 0;
    
  }
  
  public void printList(){
    
    //This is a sequental search
    
    for(Student current : groupList){
    
      System.out.print(current + " ");
      
      /*if(current.getName().equals("Danny")){
      
        System.out.println("I found danny");
        
        break;
      
      }*/
    
    }
    
  }
  
  public boolean sequentialSearch(String n){
  
    for(Student current : groupList){
      
      if(current.getName().equals(n)){
      
        return true;
      
      }
    
    }
    
    return false;
  
  }

}