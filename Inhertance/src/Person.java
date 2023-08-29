public abstract class Person {
  
  private int age;
  private double height;

  public Person(){
    
  }

  public int getAge(){
    return this.age;
  }

  public double getHeight(){
    return this.height;
  }



  //May contain instance method with implementation 
  public void run(){
    System.out.println("I am running");
  }
  // may contain abstract method (without implementation)
  public abstract void sleep();

  public void eat(){
    
  };
  
}
