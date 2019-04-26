public class TownTester{
  
  public static void main (String [] args){
 
    int [] numbers = {352,17,6,42,385,65,12,4,86};
    String [] streets = {"Brookside Rd","Maywood Hill","Denhurst Pl","Plymouth Ln",
      "Hoyt St","Renshaw Rd","Nolen Ln","Clubhouse Cir","Gardiner St"};
    String [] colors = {"white","grey","brown","tan","white","red","blue","grey","white"};
    int [] beds = {3,4,3,2,3,5,3,4,3};
    double [] baths = {2,3,2,1.5,2.5,3.5,2,2,2.5};
    
    System.out.println();
    
    Town darien = new Town(numbers, streets, colors, beds, baths);
    
    darien.selectionSort("numbers");
    
    System.out.println("Array after number sort");
    
    darien.printList();
    
    darien.selectionSort("streets");
    
    System.out.println("Array after street sort");
    
    darien.printList();
    
    darien.selectionSort("colors");
    
    System.out.println("Array after color sort");
    
    darien.printList();
    
    darien.selectionSort("beds");
    
    System.out.println("Array after bed sort");
    
    darien.printList();
    
    darien.selectionSort("baths");
    
    System.out.println("Array after bath sort");
    
    darien.printList();
    
    
    
  }
}