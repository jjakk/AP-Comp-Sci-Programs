public class VendingCompany{

  public static void main(String [] args){
    
    Vendor [] machines = new Vendor[3];
    
    machines[0] = new Vendor(45, 5);
    machines[1] = new Vendor(50, 5);
    machines[2] = new Vendor(35, 5);
    
    for(Vendor daWae : machines)System.out.println(daWae);
    
    System.out.println("************************");
    
    Vendor [] moreMachines = new Vendor[8];
    
    for(int i = 0; i < machines.length; i++)moreMachines[i] = machines[1];
    
    for(Vendor daWae : moreMachines)System.out.println(daWae);
    
  }

}