/* 
 * Creates a song 
 * John Khachian
 * 10/1/2018
 */
import java.util.ArrayList;
public class Song{
   //fields
   String title; 
   String artist;
   double length;
   
   //constructors
   public Song(String t, String a, double l){
     title = t; 
     artist = a;
     length = l;
   }
   
   public Song(){
     title = null; 
     artist = null;
     length = 0;
   }
   
   //methods
   //acessor methods
   public String getTitle(){  return title;  }
   
   public String getArtist(){  return artist;  }
  
   public double getLength(){  return length;  }
   
   public String toString(){  return "\"" +title + "\" by " + artist + ", " + length;  }
   
   //mutator methods
   public void changeTitle (String t){  title = t;  }

   public void changeArtist (String a){  artist = a;  }

   public void changeLength (double l){  length = l;  } 
   
   public static ArrayList<Song> titleSort(ArrayList<Song> inputArry){
     
     int min = 0;
     
     int max = inputArry.size();
     
     ArrayList<Song> newArry = new ArrayList<Song>(inputArry.size());
   
     for(int i = 0; i < inputArry.size(); i++){
     
       if(i % 2 == 1){
       
         if(inputArry.get(i).getTitle().compareTo(inputArry.get(i - 1).getTitle()) > 0){
         
           newArry.set(i, inputArry.get(i));
           
           newArry.set(i - 1, inputArry.get(i - 1));
         
         }
       
       }
     
     }
     
     return newArry;
   
   }
   
 }
