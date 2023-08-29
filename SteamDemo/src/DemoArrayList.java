package SteamDemo.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;

public class DemoArrayList {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("abc");
    strings.add("def");
    strings.add("ghi");
  

    for(String s: strings){
      System.out.println(s);
    }

    //stream
    Stream <String> streamStrings = strings.stream();
    //stream.Filtering
    streamStrings.filter(s->s.startsWith("a"));
    //stream.ForEach
    streamStrings.forEach(s->System.out.println(s));

    strings.stream()
    .filter(s -> s.endsWith("i"))
    .forEach(s->System.out.println(s)); //ghi

    List<String> strings2 = strings.stream()
    .filter(s -> s.length() == 3)
    .collect(Collectors.toList());

    System.out.println(strings2.size());


    List<Integer> lengths = strings2.stream()
    .filter(e->e.startsWith("a")|| e.startsWith("d"))
    .map(e->e.length())// Steam<Integer>
    .collect(Collectors.toList()); //List<Integer>

    lengths.forEach(e-> System.out.println(e));

    strings2.stream()
    .sorted((s1,s2) -> s2.compareTo(s1)) //decending order
    //.collect(Collectors.toList())
    .forEach(s -> System.out.println(s));

    boolean result = strings2.stream()
    .anyMatch(e->e.startsWith("a"));//true

    System.out.println("One of the elements starts with a");

    //interminate operation of Stream:
    //filter().map().sorted().anyMatch()

    //terminated operation of Stream:
    // collect(), forEach()

    //Stream can only terminate once, 
    //but it may have multiple interminate operations

    List<Person> persons = Arrays.asList(new Person("John", 30),new Person("Mary", 25));
    //stream -> get all the ages from persons

    List<String> names = persons.stream()
    .map(e-> e.getName())
    .collect(Collectors.toList());

    System.out.println(names.stream()
    .filter(e->e.startsWith("John")).count());

    //Stream static Method
    Predicate<String> lengthFunc = e->e.length() == 3;
    long l = Stream.of("abc","def","ghi","abc")
    .filter(e->e.length()==3)
    .distinct() 
    .count();//l
    

     Stream.of(1,2,3,4)
    .filter(e->e ==2)
    .map (e->{
      System.out.println(e); //2
      return e;
  });
  //.forEach(e-> System.out.println(e)); //2
  //.count(); // temerinate operation

    List<Integer> integers =  Stream.of(1,2,3,4)
    .map (e->{
      System.out.println(e); //2
      return e;
  }).collect(Collectors.toList());

  System.out.println(integers);

  int setSize = Stream.of(1,2,3,3)
  .collect(Collectors.toSet()).size();
  System.out.println(setSize);

  Stream.of(1,2,3,3,5)
  .filter(e-> e<6 && e >2 )
  .forEach((e -> System.out.println(e)));

  List<String> animals = Arrays.asList("Lion", "Tiger", "Bear");

  Map<String,Integer> animalMap = animals.stream()
  .collect(Collectors.toMap(str -> str,str ->str.length()));

  for(Map.Entry<String,Integer> entry: animalMap.entrySet()){
    System.out.println(entry.getKey() + " " + entry.getValue());
  }

  Stream.iterate(1,n-> n+2)
  .limit(10)
  .forEach(e -> System.out.println(e));


  //Group By - > If no equal, Object will count different.

}
  public static boolean findElderly(List<Person> persons){
    return persons.stream()
    .filter(e->e.getAge() >=65) // Stream ->
    .findFirst() // Optional <Person>
    .isPresent(); // boolean
  }
  }

