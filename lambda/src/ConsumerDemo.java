package lambda.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.List;
import java.util.Map;

public class ConsumerDemo {
  public static void main(String[] args) {
  Consumer<String> consumer = str -> System.out.println(str);

  consumer.accept("I Love Java");

  BiConsumer<String,String> biConsumer = (s1,s2) -> System.out.println(s1+s2  );
  biConsumer.accept("abc", "def");

  List<String> strings = new ArrayList<>();
  strings.add("dog");
  strings.add("cat");
  strings.add("cow");
  strings.forEach(s-> {

  int i =0;
  if(i<1){
    System.out.println(s);
  }
});

  
  int total =0;
  for(int i: Arrays.asList(2,3,4)){
    total +=i;
  } 
  System.out.println(total);






  Map<String, Integer> map =new HashMap<>();
  map.put("orange",1);
  map.put("lemon",2);
  map.put("watermelon",10);


map.forEach((key,value)-> {
  if(("lemon").equals(key)){
      System.out.println(value);
  }
});

  

  }
  
}

