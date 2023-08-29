package SteamDemo.src;

public  class Person {
  int age;
  String name;
  public Person(String name, int age){
    this.age =age;
    this.name = name;
}
    public String getName(){
      return this.name;
}
  public int getAge(){
    return this.age;
  }

  public boolean isEldery(){
    return this.age >=65;
  }

}
