package SwitchExpressingDemo.src;
import java.util.HashSet;
import java.util.Set;

public record Person1(String name, int age) implements TestInterface {

  // Immutable objects - setter Method ,getter Method ,constructor
  // final class
  // private final String name;
  // private final int age;
  // No empty construcor , All-args constructor only.
  // All Getters
  // No Setters (final instance variable)
  // custom static methods, static variable
  // custom instatnce methods
  //No other instatnce variable, custom variable
   //Support Interface, but no further extends
   //Already Override equal(), toString(),hashCode()


  //int salary;

  static int counter = 0; // class variable

  static final int MAX_VALUE = 100; // constant

  public boolean isEldery(int age) {
    return age >= 65;
  }

  public static int add(int x, int y) {
    return x + y;
  }

  @Override
  public void print(){

  }

  public static void main(String[] args) {
    Person person = new Person("John", 15);

    Person1 person1 = new Person1("Peter", 0);
    Person1 anothPerson = new Person1("John", 30);


    // Getter Method
    System.out.println(person.getAge());
    System.out.println(person1.age());

    System.out.println(person.getName());
    System.out.println(person1.age());

    System.out.println(person1.equals(anothPerson)); // true

    Set<Person1> set = new HashSet<>();
    set.add(person1);
    System.out.println(set.add(anothPerson)); // false

    

  }

}
