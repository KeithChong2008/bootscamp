import java.util.Arrays;
import java.util.Scanner;

public class JavaQuest10 {

  public static void main(String[] args) {

    int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(my_array));

    // Check if the input index is valid
    if (indexPosition < 0 || indexPosition > my_array.length) {
      System.out.println("Invalid index position");
      return;
    }

    // Check if the input index is the last index + 1
    if (indexPosition == my_array.length) {
      System.out.println("New Array: " + Arrays.toString(my_array));
      return;
    }

    // Remove the original last element if necessary
    if (indexPosition < my_array.length) {
      int[] tempArray = new int[my_array.length - 1];
      for (int i = 0, j = 0; i < my_array.length; i++) {
        if (i != indexPosition) {
          tempArray[j++] = my_array[i];
        }
      }
      my_array = tempArray;
    }

    // Insert the new element at the specified index
    int[] newArray = new int[my_array.length + 1];
    for (int i = 0, j = 0; i < newArray.length; i++) {
      if (i == indexPosition) {
        newArray[i] = newValue;
      } else {
        newArray[i] = my_array[j++];
      }
    }

    System.out.println("New Array: " + Arrays.toString(newArray));
  }
}