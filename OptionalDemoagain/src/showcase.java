package OptionalDemoagain.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lambda.src.lambdademo;

public class showcase {
  
  public static void main(String[] args) {
    List<String> addresses = new ArrayList<>();
    addresses.add("Hong Kong");
    addresses.add("US");
    addresses.add("Taiwan");

    Person2 p2 = new Person2("Betty", addresses);
    Person2 p1 = new Person2("Lau", addresses);

    List<Person2> p2 = new ArrayList<>();
    persons.add(p1);
    persons.add(p2);
    System.out.println(getFromDb(persons, "Chan"));
    System.out.println(getFromDb(persons, "Lau"));

    System.out.println(getFromDb(persons, "Chan"));

    Optional<Person2> result = getFromDb(persons, "chan");
    result.ifPresent(persons->{
        //System.out.println(person.getName());
        person.getaAddresses().stream()
        .forEach(addr ->{
          System.out.println(addr);
        });
        
    }); 
  }

  public static boolean getFromDb(List<Person2> person2,String lastName){
      return person2.stream()
      .filter(p ->p.getName().endsWith(lastName)) // Stream
      .findAny() //Optiional <Person2>
      .isPresent()
      ;
  }
}
