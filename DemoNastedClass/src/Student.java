package DemoNastedClass.src;
import java.util.List;
//Outter Class
//Can access static nested class attribute
public class Student {
  String name;
  Bag bag;

  public Student(String name){
    this.name = name;
    bag = new Student.Bag();
  }
  //constructor
  //getter,setter,static & variable
  //method -> Bag.method, instatnce varible
  public int getSize(){
    return this.bag.size;
  }
  //static nested Class
  //Cannot Access Outer Class Attribute

  public void clearBag(){
    //outter Classs access  "static nested class" static method
    Bag.clear(this.bag); 
  }
  public static int add(int a, int b){
    return a+b;
  }
  public String  getName(){
    return this.name;
  }

  public  void printHello(){
    Grade.printHello();
  }

  private static class Bag{
    int size;
    List<String> strings;
    //Constuctor
    //getter,setter
    //instance method
    //Static Method & Variale
    public int getSize(){
      return this.size;
    }

    public static void clear(Bag bag){
      bag.strings.clear();
      //(add 1+3 )// complie error
    } 
    @Override
    public String toString(){
      return "Bag[ size = " + this.size +"String = " + this.strings+  "]";
    }
  }



  //inner class(non-static nested class)
  public class Grade{
    private int score;

    public int getScore(){
      return this.score;
    }

    public char getGrade(){
      switch(this.score){
        case 90:
        return 'A';
        case 80:
        return 'B';
        case 70:
        return 'C';
        default:
        return 'F';
      }
    }

    public Grade(int score){
      this.score = score;
    }

    public void printStudentName(){
      System.out.println(Student.this.getName()); //John
    }

    public static void printHello(){
    System.out.println("Hello");
  }
  }





  @Override
  public String toString(){
    return "Student[name" + this.name + "["+this.bag+"]" + "]";
  }
  
  public static void main(String[] args) {
    Student student = new Student("John"); // Student's constructor
    Student.Bag bag = new Student.Bag(); // Bag 's constructor
    bag.getSize();

    Student.Grade grade = new Student("Peter").new Grade(70);
    grade.printStudentName();


  }

}
