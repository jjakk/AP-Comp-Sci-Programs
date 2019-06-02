/**
 * This class tests a Song 
 * Mrs. Westervelt
 * 9/27/16
 */
import java.util.ArrayList;
public class SongTester
{
  public static void main (String [] args)
  {
    String [] songTitles = {"Imagine", "Let It Go", "Somewhere Over the Rainbow", "Bohemian Rhapsody",
      "Stairway to Heaven","Stressed Out"};
    String [] songArtists = {"John Lennon", "Demi Lovato", "Judy Garland", 
      "Queen", "Led Zeppelin","Twenty One Pilots"};
    double [] songLengths = {3.03,3.47, 2.55, 5.55, 8.02, 3.22};
   
    ArrayList<Song> songList = new ArrayList<Song> ();
    System.out.println("Original unsorted list");  
    for(int i = 0; i < songTitles.length; i++)
      {
        songList.add(new Song(songTitles[i], songArtists[i], songLengths[i]));
        System.out.println(songList.get(i));
    }
    
    ArrayList<String> titles = new ArrayList<String>();
    for(int i = 0; i < songTitles.length; i++){titles.add(songTitles[i]);}
    
    ArrayList<String> artists = new ArrayList<String>();
    for(int i = 0; i < songArtists.length; i++){artists.add(songArtists[i]);}
    
    ArrayList<Double> lengths = new ArrayList<Double>();
    for(int i = 0; i < songLengths.length; i++){lengths.add(songLengths[i]);}
    
    MySong newSongList = new MySong(titles, artists, lengths);
    
    System.out.println("\nSorted by Titles");
    
    newSongList.mergeSort("title");
    
    newSongList.printList();
    
    System.out.println("\nSorted by Artists");
    
    newSongList.mergeSort("artist");
    
    newSongList.printList();
    
    System.out.println("\nSorted by Song Lengths");
    
    newSongList.mergeSort("song length");
    
    newSongList.printList();
    
  }     
}
