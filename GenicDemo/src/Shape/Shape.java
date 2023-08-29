package Shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
  
  abstract double area();

  public static /*<T extends Shape>*/ double area(List<? extends Shape> shapes){
    BigDecimal total = BigDecimal.ZERO;

    //shapes.add(new Circle()); // Compile-time check
    for(Shape shape: shapes){
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();
  }
  public static void main(String[] args) {
    //Polymorphism

    Shape shape = new Circle(); //Polymorphism
    Shape shape2 = new Square(); //Polymorphism
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    //shapes = new ArrayList<Circle>(); // no relationship of previous line

    List<? extends Shape> list = new ArrayList<Circle>();
    List< Shape> list2 = new ArrayList<Shape>();
    list = new ArrayList<Square>();
    //list.add(new Circle()); // compile check refer to declration
    list2.add(new Circle());// OK

    



  }
 
}
