public class HiddenWord{

  String word = "";
  
  String guess = "";
  
  String output = "";
  
  public HiddenWord(String w){
  
    word = w;
  
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
  
    System.out.println(puzzle.guessHint("HELLO"));
  
  }

}