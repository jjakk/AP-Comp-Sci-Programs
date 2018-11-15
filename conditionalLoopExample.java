public class conditionalLoopExample
{
  public static String mixUp(String s)
  {
   for (int i = 0; i < s.length()-1; i++)
   {
    if (i%2 == 0)
      s = s.substring(0,i)+s.substring(i+1);
   }
   return s;
  }
  
  public static void main (String [] args)
  {
    String sample = "abcdefghijklmnopqrstuvwxyz";
    System.out.println(mixUp(sample));
    System.out.println(sample);
  }
}