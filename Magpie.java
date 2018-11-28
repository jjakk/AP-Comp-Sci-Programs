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
 public String getGreeting(){
  return "Hello, let's talk.";
 }
 
 public String prepareStatement(String statement){
   
   return (statement.trim()).toLowerCase();
   
 }
 
 /**
  * Gives a response to a user statement
  * @param statement the user statement
  * @return a response based on the rules given
  */
 public String getResponse(String statement){
  String response = "";
  //#1
  //call for #2
  
  if((statement.trim()).length() != 0){ 
    if (statement.indexOf("no") >= 0){
      response = "Why so negative?";
    }
    else if (statement.indexOf("mother") >= 0
               || statement.indexOf("father") >= 0
               || statement.indexOf("sister") >= 0
               || statement.indexOf("brother") >= 0)
    {
      response = "Tell me more about your family.";
    }
    else
    {
      response = getRandomResponse();
    }
    return response;
  }
  else{
    return "Say something please.";
  }
 }

 /**
  * Pick a default response to use if nothing else fits.
  * @return a non-committal string
  */
 private String getRandomResponse()
 {
  final int NUMBER_OF_RESPONSES = 4;
  int whichResponse = (int)(Math.random() * NUMBER_OF_RESPONSES);
  String response = "";
  
  if (whichResponse == 0)
  {
   response = "Interesting, tell me more.";
  }
  else if (whichResponse == 1)
  {
   response = "Hmmm.";
  }
  else if (whichResponse == 2)
  {
   response = "Do you really think so?";
  }
  else if (whichResponse == 3)
  {
   response = "You don't say.";
  }

  return response;
 }
 //method for #2
}
