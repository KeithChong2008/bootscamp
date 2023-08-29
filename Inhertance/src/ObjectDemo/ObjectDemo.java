package ObjectDemo;

public class ObjectDemo { 
  //Rule 1: All class etends Object implicity
  //ObjectDemo extens Object
  String name = "Hello";
  @Override
  public String toString(){
    return this.name;
  }

  public static void main(String[] args) {
    ObjectDemo objectdemo = new ObjectDemo();
    //hash code -> int 
    objectdemo.hashCode();
    // another presentation of object reference
    // Because hash code has a short range of value storges
    // so , it cannot store all memory address [object reference] in yout machine

    String str =  "abc"; // String override toString
    System.out.println(str); // abc
    
    System.out.println(objectdemo);
    System.out.println(objectdemo.toString());

    System.out.println("abc hasCode()= "+ str.hashCode()); //96354 // a*31^2 + b*31+c
    Integer i1 =3;
    System.out.println(i1.hashCode());

    Long L1 = 100L;
    System.out.println(L1);

    String s1 = "abc";
    String s2 = "abc";
    System.out.println(s1.equals(s2));

    

      }
}
