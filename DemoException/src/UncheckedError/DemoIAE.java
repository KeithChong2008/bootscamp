package DemoException.src.UncheckedError;

public class DemoIAE {
  
  public static int add(int a, int b){
    if(a<0 || b<0){
      throw new IllegalArgumentException();
    }
    return a+b;
  }

  public static void main(String[] args) {
    try{
    add(1,4); // OK
    add(-1,5); // throw exceptiom
    add(4,5); // un-reached
  }catch (IllegalArgumentException e){
    System.out.println("Skip the Progress");
  }

  String s = "abc";
  System.out.println(s);

}
}
