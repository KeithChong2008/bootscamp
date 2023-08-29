package lambda.src;

import java.util.function.Predicate;

public class CombineDemo {
  
  public static void main(String[] args) {
    Predicate <String> startwithV = s -> s.startsWith("V");
    Predicate <String> endwithE = s -> s.endsWith("E");

    Predicate<String> combined = startwithV.and(endwithE);

    System.out.println(combined.test("VE"));
    System.out.println(combined.test("AE"));
    System.out.println(combined.test("VA"));
    
    Predicate<String> combined2 = startwithV.or(endwithE);
    System.out.println(combined2.test("VE"));
    System.out.println(combined2.test("AE"));
    System.out.println(combined2.test("VA"));

    



  }
}
