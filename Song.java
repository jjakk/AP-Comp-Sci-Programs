/* This is a program to keep track of songs
 * John Khachian
 * 10/1/18
*/
public class Song{
  
  //Fields
  
  public String title;
  
  public String artist;
  
  public double length;
  
  //Constructor
  
  public Song(){
  
    title = null;
    
    artist = null;
    
    length = 0;
    
  }

  public Song(String t, String a, double l){
  
    title = t;
    
    artist = a;
    
    length = l;
  
  }
  
  //methods
  
  //Mutators
  
  public void changeTitle(String t){title = t;}
  public void changeArtist(String a){artist = a;}
  public void changeLength(double l){length = l;}
  
  //Accessors
  
  public String getTitle(){return title;}
  public String getArtist(){return artist;}
  public double getLength(){return length;}
  
  //toString
  
  public String toString(){return title + ", " + artist + ", " + length;}

}