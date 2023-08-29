package lambda.src;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

  public static <T> void test(Predicate <T> testcase, T data,boolean result)throws Exception{
    if(testcase.test(data) == result){
      return;
    }throw new Exception();
    }

    public static <T,U> void test(BiPredicate <T,U> testcase, T data,U data2,boolean result)throws Exception{
    if(testcase.test(data,data2) == result){
      return;
    }throw new Exception();
    }
  
  public static void main(String[] args) throws Exception {
    Predicate<Character> isMale = c-> c == 'M';
    Predicate<String> isUpperCase = s->{
      for(int i =0;i<s.length();++i){
        if(s.charAt(i)<65 || s.charAt(i)>90){
          return false;
        }
      }
      return true;
    };


    test(isMale, 'F',false);
    test(isMale,'M',true);
    test(isUpperCase,"ABCaD",false);
    test(isUpperCase,"ABCDD",true);


    BiPredicate<String,String> equals = (s1,s2) -> s1 !=null && s1.equals(s2);
    




  }
}
