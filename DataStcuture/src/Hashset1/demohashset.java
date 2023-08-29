package Hashset1;

import java.util.HashSet;

public class demohashset {
  //Hashsets is good at handling duplicates
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    System.out.println(strings.add("abc")); //true
    strings.add("def");
    System.out.println(strings.size()); //2
    
    //Hashsets
    boolean result = strings.add("abc");  //reduce dupliate value
    System.out.println(strings.size());//2
    System.out.println(result); // false

    if(strings.add("def")){ // false
      System.out.println("def is added");
    }else{
      System.out.println("def is not added");
    }

    //Example 2:
    HashSet<Coordinate> coordinates = new HashSet<>();
    Coordinate c1 = new Coordinate(1, 1);
    Coordinate c2 = new Coordinate(1, 1);
    coordinates.add(c1); // true
    coordinates.add(c2); // false
    System.out.println(coordinates.size()); //1

    // Hash add() -> Coordinate c2.equals(any of coordinates in hashset)
    //                c2.equal(c1) -> true
    //                Hashset not allow duplicates
    //                return false


    Coordinate c3 = new Coordinate(2, 1);
    System.out.println(coordinates.add(c3));
    System.out.println(coordinates.size());
    
  }

}
