public class Student extends Person {
  // Must implement abstract method

  public Student(){
    super(); // new Adult()
  }
  public  void sleep(){
    System.out.println("I am student,sleeping");
  }

  public void read(){
    System.out.println("I am student, reading");
  }

  public static void main(String[] args) {
    Student student = new Student();
    student.sleep();
    student.read();
    student.run();
    student.eat();
  }
}
