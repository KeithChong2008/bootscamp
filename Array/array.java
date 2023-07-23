package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array {
  public static void main (String[] args){

    //Crate Empty Array (Approach 1)
    int[] nums =new int[3]; // 3 is the length of the array nums
    // with index 0,1,2(you can treat it as address)
    // char[], int[]. double[],String[]
    nums[0] =-40;
    nums[1] = 500;
    nums[2]= 100;

    double[] dou = new double[3];
    dou[0] = 2.0;
    dou[1] = 1.1;
    dou[2] = 2.3;

    String [] str = new String[3];
    str [0] = "Keith";
    str[1] = "Catherine"; 
    str [2] = "Debby";

    char [] cha = new char[3];
    cha[0] = 'A';
    cha[2] = 'C';

    for(int i =0; i<str.length; i++){// nums.length->3
      System.out.println("nums["+ i +"]: " + str[i]);
    }
    
    // reversely print array nums
    
    for (int i =str.length-1; i>=0; i--){
      System.out.println("nums["+ i +"]: " + str[i]);
    }
    
    // Approach 2, create array
    int[] array = new int[]{3,9,12};
    for (int i=0; i<array.length;i++){
        System.out.println("array["+ i +"]: " + array[i]);
    }
    //Caannot add a new element at tail
    //Modify an element
    array[2] = -10;
    //Acceess an element
    int index =2;
    System.out.println(array[index]); //-10

    for (int i = 0;i<cha.length;i++){
        System.out.println("cha["+ i +"]: " + cha[i]);
    }

    long[] numbers = new long[12];
        for (int i = 0;i<numbers.length;i++){
        System.out.println("numbers["+ i +"]: " + numbers[i]);
    }
    // boolean array

    boolean[] bool = new boolean[3];
      for (int i = 0;i<bool.length;i++){
        System.out.println("bool["+ i +"]: " + bool[i]);
    }
    String []strs = new String[]{"Hello", "abc","Goodbye"};
    strs[1] = "Typhoon";
      for (int i = 0;i<strs.length;i++){
        System.out.println("strs["+ i +"]: " + strs[i]);
    }
    String []fruits = new String[5];
    fruits[0] = "Apple";
    fruits[1] = "Watermelon";
    fruits[2] = "Orange";
    //null
    //null
    System.out.println(Arrays.toString(fruits));

    byte[] bytes = new byte[6];
    bytes[3] = -4;
    System.out.println(Arrays.toString(bytes));

    

    }
}
