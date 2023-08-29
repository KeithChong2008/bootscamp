package ClassObject2;

public class Transaction {
  int itemNo;
  String itemDesc;
  int quantity;
  double unitPrice;

  public double subtotal(){
     
     return this.quantity*this.unitPrice;
  }

  public Transaction(String itemDesc, int quantity,double unitPrice,int itemNo){
      this.itemNo = itemNo;
      this.itemDesc = itemDesc;
      this.quantity = quantity;
      this.unitPrice = unitPrice;
  }

  public int getItemNo(){
    return this.itemNo;
  }
  public double getUnitPrice(){
    return this.unitPrice;
  }
  public String getItemDesc(){
    return this.itemDesc;
  }

  public int getquantity(){
    return this.quantity;
  }

  public void setitemDesc(String itemDesc){
    this.itemDesc = itemDesc;
  }
  public void setUnitPrice(int unitPrice){
    this.unitPrice = unitPrice;
  }
  public void setquantity(int quantity){
    this.quantity = quantity;
  }
  public void setitemNo(int itemNo) {
      this.itemNo = itemNo;
  }
}
