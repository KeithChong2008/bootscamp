package RevisionDemo.src;

import java.text.Collator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class Revision {
  
  public static void main(String[] args) {
    // Stream support List, Map ,Arrays,stream()
    List<String> strings = new LinkedList<>();
    strings.add("abc");
    strings.add("defijk");
    strings.stream()
    .filter(e->e.startsWith("a"))
    .forEach (e-> System.out.println(e)); //abc

    strings.stream()
    .map(e ->e.length()) //conveert string to int
    .filter( l -> l<5)
    .forEach(e -> System.out.println(e)); // 3

    Integer i =10;
    Integer j =20;
    System.out.println(i.equals(j));

    


    
    }

      public static List<Integer> getAges(List<String> list){
        return list.stream()
        .map(e -> e.length())
        .filter(e -> e<5)
        .collect(Collectors.toList());
      }

      
      
}
