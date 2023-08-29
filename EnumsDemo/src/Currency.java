
public enum Currency {
  USD(1,"US Dollar"),
  HKD(2,"Hong Kong Dollar"),
  CNY(3,"Chinese Yuan Renminbi"),
  GBP(4,"British Pound Sterling"),
  Default(0,"Null");


  private String desc;
  private int id;

  private Currency(int id,String desc){
    this.id =id;
    this.desc =desc;
  }

  public int getID(){
    return this.id;
  }

  public String getDesc(){
    return this.desc;
  }

public static Currency getCurrency(int id){
  //values()
  for(Currency currency: values()){
    if(currency.id == id){
      return currency;
    }
  }
  return null;
}
  public static void main(String[] args) {
    //valueof
    System.out.println(Currency.valueOf("HKD")); //Hong Kong Dollar
    //System.out.println(Currency.valueOf("HKD")); //not found , error
    
  }


}
