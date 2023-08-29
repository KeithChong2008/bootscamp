package DemoVar.src;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class VarDemo {
  //Not allowed
  //Var age;

    public static List<List<String>> getString(){

      return Arrays.asList(Arrays.asList("abc"));
    }

    //Not allowed Here
    // public static var add(int x, int y){
    //   return x+y;
    // }

    //Not allowed Here
    // public static int add(var x, var y){
    //   return x+y;
    // }
  
  public static void main(String[] args) throws Exception {
    var s = "Hello";
    // s =3; //error, compile-check -> String
    var i = 2;
    var c = 'a';

   

    // var is not allowed to use array
    //var[] arr = new var[3];


    //var is not allowed to use Null
    // var d = null;


    //Loop
    List<String> strings = Arrays.asList("abc", "def");
    for(var str: strings){
      System.out.println(str);
    }

    Map<String, Integer> map = new HashMap<>();
    map.put("a",1);
    map.put("b",2);

    for(var entry: map.entrySet()){
      System.out.println(entry.getKey() + " " +entry.getValue());
    }
    var result =  getString();
    result.add(Arrays.asList("dev","xyz"));
    result.add(Arrays.asList("ijk"));
  }

}
