package lambda.src;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
// Annotation : check if this interface has one abstract method only
// if no, compile-error
public interface Swimable {
  void swim();

  public static void main(String[] args) {

    //Comparator<Person> sortbyNameDec = (Person p1, Person p2) -> 
    //p2.name.charAt(0) > p1.name.charAt(0) ? 1 : -1;

    Comparator<Person> sortbyNameDec = (Person p1, Person p2) -> 
    {return p2.name.charAt(0) >p1.name.charAt(0)? 1:-1;};

    List<Person> persons = Arrays.asList(new Person("Alice"), new Person("Peter"));
    Collections.sort(persons,sortbyNameDec);
    
    // Person person = new Person();
    // person.swim();

    Swimable person1 = () -> System.out.println("person1 am swimming");
    person1.swim();

    Swimable person2 = () -> {
      System.out.println("person2 starts to swim");
      System.out.println("person2 am swimming");
    };
    person2.swim();

    Swimable person3 = () -> {
      System.out.println("person3 starts to swim");
    };
    person3.swim();
  }

}
