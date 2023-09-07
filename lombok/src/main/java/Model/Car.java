package Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor

public class Car {

  @NonNull  // When data input -> all attriuute cannot null;
  private Integer capacity;
  private  final double weight;
  private String color;

  public Car(String color){
    this.color = color;
    this.weight =0d;
  }

  public static void main(String[] args) {
    Car car = new Car(3, 5.0);
  }
}
