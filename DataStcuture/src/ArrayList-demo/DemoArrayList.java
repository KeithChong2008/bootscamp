import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 };
        Integer[] integers = new Integer[] { 1, 2, 3 };
        // Fixed-length
        // for both primitive and class
        // resize, create new object
        integers = new Integer[] { 1, 3, 2, 4 };
        // integers[2] = "abc"; // compile-time error

        ArrayList<Integer> numbers = new ArrayList<>();
        // Initialization
        ArrayList<Integer> numbers2 = new ArrayList<>(); // empty array
        numbers2.add(1);
        numbers2.add(3);
        numbers2.add(2);
        numbers2.add(4);
        numbers2.add(null);
        // numbers2.add (Integer)(Long.valueOf(3)); long.value(3); // Cannot cast Long
        // to Integer
        // variable length

        // Coversion ArrayList -> Array
        Integer[] arr2 = new Integer[numbers2.size()];
        arr2 = numbers2.toArray(arr2); // Define output array type for toArray() perform conversion
        System.out.println(Arrays.toString(arr2));

        // ArrayList<Int>, not support primitive

        for (int i = 0; i < numbers2.size(); ++i) {
            System.out.println(numbers2.get(i)); // Possibe to hae IndexOutofBonds
        }
        int original = numbers2.set(2, 100);

        numbers2.clear(); // remove all elements
        numbers2.isEmpty();

        ArrayList<Integer> number3 = new ArrayList<>();
        number3.add(2000);
        number3.add(1000);

        numbers2.addAll(number3); // add all items from numbers3 to numbers2

        numbers2.remove(1);

        numbers2.removeAll(number3);

        numbers2.indexOf(1000);
        numbers2.indexOf(3);

        System.out.println(numbers2);

        numbers2.clear();
        
        numbers.add(1,4);
        numbers.remove(4);

        //numbers2.contains(3);// boolean method

        
    }
}
