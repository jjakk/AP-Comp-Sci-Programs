import java.util.ArrayList;
import java.util.List;

public class StringFormatter{
  
  public static int totalLetters(List<String> wordlist){
    
    int total = 0;
    
    for(int i = 0; i < wordlist.size(); i++){
    
      total += wordlist.get(i).length();
    
    }
    
    return total;
    
  }
  
  public static int basicGapWidth(List<String> wordlist, int formattedLen){
  
    return (formattedLen - totalLetters(wordlist))/wordlist.size();
  
  }
  
  public static int leftoverSpaces(List<String> wordlist, int formattedLen){
  
    return formattedLen - totalLetters(wordlist);
  
  }
  
  public static String format(List<String> wordlist, int formattedLen){
  
    String newStr = "";
    
    for(int i = 0; i < wordlist.size(); i++){
    
      newStr += wordlist.get(i);
      
      for(int j = 0; j < basicGapWidth(wordlist, formattedLen); j++){
      
        newStr += " ";
      
      }
    
    }
    
    return newStr;
  
  }
  
}