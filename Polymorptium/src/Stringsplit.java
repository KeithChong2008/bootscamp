public class Stringsplit {
  public static void main(String[] args) {
    String s = "abc def xyz";

    for(String str: s.split(" ")){
      System.out.println(str);
    }
    for(String str: s.split("\\s")){
      System.out.println(str); // \s means space
    }
    String s2 = " abc              def          xyz";
     for(String str: s2.trim().split("\\s+")){
      System.out.println(str); // \s means space
    }
    
  }
}
