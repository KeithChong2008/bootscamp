package ObjectDemo;

import java.math.BigDecimal;

import example.Circle10;
import example.Square10;

public abstract class shape {
  
  public  abstract double area();

  public static void main(String[] args) {
    double total = 0.0d;
    BigDecimal b = BigDecimal.valueOf(total);
    b =b.add(BigDecimal.valueOf(5));
    System.out.println(b.doubleValue());

    Circle10 circle10 = new Circle10(10.0d);
    Square10 square10 = new Square10(3.0d);
    shape[] shapes = new shape[]{circle10,square10};
    System.out.println(shape.area(shapes));;
  }

  public static double area(shape[] shapes){
    BigDecimal total = BigDecimal.valueOf(0);
    for (shape s: shapes){
        total = total.add(BigDecimal.valueOf(s.area()));
      }
      return total.doubleValue();
  }
  
}
