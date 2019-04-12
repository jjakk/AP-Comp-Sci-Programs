public class DealershipTester
{
  public static void main (String [] args)
  {
    String [] models = {"Fiesta","Sonic","Accent", "Yaris", "Versa", "Cruze",
      "Civic", "Jetta", "Beetle", "Accord", "Optima", "Altima", "Maxima", 
      "Trail Blazer", "Corvette", "Mustang", "Tundra", "Wrangler",
      "Boxster", "Model S"};
    int [] years = {2019, 2018, 2009, 2010, 2012, 1990, 1932, 2015, 2018,
      2007, 2015, 2000, 2010, 2012, 1998, 1932, 2015, 2017, 2019, 1995};
  
      Dealership darien = new Dealership(models, years);
      System.out.println("Current stock unsorted");
      darien.printList();
      
      System.out.println("Sorted by year");
      darien.selectionSort("year");
      darien.printList();
      
      System.out.println("Sorted by model");
      darien.selectionSort("model");
      darien.printList();
  //
  }
}