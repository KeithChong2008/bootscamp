package ClassObject2.Shape;

import java.math.BigDecimal;

public class Circle2 {
  private double radius;
  private static final double pi = 3.14159;

  public static Circle2 of(double radius){
    return new Circle2(radius);  
  }
  public BigDecimal area(){
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal. valueOf(pi));
  }
  public static void main(String[] args) {
    System.out.println(0.1*0.1*pi);
    
  }
}
