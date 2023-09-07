package OptionalDemoagain.src;

public class Customer extends Human implements Orderable {
  public static int counter =0;
  @Override
  public void order(){
    counter++;
  }

  public Customer(String name){
    super(name);
  }

  public void HumanOrder(){
    super.order();
  }
}
