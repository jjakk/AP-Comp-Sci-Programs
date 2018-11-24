public class StringPractice{
  
  public static String dateOrder(String str){
    
    return  str.substring(3, 5) + "/" + str.substring(0, 2) + "/" + str.substring(6, str.length());
  
  }
  
  public static String convertName(String name){
  
    return (name.substring(name.indexOf(",") + 1, name.length())).replace(" ", "") + ", " + (name.substring(0, name.indexOf(",")));
  
  }
  
  public static void lastLongest(String sentence){
    
    String last = "";
    
    int spaces = 0;
    
    for(int i = 0; i < sentence.length(); i++){
    
      if(sentence.substring(i, i + 1) == " "){
        
        System.out.println(sentence.substring(i, i + 1));
      
        spaces++;
      
      }
    
    }
    
    String [] words = new String[spaces + 1];
    
    for(int i = 0; i < spaces; i++){
      
      words[i] = sentence.substring(0, sentence.indexOf(" "));
      
      sentence = sentence.substring(sentence.indexOf(" "), sentence.length());
      
    }
    
    for(int i = 0; i < words.length; i++){
    
      System.out.println(words[i]);
    
    }
  
    //return "Last in alphabet : " + sentence + "\n Most letters : " + sentence;
  
  }

  public static void main(String [] args){
  
    System.out.println(dateOrder("12/13/1800"));
    
    System.out.println(convertName("Khachian, John"));
    
    lastLongest("Hello my name is john");
  
  }

}