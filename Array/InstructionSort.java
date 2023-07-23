package Array;


public class InstructionSort {
  public static int[] sort(int[] arr){

  }
  public static void main(String[] args) {
    int [] nums = new int[]{5,1,4,2,8};
    int temp,j;
    for(int i =1; i<nums.length;++i){
        temp = nums[i];
      for (j =i-1; j>=0 && nums[j]>temp;--j){
          nums[j+1] = nums[j];
      }
      nums[j+1] = temp;
    }

  }
}

//[5,1,4,8,2] 
//Step 1.1: [1,5,4,8,2](insert 1 to arr[0],i<5)
//After round 1, [1,5] is sorted

//Step 2.1: Compare 4<5
//Step 2.2: [1,4,5] is sorted
//After round 2, [1,4,5] is sorted


