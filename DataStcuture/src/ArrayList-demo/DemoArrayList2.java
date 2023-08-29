import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList2 {
  public static void main(String[] args) {
    // ArrayList String

    ArrayList<String> strs = new ArrayList<>();
    strs.add("abc");
    strs.add("def");
    strs.add("xyz");
    strs.add("def");

    System.out.println(strs.subList(1, 2)); // def
    // Remove the first occurence of "def"
    strs.remove("def"); // remove by Object [abc,xyz,def]
    System.out.println(strs);

    strs.remove(1);
    System.out.println(strs);

    // Iterator<String> Iterator = strs.iterator();
    while (strs.iterator().hasNext()) {
      System.out.println(strs.iterator().next());
    }
    for (String s : strs) { // for-each support Array and ArrayList
      System.out.println(s);
    }

    Object[] objects = strs.toArray(); // ArrayList<String> -> Object[]
    for (Object o : objects) {
      if (o instanceof String) {
        String str = (String) o;
      }
    }

    // Array-> ArrayList

    String[] strings = new String[] { "hello", "world", "!" };

    List<String> s2 = new ArrayList<>();

    // Read Only->Big Bugs
    List<String> StringList = Arrays.asList(strings);
    StringList.add("abc"); // run-time error
    System.out.println(StringList);

    // Read & Write (Correct Solution)
    List<String> StringList2 = new ArrayList<>(Arrays.asList(strings));
    StringList2.add("ijk");
    System.out.println(StringList2);

    

  }
}
