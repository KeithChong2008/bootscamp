package RevisionDemo.src;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;


import dobuleclass.doubleproblrm;

public class Superman implements Flyable {
    @Override
    public void fly(){
      System.out.println("I am flying");
    }

 

    public static void main(String[] args) {
      //3 ways to new a flyable object

      //1.Polymorphism
      Flyable superman = new Superman();

      //2. Anonymous
      Flyable superman2 = new Flyable() {
        @Override
      public void fly(){
        System.out.println("I am Flying");
      };
    };

    //3.Lambda
    Flyable superman3 = () -> System.out.println(" I am Lambda");
    
    Optional <String> string = Optional.of("abc");
    //int sum =0;

    string.ifPresent(e -> {
      //sum++;
      String s ="";
    });
    //s = s+ "HELLO";

    int total =0;
    if(string.isPresent()){
      total++;
      //String s = "";
    }
    //s = s + "";

    Arrays.asList(1,2,3,4).stream()//
    .count();
    }

    public static double add(double a, double b){
      return BigDecimal.valueOf(a).add(BigDecimal.valueOf(b).doubleValue());
    }
}
