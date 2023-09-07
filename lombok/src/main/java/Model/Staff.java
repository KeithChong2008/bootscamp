package Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode (callSuper = false)
@SuperBuilder
//@AllArgsConstructor // no consider Parents Class
public class Staff extends Human {
  private double salary;


  // You have to manually code the constructor with Parent's atribute
  public Staff(String name, double salary){
    super(name);
    this.salary =salary;
  }
  

  public static void main(String[] args) {
    Staff staff = new Staff("John",3000);
    Staff staff2 = new Staff("Peter", 3000d);
    System.out.println(staff.equals(staff2));
  }
}
