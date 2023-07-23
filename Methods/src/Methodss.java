package Methods.src; // 18 July

import javax.sound.midi.SysexMessage;

public class Methodss {
    public static void print(){//method name: print
      System.out.println("Hello in print() method");
    }

    public static int sum(int a, int b){ // Method: bring somting in, take someting out
      //void = Have return keyword and no things can return
      // left int = return type
      // the int inside the bracket are parameters
      int c = a+b; 
      return c;
    }

    public static double substract(int x, int y){
      return x-y; 
    }
    public static void method(String str){
      if(str ==null|| "".equals(str)){ //null is not empty, empty->""
        return;
      }
      System.out.println(str);
    }
    public static double pi(){
       return 3.14159;
    }



    public static void main (String [] args){ //method name: main
      String str = "Hello";

      str = str + "world";//append oerpation
      //Approach 1
      System.out.println("Hello in print() method");

      //Appraoch 1
      print(); //print "Hello in print() method"

      int x = 10;
      int y = 100;
      int sum = x+y; // 110
      //

      //Appraoch 2
      int z = sum(x,y);
      int i = sum(1000,-30);//
      //int o = sum("hello",1233);//error and the type is not suitable
      System.out.println(i);
      System.out.println(z);
      //

      if (sum(1000,-30)==970){
        System.out.println("the sum is 970");
      }

      if (i==970){
        System.out.println("the sum is 970");
      }


      method("Hello");
      double circleArea = 5*5*pi();
      System.out.println(circleArea);
}
}
