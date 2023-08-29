import java.util.Objects;

import ObjectDemo.Point;

public class Laptop extends Machine { 
  //Laptop is subclass, machine is superclass
  //Inherit Machine"double weight"
  //Inherit Machine methods (start() and stop())

  Keyboard keyboard;
  Monitor monitor;

  public void mute(){
    this.volume =0;
  }

  public Laptop(){
    // implicity call superclass empty constructor
    // subclass must call superclass constructor
    // new Machine()
    super(1.0d);
  }

  public Laptop(Keyboard keyboard,Monitor monitor){
    // implicity call superclass empty constructor
      this.keyboard =keyboard;
      this.monitor = monitor;
  }

  public Laptop(String buttonType, int noOfButton,double length,double width ){
    // implicity call superclass empty constructor
    this.keyboard = new Keyboard(buttonType, noOfButton);
    this.monitor = new Monitor(length,width);
  }

  public Laptop(double weight, Keyboard keyboard, Monitor monitor){
    super(weight); // new Machine(5); -> call superclass constructor //-> this.setWeight(weight());
    this.keyboard =keyboard;
    this.monitor = monitor;

  }
  
  @Override // Method Overriding
  public void stop(){
    System.out.println("Laptop Stop......");
  }
  @Override // Method Overriding
  public void start(){
    super.start();// Machine Start 
    System.out.println("Laptop Start......");
  }

  //You cannot overide the final method in superclass
  // public static String staticMethod(String x, String y){ // Cannot override as final superclass one
  //     return x+y;
  // }

  public static void main(String[] args) {
    Laptop laptop = new Laptop("abc", 100, 15, 10);
    laptop.setWeight(3.0);
    System.out.println(laptop.getWeight());
    laptop.start(); // Laptop start
    laptop.stop(); // Laptop stop
    

    Machine machine = new Machine();
    machine.setWeight(5.0);
    machine.start();// Machine start
    machine.stop();//Mahine stop

    Laptop laptop2 = new Laptop();
    laptop2. setWeight(10d);
    
    Laptop laptop3 = new Laptop();
    System.out.println(laptop3.getWeight());
    Machine.staticMethod("abc","def");
    Laptop.staticMethod("abc","def");
    
    

  }
  @Override
  public boolean equals(Object o){
    if (this ==o){
      return true;
    }
    if(!(o instanceof Laptop)){
      return false;
  }
    Laptop laptop = (laptop) o;
    return Objects.equals(laptop keyboard, this.keyboard) && Objects.equals(laptop monitor, this.monitor);
  }
}