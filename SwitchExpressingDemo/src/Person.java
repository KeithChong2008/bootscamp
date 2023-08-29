package SwitchExpressingDemo.src;

public class Person {

  String name;
  private int age;

  public Person(){
    
  }

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public void SetName(String name){
    this.name = name;
  }

  public void SetAge(int age){
    this.age = age;
  }
}
