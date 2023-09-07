package RevisionDemo.src;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
  public static void main(String[] args) {
    // One Table -> Many records

    //flatMap()
    List <String> addresses = new ArrayList<>();
    addresses.add("Hong Kong");
    addresses.add("Macau");
    addresses.add("Tai Po");

    List <String> addresses2 = new ArrayList<>();
  
    Person  p1 = new Person("Ann",addresses);
    addresses.add("Taiwan");
    addresses.add("US");

    Person  p2 = new Person("Betty",addresses);

    //return all address(List<String>) from List<Person>

    List<Person> persons = new ArrayList<>();
    persons.add(p1);
    persons.add(p2);
    System.out.println(getAlladdresses(persons));

  }

 
  public static List<String> getAlladdresses(){
    return persons.stream()
    .flatMap(person ->person.getaAddresses().stream())
    .collect(Collectors.toList())
    
    //.distinct()
    //.count()
    ;
    //
  }
    public static List<String> getAlladdresses2(){
      List<String> addresses = new ArrayList<>();
      //flatMap
      for(Person p : persons){
        for(String address: p.getaAddresses()){
            addresses.add(address);
        }
      }

      //Map
      List<List<String>> addressLists = new ArrayList<>();
      for(Person2 p : persons){
        addressLists.(p.getAddresses());
      }
      return addresses;
    ;
    
  }

  public static List <String> getFullname2 (List<Person> persons){
    persons.add(new Person("John Chan"));
    persons.add(new Person("Eric Lau"));
    persons.add(new Person("Peter Lau"));

    // filter + map;
    List<String> names = new ArrayList<>();
    for(Person p: persons){
      if(p.getName().endsWith((lastName))){
        names.add(p.getName());
      }
      
    }
    return names;
  }

  public static List<String> getFullName(String lastname){
    List<Person> persons = new ArrayList<>();
    
    persons.add(new Person("John Chan"));
    persons.add(new Person("Eric Lau"));
    persons.add(new Person("Peter Lau"));
    //Stream, last name = Lau

        return persons.stream()
    .filter(p -> p.getName().endsWith(lastname))// p means<T>
    .map(Person::getName)
    .collect(Collectors.toList());

    }
 

  public static List<Person> getLastName(String lastanme){
    List<Person> persons = new ArrayList<>();

    //Fileer by Lau
    persons.add(new Person("John Chan"));
    persons.add(new Person("Eric Lau"));
    persons.add(new Person("Peter Lau"));
    //Stream, last name = Lau
    return persons.stream()
    .filter( p -> p.getName().endsWith("Lau"))
    .collect(Collectors.toList());
  }
}
