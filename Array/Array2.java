package Array;

import java.util.Arrays;

public class Array2 {
  public static int[] SwapArray (int[] arr){// 18 July 2023 -> Decide the method by name and input parameters
      int temp =arr[0];
       arr[0] =arr[arr.length-1];
      arr[arr.length-1] = temp;
      return arr;
  }
  public static char[] SwapExample (String str){ //18 July 2023
    //hello! -> ehll!o -> first -> second, third -> fourth......
    //abcd -> badc
    //aabb -> aabb
    //tips: toChat Array
    char[] arr= str.toCharArray();
    for (int i =0;i<arr.length-1;++i){
      if(i%2 ==0){
      char temp =arr[i];
      arr[i] =arr[i+1];
      arr[i+1] = temp;
      }
    }
    return arr;
    //return String.valueOf(arr); // swap it to String 
    // retun String.of(chars);
  }

  public static void main(String args []){ // 18 July 2023
    //Swap
    int [] arr = new int[]{100,-400,3,99};
    int temp =arr[0];
    arr[0] =arr[arr.length-1];
    arr[arr.length-1] = temp;

     //for (int i =0; i<arr.length; ++i){}
       //System.out.println(Arrays.toString(SwapArray(arr)));
       String arr = "abc";
    System.out.println(SwapExample(arr));

    //StringValueof() // 19 July2023
    String str1 = String.valueOf(123); //"123"
    String str2 = String.valueOf(true);//"true"

    

  }
}
