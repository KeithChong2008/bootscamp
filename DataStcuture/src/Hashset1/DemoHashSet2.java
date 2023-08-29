package Hashset1;

import java.util.HashSet;

public class DemoHashSet2 {
    public static Byte bytes(int num){
      return Byte.valueOf((byte) num);
    }
  public static void main(String[] args) {
    //Hashset
    HashSet <Byte> bytes = new HashSet<>();
    bytes.add((byte) 4); //XX int->byte ->Byte
    //Java is not necessary to handle return value
    boolean isadded10 = bytes.add(bytes(10));
    boolean isadded4 = bytes.add(bytes(4));
    System.out.println(isadded4); //false

    HashSet <Byte> byte2 = new HashSet<>();
    byte2.add((byte)4);
    byte2.add((byte)10);

    System.out.println(byte2);
    System.out.println(bytes.equals(byte2)); //true , Byte.equals()

    Boolean isremoved10 = bytes.remove((byte) 10);
    System.out.println(isremoved10); //true



    //Demo-Example 3
    HashSet<Book> books = new HashSet<>();
    System.out.println(books.add(new Book("Mary"))); //true
    books.add(new Book("Tom")); //true , diff address
    System.out.println(books.add(new Book("Mary"))); //true. diff address







  }
}
