package String3;

public class Integer3 {
  // Internal Cache (-128 to 127)
  public static void main(String[] args) {
      Integer i1 = 100;
      Integer i2 = 100;

      System.out.println(i1 == i2); //value or address?

      Integer i3 = 128;
      Integer i4 = 128;
      if (i3 == 128){ //i3 ->int
          System.out.println(i3 == i4);
      }
 

      Integer i5 = -127;
      Integer i6 = -127;
      System.out.println(i5 == i6);

    Byte b1 = 127;
    //Byte b2 = new Byte(127); Error, as destroy Internal Cache
    
    //Short,Long (-128 to 127)
    //flow , double no cache
    
    Boolean boo1 =false;
    Boolean boo2 = false;
    System.out.println(boo1 == boo2); //true, sme address
    
    //Internal Cache -> ASCII
    Character c1 = 'Ϩ';
    Character c2 = 'Ϩ';
    char c3 = 'Ϩ';
    char c4 = 'Ϩ';
    

    System.out.println(c1 == c2); //true, same address
    System.out.println(c3 == c4);//false
    
    Integer i9= Integer.valueOf(128);//New Object //128 <- Internal Cache
    Integer i10 = 128;
    System.out.println(i9 == i10);

    




    }
}
