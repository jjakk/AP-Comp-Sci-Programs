public class MergeShort{
  
  public static void printArray(int [] nums){
    for(int n: nums)
      System.out.print(n + " ");
    System.out.println();  
  }
  //sorts an array of integers in ascending order
  public static void mergeSort(int [] elements)
  {
    int n = elements.length;
    int [] sortedNums = new int [n];
    printArray(elements);
    mergeSortHelper(elements, 0, (n-1),sortedNums);
  }
  //sorts elements[from] ... elements[to] inclusive into ascending order
  private static void mergeSortHelper (int [] elements, int from, int to, int [] sn)
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
  public static void merge (int [] elements, int from, int mid, int to, int [] temp)
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
   printArray(elements);
  }
  
  public static void main (String [] args)
  {
    int [] numbers = {38, 27, 43, 3, 9, 82, 10};
    mergeSort(numbers);
    printArray(numbers);
  }

}