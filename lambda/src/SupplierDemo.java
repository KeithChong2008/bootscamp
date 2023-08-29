package lambda.src;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {
  
  public static void main(String[] args) throws Exception {
    Supplier <LocalDate> now = () -> LocalDate.now();
    System.out.println(now.get()); // 2023-08-26

    test(now, LocalDate.of(2023, 8, 16));

    Supplier<Integer> coolingOff = ()-> new Random().nextInt(3);//0,1,2
    test(coolingOff, 3);
    System.out.println(coolingOff.get()); //0,1,2

    Predicate<LocalDate> random = date->date.plusMonths(1).isAfter(LocalDate.now());

    





}
public static<T> void test(Supplier <T> testcase, T result)throws Exception{
  if(testcase.get().equals(result)){
    return;
  }throw new Exception();
}
}