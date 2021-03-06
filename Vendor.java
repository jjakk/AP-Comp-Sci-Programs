public class Vendor{
  
  private int price = 0;
  
  private int deposit = 0;
  
  private int change = 0;
  
  private int stock = 0;
  
  private static double totalSales = 0;
  
  public Vendor(int p, int s){
    
    price = p;
    
    stock = s;
    
  }
  
  public void addMoney(int money){deposit += money;}
  public void setStock(int amount){stock = amount;}
  public boolean makeSale(){
    
    int sales = 0;
    
    if(deposit >= price && stock > 0){
      
      deposit -= price;
      
      stock--;
      
      sales++;
      
      change = deposit;
    
      deposit = 0;
      
      totalSales += price;
      
    }
    
    else change = deposit;
    
    if(sales == 0) return false;
    else return true;
    
  }
  
  public int getDeposit(){return deposit;}
  public int getChange(){return change;}
  public int getStock(){return stock;}
  public static double getTotalSales(){
    
    double temp = totalSales;
    
    totalSales = 0;
    
    return temp/100;
    
  }
  
  public String toString(){
  
    return "Price : " + price + " Stock : " + stock;
  
  }

}