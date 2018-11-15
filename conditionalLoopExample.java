<<<<<<< HEAD
public class conditionalLoopExample
{
  public static String mixUp(String s)
  {
   for (int i = 0; i < s.length()-1; i++)
   {
=======
public class conditionalLoopExample{
  public static String mixUp(String s){
   for (int i = 0; i < s.length()-1; i++){
>>>>>>> 9fb8faaa0d806f05ad2eb871076bdbda66eead15
    if (i%2 == 0)
      s = s.substring(0,i)+s.substring(i+1);
   }
   return s;
  }
  
<<<<<<< HEAD
  public static void main (String [] args)
  {
    String sample = "abcdefghijklmnopqrstuvwxyz";
    System.out.println(mixUp(sample));
    System.out.println(sample);
=======
  public static String otherFunction(String s){
    
   while(s.length() < 30){
       
       s += "*";
     
   }
   
   if(s.length() == 30){
   
     return s;
     
  }
   else{
   
     return "Other";
   
   }
    
  }
  
  public static void main (String [] args){
    String sample = "abcdefghijklmnopqrstuvwxyz";
    System.out.println(mixUp(sample));
    System.out.println(sample);
    System.out.println(otherFunction(sample));
>>>>>>> 9fb8faaa0d806f05ad2eb871076bdbda66eead15
  }
}