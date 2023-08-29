package Revisin;

public class Revision {

  public void print(String input){
    System.out.println("Hello" + this.name);
  }
  public static void print2(String input){
    System.out.println("Hello" + input);
  }
  String name;
  public static void main(String[] args) {
    Revision r1 = new Revision();
    r1.name ="John";
    Revision r2 = new Revision();
    r2.name = "John";
    
    r2.name = new String("John");
    System.out.println(r1.name == r2.name);

    String s1 ="abc";//double quote, no New keryword
    String s2 ="abc";
    System.out.println(s1 == s2);//true Literal Pool

    String s3 = new String("abc");
    System.out.println(s1 ==s3); // false

    Integer i1 = 127;
    Integer i2 = 127;
    System.out.println(i1 ==i2);//true;cache
    Integer i3 = 128;
    Integer i4 = 128;
    System.out.println(i3 == i4);//false
    
    String temp =s1;
    s1 += "d"; // String is immuable
    System.out.println(temp == s1);//false

    System.out.println(r1 == r2); // false, different object
    System.out.println(r1.name == r2.name); // true 

    r1.print("World");//instance method
    Revision.print2("world");//static method



  }
  
  
}
