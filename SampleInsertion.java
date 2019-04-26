public class SampleInsertion
{
  //helper method that prints the array
  public static void printArray(int [] arr)
  {
    System.out.println();
    for(int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
  //method provided by College Board in Appendix C
  public static int [] insertionSort (int [] elements)
  {
    int temp, possibleIndex; //declares local variables
    
    for (int j = 1; j < elements.length; j++)  //first element "sorted" since all items to left are sorted
    {
      printArray(elements);  //show progress before each iteration
      temp = elements[j];  //swap step one - makes temp the key for testing
      possibleIndex = j;   //where key begins
      System.out.println("key;"+temp + " starts at " + possibleIndex);
      while(possibleIndex > 0 && temp < elements[possibleIndex - 1])
      {
        elements[possibleIndex] = elements[possibleIndex -1];  //swap step two
        possibleIndex--;
      }
      elements[possibleIndex] = temp;  //swap step three
    }
    return elements;  //returns sorted list
  }

  public static void main (String [] args)
  {
    int [] items = {5,8,1,3,9,6};
    items = insertionSort(items);
    printArray(items);   //show progress at end
    
  }
}