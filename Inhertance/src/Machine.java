public  class Machine {
  
  private double weight;
  public int volume;

  public Machine(){
    
  }

  public Machine(double weight){
    this.weight = weight;
  }

  public void start(){
      System.out.println("Machine start ");
  }
  public void stop(){
    System.out.println("Machine stop");
  }

  public double getWeight(){
    return this.weight;
  }
  public void setWeight(double weight){
    this.weight =weight;
  }

  public  static final  String staticMethod(String x, String y){
      return x+y;
  }

  public static void stop(int code){ //what machine goint to stop??
    Machine machine = Machine.produce(code);
    machine.stop(); //different child class will have different implmentation
  }

  //Factory Pattern
  public static Machine produce(int code){
    int money =0;
    boolean stopCondition = money<0;
    if (stopCondition){
      Machine.stop(1);
    }

    switch(code){
      case 1:
      return new Machine();
      case 2:
      return new Laptop();
      
    }
    return new Machine();
  }

  public static void main(String[] args) {
    Machine machine1 =Machine.produce(1); //Machine
    machine1.stop();
    Machine machine2 =Machine.produce(2); //Laptop
    machine2.stop();
     
  }
}
