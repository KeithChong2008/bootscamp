import java.util.ArrayList;

public class GenicDemo {
  
  public static void main(String[] args) {
    ArrayList <String> strings =  new ArrayList<>();


    Zoo<Dog> Zoo1 = Zoo.of(Dog.of("xyz"));
    //zoo1.setAnimal( new Cat());
    Zoo1.setAnimal(  Dog.of("def"));

    Zoo<Animal> Zoo2 = Zoo.of(Dog.of("abc"));
    Zoo2.setAnimal(new Animal());
    Zoo2.setAnimal(new Cat());

    Zoo<String> zoo3 = Zoo.of("abc"); //String is not extending Animal

    Object object =getBox(Double.valueOf(1.0d));
    // Object object <- Box(Double)

    Box<Double> d1 = (Box<Double>) object;
    for((double d :d1.getNumbers())){
      System.out.println(d);
    }
    
  }
}
