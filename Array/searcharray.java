package Array;
import java.util.Arrays;

public class searcharray {
  public static void main(String []args){ // 17 July 2023
    //search
    char target = 'M';
    char[] chars = new char[]{'j','p','M'};
    for (int i = 0;i<chars.length; ++i){
      if (chars[i] == target){
        System.out.println(i);
      };
      }
      //toCharArrays
      String str= "I am a boy."; //11 characters
      char[] arr = str.toCharArray();
      //arr[11];//error
      System.out.println(Arrays.toString(arr));
      //[I,  , a, m,  , a,  , b, o, y, .]
      
      //Find Max.Value in the array
      int[] nums = new int[]{1,2,3,9,5};
      int max =0;//the min. of int
      for (int i = 0;i<nums.length;i++){
        if(nums[i]> max){
          max = nums[i];
        }
      }System.out.println(max);
      // i =0,nums[0]->240
      // find Min.value in the array
      int[] nums2 = new int[]{1,4,3,9,5};
      int min =100;
      for (int i = 0;i<nums.length;i++){
        if(nums[i]< min){
          min = nums2[i];
        }
      }System.out.println("Min: " + min);
  }
}