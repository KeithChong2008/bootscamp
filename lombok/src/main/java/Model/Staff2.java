package Model;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)

public class Staff2 extends Human {
  private double salary;


  // You have to manually code the constructor with Parent's atribute
  public Staff2(String name, double salary){
    super(name);
    this.salary =salary;
  }
  

  public static void main(String[] args) {
    Staff2 staff = new Staff2("John",3000);
    Staff2 staff2 = new Staff2("Peter", 3000d);
    System.out.println(staff.equals(staff2));

    Staff2 s4 = Staff2.builder().name("Catherine").salary(3000d).build();
  }
}
