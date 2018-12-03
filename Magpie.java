/**
 * A program to carry on conversations with a human user.
 * @author Laurie White
 * This is a revision of the version of April 2012
 */
public class Magpie{
 //Note: no fields or constructors
 /**
  * Get a default greeting  
  * @return a greeting
  */
  
  String name;
  
  public void setName(String n){
  
    name = n;
    
  }
 public String getGreeting(){
   
  return "Hello, let's talk.";
  
 }
 
 /**
  * Gives a response to a user statement
  * @param statement the user statement
  * @return a response based on the rules given
  */
 
 public static String findKeyWord(String statement){
   
   statement = statement.trim();
   
   String part = "";
   
   statement = statement.replace(".", "");
   
   statement = statement.replace(",", "");
   
   statement = statement.replace("?", "");
 
   if(statement.indexOf("no") >= 0){
   
     if(statement.indexOf("no") == 0){
     
       if(statement.substring(statement.indexOf("no")+1, statement.indexOf("no") +2) == " "){
       
         return "Why so negative?";
       
       }
       
       else return "";
     
     }
     
     else if(statement.indexOf("no") + 2 == statement.length()){
     
       if(statement.substring(statement.indexOf("no") - 1, statement.indexOf("no")) == " "){
         
         return "Why so negative?";
         
       }
       
       else return "";
     
     }
     
     else{
     
       return "";
     
     }
   
   }
   
   else return "";
 
 }
 
 private String checkFamily(String statement){
 
   String [] family = {"mother", "father", "sister", "brother", "cousin"};
   
   String response = "";
   
   for(String i : family){
   
     if (statement.indexOf(i) >= 0){
       response = "Tell me more about your family.";
     }
     
   }
   
   return response;
 
 }
 
 private String checkPets(String statement){
 
   String [] family = {"dog", "cat", "fish", "parrot"};
   
   String response = "";
   
   for(String i : family){
   
     if (statement.indexOf(i) >= 0){
       response = "Tell me more about your pet.";
     }
     
   }
   
   return response;
 
 }
 
 private String checkHobby(String statement){
 
   String [] family = {"sports", "programming", "video games", "tv"};
   
   String response = "";
   
   for(String i : family){
   
     if (statement.indexOf(i) >= 0){
       response = "Tell me more about your hobbies.";
     }
     
   }
   
   return response;
 
 }
 public String getResponse(String statement){
  String response = "";
  //#2
  prepareStatement(statement);
  
  if((statement.trim()).length() != 0){ 
    if (statement.indexOf("no") >= 0){
      response = "Why so negative?";
    }    
    response = checkFamily(statement);
    if(response != "") return response;
    response = checkPets(statement);
    if(response != "") return response;
    response = checkHobby(statement);
    if(response != "") return response;
    response = findKeyWord(statement);
    if(response != "") return response;
    if(response == "") response = getRandomResponse();
    return name + ", " + response;
  }
  else{
    return "Say something please.";
  }
 }

 /**
  * Pick a default response to use if nothing else fits.
  * @return a non-committal string
  */
 private String getRandomResponse(){
  final int NUMBER_OF_RESPONSES = 10;
  int whichResponse = (int)(Math.random() * NUMBER_OF_RESPONSES);
  String response = "";
  
  String [] responses = {"Interesting, tell me more.", "Hmmm.", "Do you really think so?",
  "You don't say.", "I for one welcome our new omnic overloards", "My name is Jeph", "The legend27",
  "Do it", "The meaning of life the universe and everything is 42", "Pc is superior to console"};
  
  response = responses[whichResponse];

  return response;
 }
 private String prepareStatement(String statement){
   
   return (statement.trim()).toLowerCase();
   
 }
}
