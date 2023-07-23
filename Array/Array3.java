package Array;
import java.util.Arrays;

public class Array3 { // 19 July 2023
  
  //int / int
  public static double average(int[] arr){
    //caculate the average of all number in arr;
    double sum = 0;
    for (int i =0;i<arr.length;++i){
      sum = sum + arr[i];
    }
     return sum /(arr.length);   // 5/3 -> 1 -> 1.0
  }
    

  public static void main (String args[]){
    int[] nums = new int[]{8,3,-10,30,100,-19};
    // Move the max number to the tail
    //{8,3,-10,30,-19,100};

    int maxvalue = -100;
    int index = 0;
    
    //Step 1 : Find the Indexxx of the max number
    for (int i=0;i<nums.length;i++){
      if (nums[i]> maxvalue ){
        maxvalue = nums[i];
        index = i;
      }
  }

  //Step 2: Swap the max number to tail
  int temp =nums[index];
  nums[index] =nums[nums.length-1];// tail must be length -1
  nums[nums.length-1] = temp;

  System.out.println(Arrays.toString(nums));
  System.out.println(average(nums));

  

  }
}