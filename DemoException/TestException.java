package DemoException;

public class TestException {

  public static int method(int amount) throws BusinessException{
    if(amount >=0){
      return amount *100;
    } 
    throw new BusinessException(("amount <0"));
  }

  // public static int method2(int amount) throws ABCexception{
  //    if(amount >=0){
  //     return amount *100;
  //   } 
  //   throw new ABCexception();
  // }

  //Appraoch 2: throws the BusinessException in method signature
  public static void main(String[] args) throws BusinessException {
    //Exception // check Exception

    //RunTimeException // unchecked exception
    //Approach 1: handledby try,catch
    try{
      int result = method(100);
    }catch(BusinessException e){
      System.out.println(e.getMessage()); // amount <0
    }

    //Approach2 : throw the Business Exception in method signature

    int result = method(-3);

  }
}
