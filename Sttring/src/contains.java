package Sttring.src;
import java.lang.String;
public class contains {
  public static void main (String[]args){
    //contains
    String s = "hello";
    System.out.println(s.contains(s)); //true (hello contains lo)
    System.out.println(s.contains("ol"));//false (hello Not contains ol)
      if(s.contains("lo")){
        System.out.println("Yes");
      }
      s = s.toUpperCase();
      System.out.println(s);//HELLO
      s += s.toLowerCase();
      System.out.println(s);//HELLOhello
  }
}
