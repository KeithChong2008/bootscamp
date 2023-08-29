package MethodReferenceDemo.src;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReference {
  
  public static void main(String[] args) throws Exception {
    Consumer <String> sysout = s->System.out.print(s);
    Consumer <String> sysout2 = System.out::println; //static method

    Arrays.asList("abc","def").forEach(sysout2);

    String name = "john";

    Supplier <Integer> strLight = () ->name .length();
    Supplier <Integer> strLight2 = name:: length;

    List<String> words = Arrays.asList("apple","banna","orange");
    Comparator<String> compare = (s1,s2) -> s1.compareTo(s1);
    Comparator<String> compare2 = String :: compareTo;

    Function<String, Integer> StringToInteger = 
                          str -> Integer.valueOf(str +2); 
                          
    Function<String, Integer> StringToInteger2 = Integer::valueOf;


  }
}
