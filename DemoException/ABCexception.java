package DemoException;

public class ABCexception extends RuntimeExeption{

  // divide by Zero
  // null pointer
  // array size (outbond)
  //ConcurrentModification

  public ABCexception(){
    super("abc exception");
  }

  public static void main(String[] args) {
    int a = 10/0;
  }
  
}
