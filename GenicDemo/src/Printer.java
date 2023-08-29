//Generic
public class Printer <T> { 
  //1. Class Signature, add <> T represent any Class

  T value;
  T[] numbers;

  Object object;
  

  public T getValue(){
    return this.value;
  }

  public void setValue(T value){
    this.value = value;
  }

  public void setObject (Object object){
    this.object = object;
  }

  public void print(){
    System.out.println( this. value);
  }

  
  public static void main(String[] args) {
    Printer<String> p1 = new Printer<>();
    p1.setValue("abc");
    // Strong Type checking -> check if you put a real class into <>

    Printer <Integer> p2 = new Printer<>();
    p2.setValue(100);
    Printer <Double> p3 = new Printer<>();
    p3.setValue(200.1);

    Printer<Object> p4 = new Printer<>();
    
    System.out.println( p1.getValue());
    
    
    

  }
}
