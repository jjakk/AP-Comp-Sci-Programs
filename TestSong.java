/**
 * This class tests a Song 
 * Mrs. Westervelt
 * 9/27/16
 */
public class TestSong
{
  public static void main (String [] args)
  {
   Song john = new Song("Imagine","John Lennon",3.03); 
   Song frozen = new Song("Let It Go","Demi Lovato",3.47);
   Song oz = new Song("Somewhere Over the Rainbow","Judy Garland",2.55 );
   Song noArgs = new Song();
   
   System.out.println(john);
   System.out.println(frozen);
   System.out.println(oz);
   john.changeArtist("Lady Gaga");
   john.changeTitle("John Lennon's Imagine");
   john.changeLength(4);
   
   System.out.println("Artist: "+john.getArtist());
   System.out.println("Title: "+john.getTitle());
   System.out.println("Length: "+john.getLength());
   
   System.out.println(noArgs);
   
   
  }    
}

