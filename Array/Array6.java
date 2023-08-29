package Array;
public class Array6 {

public static void addOne(int[] arr){ //arr->object reference// Pass by Reference
  for(int i =0; i<arr.length;i++){
    arr[i] = arr[i]+1;
  }
}

public static int[] addOne2(int[] arr){ //Stupid Method
  for(int i =0; i<arr.length;i++){
    arr[i] = arr[i]+1;
  }
  return arr;
}


public static String concat(String s1,String s2){ // pass by value
  s1 = "hello";
  return s1+s2;
}
  public static void main(String[] args) {
    int[] nums = new int[]{3,4,8};
    addOne(nums);//4,5,9

    for(int i=0;i<nums.length;i++){
      System.out.println(nums[i]);
    }
    String a = "abc";
    String b = "def";
    concat(a, b); //hellodef

  }
}
