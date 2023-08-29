package dobuleclass;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class doubleproblrm {
  public static void main(String[] args) {
      double result = 0.1+0.2;
      System.out.println(result);
      if (result == 0.3){
        System.out.println(result);
      }else{
        System.out.println("Wrong");
      }
      System.out.println(0.3/0.1);
      System.out.println(0.2*0.1);

      BigDecimal b =new BigDecimal(5);
      BigDecimal b2 = BigDecimal.valueOf(4);
      //BigDecimal b3 =5.0; // no
      double d = 5.0d;

      System.out.println(b.multiply(b));//25
      System.out.println(b.subtract(b2));//5-4 =1
      System.out.println(b.add(b2)); // 5+5 =10
      System.out.println(b.divide(b));
      System.out.println(b.add(new BigDecimal(7))); //5+7 =12

      System.out.println(b.compareTo(b2));
      System.out.println(b2.compareTo(b));
      System.out.println(b.compareTo(BigDecimal.valueOf(5)));

      BigDecimal d3 = BigDecimal.valueOf(3.457);
      System.out.println(d3.setScale(2, RoundingMode.UP));
      System.out.println(d3.setScale(2, RoundingMode.DOWN));

      System.out.println(d3.equals(b2));
      BigDecimal d4 = BigDecimal.valueOf(5);
      System.out.println(b.equals(d4));

      System.out.println(d4.remainder(d4, null));




  }

  
}
