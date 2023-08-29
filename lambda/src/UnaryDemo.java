package lambda.src;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryDemo {
  public static void main(String[] args) {
  UnaryOperator<String> upperCase = str->str.toUpperCase();
  System.out.println(upperCase.apply("Hello"));
  
  BinaryOperator<String> concat = (s1,s2) -> s1.concat(s2);
  System.out.println(concat.apply("Hello", " World"));

  SuperUnaryOperator<String> concat2 = (s1,s2,s3)-> s1.concat(s3);
  concat2.apply("abc", "def", "ghi"); 
  
  








  }

  
}
