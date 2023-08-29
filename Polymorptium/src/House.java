public class House extends Building {

  private double capacity;

  //Overloading
  public void print(String s){
    System.out.println("Overloading...");
  }

  public House(double capacity){
    this.capacity =capacity;
  }

    public void buildingPrint(){
    super.print();
  }

  public double getCapcaity(){
    return this.capacity;
  }
  
@Override
  public void print(){
    System.out.println("I am House");
  };
  

}
