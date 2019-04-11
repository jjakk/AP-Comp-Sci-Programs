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
  
  int place = 0;
  
  public int findPlace(String n){
    
    for(place = 0 ; place < groupList.size(); place++){
    
      if(n.compareTo(groupList.get(place).getName()) < 0){
      
        return place;
      
      }
    
    }
    
    return place;
    
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
  
  public int binarySearch(String n){
    
    int left = 0;
    
    int right = groupList.size();
    
    int middle = (right + left)/2;
    
    String next;
    
    while(left < right){
      
      middle = (right + left)/2;
    
      System.out.print("Left : " + left + " Right : " + right + " ");
      
      next = groupList.get(middle).getName();
      
      if(n.compareTo(next) < 0){
      
        right = middle;
      
      }
      
      else if(n.compareTo(next) > 0){
      
        left = middle + 1;
      
      }
      
      else{
      
        return middle;
      
      }
    
    }
  
    return -1;
  
  }
  
  public void mixedUp(){
    
    ArrayList <Student> tempList = new ArrayList<Student>();
  
    int source;
    
    for(int i = 0; i < groupList.size(); i++){
    
      tempList.add(groupList.get(i));
    
    }
    
    for(int i = 0; i < groupList.size(); i++){
    
      source = (int) ((Math.random() * (groupList.size() - 2)) + 1);
                      
      tempList.set((source - 1), groupList.get(source));
                      
      tempList.set(source, groupList.get(source - 1));
    
    }
    
    for(int i = 0; i < tempList.size(); i++){
    
      groupList.set(i, tempList.get(i));
    
    }
  
  }

}