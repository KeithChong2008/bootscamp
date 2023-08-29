import java.util.Arrays;

public class C extends B {
  
  public void print(int[] arr){
    System.out.println(Arrays.toString(arr));
  }
  public static void main(String[] args) {
    C c = new C();
    c.num = 10;
    c.str = "hello";
    c.SetNum(100);
    c.SetStr("abc");
    c.print(new int[]{-1,8,2});
  }
}
