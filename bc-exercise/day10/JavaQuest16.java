import java.util.*;

public class JavaQuest16 {
  // Given an integer n (n > 0), Find n unique Integers Sum up to Zero

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] nums = sumToZero(5); // n = 5
    System.out.println(Arrays.toString(nums));
    int[] nums1 = sumToZero(3); // n = 3
    System.out.println(Arrays.toString(nums1));
    int[] nums2 = sumToZero(2); // n = 2
    System.out.println(Arrays.toString(nums2));
    int[] nums3 = sumToZero(1); // n = 1
    System.out.println(Arrays.toString(nums3));
  }

  public static int[] sumToZero(int n) {
    int[] result = new int[n];
    int i = 0;
    while (i < n / 2) {
      result[2 * i] = i + 1;
      result[2 * i + 1] = -i - 1;
      i++;
    }
    if (n % 2 == 1) {
      result[n - 1] = 0;
    }
    return result;
  }
}