package HashMap1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

  public static void main(String[] args) {
    // Background : String [int] ,Array must use int at index
    // limitation: you can only access the element by int index
    // Solution: HashMap <>
    HashMap<String, String> map = new HashMap<>();
    // <String, String> -> <Key, Value>

    map.put("abc", "hello world"); // entry
    map.put("bcd", "I am  Developer"); // entry
    System.out.println(map.size()); // 2 entries

    // Map.Entry -> Key + Value
    // if Duplicated (equal(),hashCode(+)), override the entry

    map.put("abc", "hello world !!!");
    System.out.println(map.get("abc")); // hello world !!!
    System.out.println(map.size()); // 2 entries

    System.out.println(map.isEmpty()); // False
    System.out.println(map.toString()); // {bcd=I am Developer, abc=hello world !!!}
    System.out.println(map); // {bcd=I am Developer, abc=hello world !!!}

    System.out.println(map.remove("abc")); // hello world !!!
    System.out.println(map.remove("bcd", "I am NOT Developer")); // false
    System.out.println(map.remove("bcd", "I am  Developer")); // true

    if (map.containsKey("abc")) {
      return;
    }
    if (map.containsValue("I am Developer")) {
      return;
    }

    //loop Entries
    for(Map.Entry<String,String> entry:map.entrySet()){
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }

    //loop Keys
    for(String key : map.keySet()){
      System.out.println(key);
    }

    //loop Values
     for(String value : map.values()){
      System.out.println(value);
    }

    
  }

}
