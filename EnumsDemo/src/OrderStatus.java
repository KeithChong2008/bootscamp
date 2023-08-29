public enum OrderStatus{
  PAID(0),
  ORDERED(1),
  SHIPPED(2),
  COMPLETE(3)
  ;

  private int id;
  private OrderStatus(int id){
    this.id =id;
  }

  public int getid(){
    return this.id;
  }



  public boolean isForward(OrderStatus status){
    return status.getid() > this.id;
  }

  public static void main(String[] args) {
    System.out.println(OrderStatus.ORDERED.isForward(OrderStatus.PAID));
  }



}