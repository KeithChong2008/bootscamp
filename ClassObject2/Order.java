package ClassObject2;

public class Order {
  private Transaction [] transactions;

  public  Order (Transaction[] transactions){
    this.transactions = transactions;
  }
  public double getTotal(){
    double total =0;
    for(int i =0;i<this.transactions.length;++i){
      total += this.transactions[i].subtotal(); //object.method()

    }
    return total;
  }


}
