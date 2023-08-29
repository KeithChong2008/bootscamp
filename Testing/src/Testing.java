import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Testing {
    public static int hammingWeight(int n) {
        String str = String.valueOf(n);
        int count =0;
        for (int i =0; i<str.length(); ++i){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }


public static void main(String[] args) {
   System.out.println(hammingWeight(00000000000000000000000000001011));   
}
  
}