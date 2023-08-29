public abstract class Adult extends Runnable {
  //abstract class extends abstract class
  //implicity "extends" abstract method

  public Adult(){
    super(); // new Person()
  }

  public abstract void read();
  
  public void eat(){
    System.out.println("I am Aduit,eating.");
  }

}
