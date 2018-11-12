
import java.util.Scanner;

public class Playlist{

  public static void main(String [] args){
    
    Scanner scan = new Scanner(System.in);
  
    Song [] songs = new Song[6];
    
    songs[0] = new Song("Imagine", "John Lennoln", 3.03);
    
    songs[1] = new Song("Let It Go", "Demi Lovato", 3.47);
    
    songs[2] = new Song("Somewhere Over the Rainbow", "Judy Garland", 2.55 );
    
    String title;
    
    String singer;
    
    double length;
    
    String blah;
    
    for(int i = 3; i < 6; i++){
    
      System.out.println("Enter a song title : ");
      
      title = scan.nextLine();
      
      System.out.println("Enter the singer : ");
      
      singer = scan.nextLine();
      
      System.out.println("Enter the length : ");
      
      length = scan.nextDouble();
      
      blah = scan.nextLine();
      
      songs[i] = new Song(title, singer, length);
      
      System.out.println(i);
    
    }
    
    for(int i = 0; i < 6; i++){
    
      System.out.println(songs[i]);
    
    }
  
  }

}