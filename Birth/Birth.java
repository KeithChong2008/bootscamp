package Birth;

import java.time.LocalDate;
import java.time.Month;

public class Birth {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println(today);
    LocalDate specificDate = LocalDate.of(2023,10,21);
    System.out.println(specificDate);
    LocalDate d1 = LocalDate.parse("2023 -12-30");
    System.out.println(d1.getDayOfYear());
    System.out.println(d1.getDayOfMonth());
    System.out.println(d1.getMonth());

    System.out.println(LocalDate.parse("2023-07-28").getDayOfWeek());
    System.out.println(LocalDate.parse("2023-07-28").getDayOfYear());
    
    System.out.println(d1.plusMonths(1L));
    //plusDays
    //plusYear

    boolean expiry = false;
    if(LocalDate.now().isAfter(d1.plusMonths(3L))){
      expiry =true;
    }


  }
}
