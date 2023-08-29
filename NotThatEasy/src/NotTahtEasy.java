package NotThatEasy.src;

import java.util.ArrayList;
import java.util.List;

public class NotTahtEasy {
  
  static final List<Character> characters;

  private static final char[] chars = {'J', 'a','c','k','y'};

  final int x = method2();

  static List<Character> method(){
    System.out.println("I am a static method");
    return new ArrayList<>();
  }
  static int method2(){
    System.out.println(" I am static method");
    return 1;
  }
  static{
    characters = new ArrayList<>();
  }

  // initialization code block

    {
     System.out.println(" I am initialization code block"); 
    }

    public static String recursive(char aa, char bb) {
      if (aa == bb) {
          return String.valueOf(aa);
      } else {
          return aa + recursive((char)(aa + 1), bb);
      }
  }

  public static void main(String[] args) {
    //Once you click the run buttons
    //1.Compile
    //2.Run -> Class loader -> stack memory

    System.out.println("state of main");
    NotTahtEasy obj = new NotTahtEasy();

    System.out.println(recursive('a','e'));

    
  }
}
