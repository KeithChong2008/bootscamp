package ClassObject2;

public class car {
  private int noOfWheel;
  private int capacity;
  private String color;



  

  public void setnoOfWheel(int noOfWheel ){
    this.noOfWheel = noOfWheel;

  }

  public void setcapacity(int capacity){
    this.capacity = capacity;
  } 
  
  public void setcolor (String color){
    this.color = color;
  }

  public int getnoOfWheel(){
    return  this.noOfWheel;
  }

  public int getcapacity(){
    return this.capacity;
  }

  public String getcolor(){
    return this.color;
  }

  //default Constructor
  public car(){
    this.noOfWheel =0; //deafult value
    this.capacity = 0; //deafult value
    this.color = null; //deafult value
  }
  
  //All-arguments Constructor (with all attributes)
  public car(int noOfWheel,int capacity,String color){
    this.noOfWheel =noOfWheel;
    this.capacity = capacity;
    this.color = color;
  }
  
  


}
