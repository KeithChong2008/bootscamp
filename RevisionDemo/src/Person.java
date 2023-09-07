package RevisionDemo.src;
import java.util.List;

public class Person {
  String name;
  private List<String> address;

  public Person(String name,List<String> address){
    this.name = name;
    this.address = address  ;
  }

  public String getName(){
    return this.name;
  }

  @Override
  public String toString(){
    return "Person(name) " + this.name
    + ", address =" + this.address;
  }
}
