//Homework: finish writing constructor, 
//write a method that returns the total number of boxes sold
public class ScoutOrder
{
  //fields
  private String name;
  private int samoas;
  private int tagALongs;
  private int thinMints;
  private int trefoils;
  
  //constructor 
  public ScoutOrder (String s, int sam, int tag, int thin, int tre)
  {
    name = s;
    samoas = sam;
    tagALongs = tag;
    thinMints = thin;
    trefoils = tre;
  }
  
  public int getTotalBoxes(){
  
    return samoas + tagALongs + thinMints + trefoils;
  
  }
  
  public String toString()
  {
    return name + " sold: "+samoas +" Samoas, "+tagALongs+" TagALongs, "+
      thinMints + " Thin Mints, "+trefoils+ " Trefoils";
  }
}
    