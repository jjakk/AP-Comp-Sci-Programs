import java.util.ArrayList;
public class WordList
{
  private ArrayList<String> myList;
  
  public WordList(String [] list)
  {
    myList = new ArrayList<String>(list.length);
    for(String word:list)
    {
      myList.add(word);
    }
  }
  
  
  public static void main(String[] args)
  {
    String [] list = {"cat","mouse","frog","dog", "duck","cow", "goat"};
    WordList animals = new WordList(list);
    System.out.println(animals.myList);
    System.out.println(animals.numWordsOfLength(4));
    System.out.println("Remove words of length 4");
    animals.removeWordsOfLength(4);
    System.out.println(animals.myList);  
  }
  
  public int numWordsOfLength(int len){
  
    int returnValue = 0;
    
    for(int i = 0; i < myList.size(); i++){
    
      if((myList.get(i)).length() == len){
      
        returnValue++;
      
      }
    
    }
    
    return returnValue;
  
  }
  
  public void removeWordsOfLength(int len){
  
    for(int i = 0; i < myList.size(); i++){
    
      if((myList.get(i)).length() == len){
      
        myList.remove(i);
        
        i--;
      
      }
    
    }
  
  }
  
}