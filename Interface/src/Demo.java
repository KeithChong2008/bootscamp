import java.util.Arrays;
import java.util.Random;

public class Demo {

  int age;

  public static void main(String[] args) {
    int[] nums = new int [3];
    // int nums -> declaration
    // new int[3] -> intialization

    nums = new int[]{1,2,3,4,5,6,7,8,9,10}; // re-assignment

    int[] [] matrix = new int [3][4]; // new int [row][column]
    //3 rows x 4 columns
    //1,2,3,10
    //4,5,6,7
    //10,2,3,1

    //random a number and assign to an 2D array 12(0-12)
    for(int i =0; i<matrix.length; ++i){ //0,1,2
      // matrix[0] -> return int[]
      // matrix [0][2] ->Get the idx 2 from the array of the row 0
      for (int j =0; j<matrix[i].length; ++j){//0,1,2,3
          matrix[i][j] = new Random().nextInt(13);
      }
    }
    System.out.println(Arrays.deepToString(matrix));

    //Convert 2D Array -> 1D Array
    int idx =0;
    int[] arr = new int[matrix.length * matrix[0].length];
    for(int i =0; i<matrix.length; ++i){
      for (int j =0; j<matrix[i].length; ++j){
        arr[idx++] = matrix[i][j];
      }
    }
    System.out.println(Arrays.toString(arr));

    //Convert 2D array to a String
    String str = "";
    for(int i =0; i<matrix.length; ++i){
      for (int j =0; j<matrix[i].length; ++j){
        str += matrix[i][j];
      }
    }
    System.out.println(str);

    //3D array
    int[][][] nums2 = new int[1][2][3];

    //4D array
    int[][][][] num3 = new int[1][2][3][4];

    Demo2[][] demo = new Demo2[2][2];

    // for(int i=0; i<demo.length;++i){
    //   for(int j =0;j<demo[0].length;j++){
    //     System.out.println(demo[i][j].age); //print age of each demo objects.
    //   }
    // }

    // String [][] strings = new String[][]{{"abc","def"},{"efg","hij"}};
    // for(int i=0; i<strings.length;++i){
    //   for(int j =0;j<strings[0].length;j++){
    //     System.out.println(strings[i][j]);
    //   }
    // }

    




  }
}
