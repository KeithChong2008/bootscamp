public class Dog extends Game implements Move {
  

  String name;
  
@Override
public void jump(){
  super.AddScore(3);
}

public void up(){
  super.AddScore(2);
}

public static void main(String[] args) {
  Dog dog = new Dog();
  dog.print();// print() from Game first from Superclass first -> then implements

}

}
