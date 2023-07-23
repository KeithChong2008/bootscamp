package WrapperClass;

public class WrapperClass {
  public static void main(String[] args) {
    //Primitives: byte,short......
    //Wrapper Class, corresponding primitive

    boolean isMale =true; // not a object
    Boolean isFemale = true; // object reference

    isFemale = null;//can be null -> If it is object, can be null
    isMale = null;//Cannot be null

    int num =2;
    Integer num2 =4;//Object Reference
    num2 = null;

    num2.toString();
    Integer.valueOf("123");
    Integer num3 =4;

    if(num3.compareTo(3) > 0){
      System.out.println("num3 is >3");
    }

    char c ='a';
    Character c2 = 'A';
    char result =Character.toUpperCase('B');

    //Difference? 
    Character c3 =Character.valueOf('s');
    Character c4 ='s';



    isMale = false;
    if (isMale){

    }
    if(isFemale.compareTo(isMale) == 0);{ //asking if Female with the same value of isMale

    }

  }
}
