package lambda.src;

public class Person implements Swimable {

    String name;

    public Person(String name){
      this.name = name;
    }

    
    @Override
    public void swim(){
      System.out.println("Person am swimming");
    }


    public static void main(String[] args) {
      Person person = new Person("Eric");
      person.swim();

    }
}



