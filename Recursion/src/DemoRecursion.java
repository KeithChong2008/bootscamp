public class DemoRecursion{

  public static int sum(int k){
    if(k<1){
      return k; // base condition // reduce Memory
    }
      return k+ sum(k-1);
    
    //sum(10), No return
    //10+sum(9) , No return
    //9+sum(8) , No return
    //....
    //1 +sum(0), No return
    //0 < 1,return 0;
  }

  //Question 2:
  // 0, 1, 1,2,3,5,8,13.... kth element
  // k =7 , return 8
  // K =

  public static int sum2(int k){
    if (k <= 1){
      return k;
  }
    return sum2(k - 1) + sum2(k - 2); // Thinking Pattern, Don't think Results
  }

//Question 3:
//3,2,1,1,2,3 k =3
// non-tail recursion
    public static void printl(int k){
      // base condition
      if(k<1){
        return;
      }
    System.out.print(k+ " "); //3
    printl(k-1);// print(2)
    System.out.print(k+ " "); //2
}
    

  public static void main(String[] args) {


  }

  
}