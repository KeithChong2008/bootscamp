/**
 * Expected output:
 * 1 1 2 3 5 8 13 21 ...
 * 
 */
// Count the target of character in a String.
public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int a =0,b =1 ;
    for (int i = 2; i < 15; i++) {
      int c = a+b;
      System.out.println(" "+b); 
      a=b;
      b=c;
    }
  
  }
}
