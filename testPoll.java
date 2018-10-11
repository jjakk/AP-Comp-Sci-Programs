public class testPoll{

  public static void main(String [] args){
  
    PollDisplayPanel votingMachine = new PollDisplayPanel("Tami", "Brian", "Liz");
    
    votingMachine.vote1();
    
    votingMachine.vote2();
    
    votingMachine.vote2();
    
    System.out.println(votingMachine);
  
  }

}