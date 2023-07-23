package Random1;

import java.util.Random;

public class Random1 {
  //A,B,C,D,E
  public static char randomAbcde(){
    //char[] chars = new char[]{'A','B','C','D','E'};
    //return chars[new Random().nextInt(5)];
    return (char) (new Random().nextInt(5)+65);//　６５　＝　ＡＳＣＩＩ　Ｃｏｄｅ　＂Ａ＂
  }


  public static void main(String args []){
    System.out.println(randomAbcde());

  }  
}
