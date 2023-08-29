public class Student extends Person implements Runnable ,Swimable,Move { // class signature
    
    private String name;
    private int score;

@Override
public void jump(){}



@Override
public void breath(){

}
@Override
    public void run(){
      System.out.println("Student is running");
    }

    @Override
    public void swim(){
      System.out.println("Student is swimming");
    }

    public static void main(String[] args) {
      //MAX_SPEED
      System.out.println(MAX_SPEED);//10

      Move student = new Student();
      student .jump();

      //System.out.println(move.MAX_SPEED); //Not recomaned

      Swimable swimable = new Student();
      swimable.swim();

      Person person = new Student();
      person.breath();
      person.getAge();

      Move dog = new Dog();
      dog.jump();



    }

}
