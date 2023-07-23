package UpCase.src; // 18 Jul 2023
public class uppercase {
  public static void main(String [] args){
    //Correct Syntax
    // Upcase(Implicit coversition)
    //byte -> short-> int-> float -> double //Quiz 
    //char -> int//Quiz

    byte b =2;// Quiz Range
    short s =b;
    int i = s;
    long l =i;
    float f=l;
    double d =f;
    //char-> int
    char c ='A';
    int j =c;

    //No Developer wil do it
    //Downcasting - cannot do
    double d2 = 10.3d;
    float f2 = (float) d2;//why error? double precision is larger than float
    // developer take responsibility for the risk

    short s2= 128;
    byte b2 = (byte) s2;
    System.out.println(b2);


    //infitely loop
    // for (byte k = 127; k<129; ++k){
    //     System.out.println("Hello");
    // }
    //Remebr asicode 48,65,97 -0,A,a
    char c2 = 'B';
    if (c2 ==66){
      System.out.println("C2 is 66");
    }
    char c3 = 67;
    if(c3 == 'C'){
      System.out.println("c3 is C");
    }
    //ASCII (int) to char
    int g ='a';
    //char k =(char) g2; // downcaseing
    char k2 = 66; //66 is ASCII code

    //
    int h = (int) 1000L; //downcasing Explicit conversion
    byte o = (byte) 9;

    char character = 'a' +1;
    if(character == 'b'){
      System.out.println(character);
    }else if (character == 98){
      System.out.println(character);
    }else if (character >'a'){
      System.out.println(character);
    }

}
}