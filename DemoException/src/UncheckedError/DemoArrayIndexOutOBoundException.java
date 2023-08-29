package DemoException.src.UncheckedError;

public class DemoArrayIndexOutOBoundException {
  public static void main(String[] args) {
  int [] arr = new int[4];
  arr[4] = 3;

  try{
    for(int i = 0;i<= arr.length;++i){
      System.out.println(arr[i]);
    } 
  }catch(ArrayIndexOutOfBoundsException e){
    System.out.println("ArrayIndexOutOfBoundsException");
  }






  
  }
}
