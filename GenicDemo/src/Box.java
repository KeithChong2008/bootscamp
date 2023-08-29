import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Box<T extends Number> { // Complie-time check

  private ArrayList<T> numbers;

  private Box(T number) {
    this(); // the empty constructor of Class Box
    numbers = new ArrayList<>();
    numbers.add(number);
  }

  public Box() {
    numbers = new ArrayList<>();
  }

 

  private ArrayList<T> getNumbers() {
    return this.numbers;
  }

  public void add(T number) {
    numbers.add(number);
  }

  public int size(T number) {
    return numbers.size();
  }

  public static <T extends Number> Box<T> getBox(T element) {
    return new Box<>(element);
  }

  // public void SetNumbers(T[] numbers){
  // this.numbers = numbers;
  // }

  public static void main(String[] args) {
    // Box<String> box1= new Box<>();
    Box<Number> box1 = new Box<>(100);
    System.out.println(box1.size());

    Box<Integer> box = getBox(Integer.valueOf(100));

    //box1 = new Box<>("abc"); it is not Box<Numbers>

    Collections.sort()

  }
}
