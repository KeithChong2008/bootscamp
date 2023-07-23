package ClassObject2;

public class Computer {
  private int ram;
  private int weight;
  private String color;

  public void setRam(int ram){
    this.ram = ram;
  }

  public void setweight(int weight){
    this.weight = weight;
  }

  public void setcolor(String color){
    this.color = color;
  }

    //Constructors
    public Computer(){//1.No return type, (2) Constructor name = Class name
      
      

    }

    public void Computer(String color){
    this.color =color;
}

    public String getColor(){
      return this.color;
    }
}
