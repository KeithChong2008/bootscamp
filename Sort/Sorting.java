package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sorting {
  
  public static void main(String[] args) {
    int [] arr = new int[]{-4,-10,9,-20,100};
    Arrays.sort(arr); // n * log(n) , merge sort
    System.out.println(Arrays.toString(arr));

    ArrayList <Integer> arrayList = new ArrayList<>();
    arrayList.add(100);
    arrayList.add(-100);
    arrayList.add(-80);
    arrayList.add(4);

    Collections.sort(arrayList); // nlogn, accending sorting

    System.out.println(arrayList);

    ArrayList <Ball> balls = new ArrayList<>();
    balls.add(new Ball(4, Color.YELLOW));
    balls.add(new Ball(1,Color.RED));
    balls.add(new Ball(5,Color.BLUE));
    balls.add(new Ball(100,Color.BLUE));
    Collections.sort(balls);

    System.out.println(balls);



  }
}
