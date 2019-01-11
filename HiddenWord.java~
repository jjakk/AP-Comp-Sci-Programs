public class HiddenWord{

  String word = "";
  
  String guess = "";
  
  String output = "";
  
  public HiddenWord(String w){
  
    word = w;
  
  }
  
  public static String scrambleWord(String w){
    
    String word = w;
    
    String newWord = "";
    
    int as = 0;
    
    if(word.indexOf("A") >= 0){
    
      if(!word.substring(word.indexOf("A") - 1, word.indexOf("A")).equals("A") && !word.substring(word.indexOf("A") + 1, word.indexOf("A") + 2).equals("A")){
      
        newWord = word.substring(0, word.indexOf("A")) + word.substring(word.indexOf("A") + 1, word.indexOf("A") + 2) + "A" + word.substring(word.indexOf("A") + 2, word.indexOf("A") + 3);
      
      }
    
    }
    
    if(word.indexOf("AA") >= 0){
    
      if(!word.substring(word.indexOf("AA") + 2, word.indexOf("AA") + 3).equals("A")){
      
        newWord = word.substring(0, word.indexOf("AA") + 1) + word.substring(word.indexOf("AA") + 2, word.indexOf("AA") + 3) + "A" + word.substring(word.indexOf("AA") + 3);
      
      }
    
    }
    
    for(int i = 0;i < word.length(); i++){
    
    }
    
    return newWord;
    
  }
  
  public String guessHint(String g){
    
    boolean caught = false;
  
    guess = g;
    
    if(word.length() != guess.length()) return "Not the same amount of characters";
    
    for(int i = 0; i < word.length(); i++){
      
      caught = false;
    
      if(word.substring(i, i + 1).equals(guess.substring(i, i + 1))){
      
        output += word.substring(i, i + 1);
        
        caught = true;
        
      }
      
      else{
      
        for(int j = 0; j < guess.length(); j++){
        
          if(word.substring(j, j + 1).equals(guess.substring(i, i + 1))){
          
            output += "+";
            
            caught = true;
          
          }
        
        }
      
      }
      
      if(!caught) output += "*";
    
    }
    
    return output;
  
  }
  
  public static void main(String [] args){
    
    HiddenWord puzzle = new HiddenWord("HARPS");
  
    System.out.println(scrambleWord("fwjefiowejofijAANefjwioefjo"));
  
  }

}