// Before Java 8 , 100% abstracction
public interface Move extends BigMove {

  //constant
  static final int MAX_SPEED = 10; //public


  //Java -> naming convention -> Camlcase
  //"noOfDay"  

  // Behavoir
  void jump(); //public abstract



  // No method implmentation

  //After Java 8, lambda,stream 
  default void print(){
    System.out.println("I am Java 8 Default method");
  } // instance method , implicity public

  static String concat(String a, String b){
    return a+b;
  }






}
