package ClassObject2;

import javax.swing.SpinnerDateModel;

public class ClassObject2 {// template
  // Describe the person by attributes
  private int age;
  private char gender;// week 6->ENUM
  // Defination

  // Getter Method
  public int getAge() {
    return this.age;
  }

  public int getGender() {
    return this.gender;
  }

  // Setter Method
  public void setAge(int age) {
    this.age = age; // P inside age = defination age
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  /////////////////////////////////////////////////////////
  public static boolean isMale(char gender) {
    if (gender == 'F') {
      return false;
    }
    return true;
  }

  public boolean isMale() {
    if (gender == 'F') {
      return false;
    }
    return true;
  }

  /////////////////////////////////////////////////////////
  public static void main(String[] args) { // Not belong to ClassObject2 // Run the program in the memory
    String s = "abc";
    String s2 = new String("abc");
    String s3 = String.valueOf("abc");

    ClassObject2 p = new ClassObject2(); // Produce empty person object
    ClassObject2 p2 = new ClassObject2(); // All-arguments Constructor
    p.setAge(13);
    p2.setAge(24);

    // Static Vs Non Static
    // Static
    System.out.println(isMale('F'));// ->false
    p.setGender('M');
    p.isMale();// ->True

    // static -> Using parameter to output answer (public)
    // not static -> Using specific object to output an answer (private)
    Computer computer = new Computer(); // public class // Computer()->empty constructor
    computer.setcolor("Red");
    computer.setRam(128);
    computer.setweight(2);

    Computer computer2 = new Computer();
    computer2.getColor();
    computer2.setcolor("Black");
    computer2.getColor();

    System.out.println(p.age);
    System.out.println(p.getAge());

    Student student = new Student("Eric", "Lau", 19);
    System.out.println(student.fullName());// Eric Lau


  }
}
