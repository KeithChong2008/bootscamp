package String3;

public class String3 {
  // String Lifteral Pool (Heap) + String is immuatable
  public static void main(String[] args) {
    String str = "abc";
    String str2 = "abc";

    System.out.println(str.equals(str2)); // true, "abc" is same as "abc"
    System.out.println(str == str2);// true,same value (Literal Lool)

    // String Literal Pool -> 'abc'

    String str3 = "abcd";
    System.out.println(str.equals(str3)); // false
    System.out.println(str == str3); // false, their address are nto same

    str = "abc100"; // beacuse "abc100" is not equal to "abc" ->immutable
    System.out.println(str == str2);

    String temp = str;
    String str4 = new String("abc100"); // new object
    System.out.println(temp == str);// false




  }

}
