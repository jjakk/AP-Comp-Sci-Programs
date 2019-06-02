
import java.util.ArrayList;

public class MySong{
  
  ArrayList<Song> songs = new ArrayList<Song>();

  public MySong(ArrayList<String> t, ArrayList<String> a, ArrayList<Double> l){
  
    for(int i = 0; i < t.size(); i++){
    
      songs.add(new Song(t.get(i), a.get(i), l.get(i)));
    
    }
  
  }
  
  public void printList(){
  
    for(int i = 0; i < songs.size(); i++){
    
      System.out.println(songs.get(i));
    
    }
  
  }
  
  public void mergeSort(String target){
  
    if(target.equals("title")){
    
      String [] temp = new String[songs.size()];
      
      for(int i = 0; i < temp.length; i++){
      
        temp[i] = songs.get(i).getTitle();
      
      }
      
      stringMergeSort(temp);
      
      for(int i = 0; i < temp.length; i++){
      
        songs.get(i).changeTitle(temp[i]);
      
      }
    
    }
    
    else if(target.equals("artist")){
    
      String [] temp = new String[songs.size()];
      
      for(int i = 0; i < temp.length; i++){
      
        temp[i] = songs.get(i).getArtist();
      
      }
      
      stringMergeSort(temp);
      
      for(int i = 0; i < temp.length; i++){
      
        songs.get(i).changeArtist(temp[i]);
      
      }
    
    
    }
    
    else if(target.equals("song length")){
    
      double [] temp = new double[songs.size()];
      
      for(int i = 0; i < temp.length; i++){
      
        temp[i] = songs.get(i).getLength();
      
      }
      
      doubleMergeSort(temp);
      
      for(int i = 0; i < temp.length; i++){
      
        songs.get(i).changeLength(temp[i]);
      
      }
    
    }
    
    else{}
  
  }
  
  public static void doubleMergeSort(double [] elements)
  {
    int n = elements.length;
    double [] sortedNums = new double [n];
    mergeSortHelper(elements, 0, (n-1),sortedNums);
  }
  //sorts elements[from] ... elements[to] inclusive into ascending order
  private static void mergeSortHelper (double [] elements, int from, int to, double [] sn)
  {
    if(from < to)
    {
      int middle = (from + to)/2;
      mergeSortHelper(elements, from, middle, sn);      //sorts bottom half
      mergeSortHelper(elements, middle + 1, to, sn);    //sorts top half
      merge(elements, from, middle, to, sn);            //combines two sorted halves 
    }
  }
  //merges two sorted arrays into one array that is sorted into ascending order
  public static void merge (double [] elements, int from, int mid, int to, double [] temp)
  {
    int i = from; 
    int j = mid + 1; 
    int k = from;
    
    //inserts elements into temp in sorted order taking from each half of array 
    //until only one half has numbers not processed
    while( i <= mid && j <= to)
    {
      if (elements[i] < elements[j])
      {
        temp[k] = elements[i];
        i++;
      }
      else
      {
        temp[k] = elements[j];
        j++;
      }
      k++;
    }
    //copy the tail of first half, if any, into temp
    while (i <= mid)
    {
      temp[k] = elements[i];
      i++;
      k++;
    }
    //copy the tail of the second half, if any, into temp
    while (j <= to)
    {
      temp[k] = elements[j];
      j++;
      k++;
    }
    //copies temp back into elements
   for(k = from; k <= to; k++)
    {
       elements[k] = temp[k];
    }
  }
  
  
  
  
  //Merge Sort for Strings
  
  
  
  
  public static void stringMergeSort(String [] elements)
  {
    int n = elements.length;
    String [] sortedNums = new String [n];
    stringMergeSortHelper(elements, 0, (n-1),sortedNums);
  }
  //sorts elements[from] ... elements[to] inclusive into ascending order
  private static void stringMergeSortHelper (String [] elements, int from, int to, String [] sn)
  {
    if(from < to)
    {
      int middle = (from + to)/2;
      stringMergeSortHelper(elements, from, middle, sn);      //sorts bottom half
      stringMergeSortHelper(elements, middle + 1, to, sn);    //sorts top half
      stringMerge(elements, from, middle, to, sn);            //combines two sorted halves 
    }
  }
  //merges two sorted arrays into one array that is sorted into ascending order
  public static void stringMerge (String [] elements, int from, int mid, int to, String [] temp)
  {
    int i = from; 
    int j = mid + 1; 
    int k = from;
    
    //inserts elements into temp in sorted order taking from each half of array 
    //until only one half has numbers not processed
    while( i <= mid && j <= to)
    {
      if (elements[i].compareTo(elements[j]) < 0)
      {
        temp[k] = elements[i];
        i++;
      }
      else
      {
        temp[k] = elements[j];
        j++;
      }
      k++;
    }
    //copy the tail of first half, if any, into temp
    while (i <= mid)
    {
      temp[k] = elements[i];
      i++;
      k++;
    }
    //copy the tail of the second half, if any, into temp
    while (j <= to)
    {
      temp[k] = elements[j];
      j++;
      k++;
    }
    //copies temp back into elements
   for(k = from; k <= to; k++)
    {
       elements[k] = temp[k];
    }
  }

}