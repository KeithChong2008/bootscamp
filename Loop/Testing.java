package Loop;
import java.util.Scanner;
public class Testing {
   public static void main(String[] args) {
    System.out.println("Input the Weight: ");
    Scanner input = new Scanner(System.in);
    double Weight = input.nextDouble();
    System.out.println("Weight: " + Weight);

    String category = new String();
    if(Weight >=8){
      category = "Heavy";
    }else if(Weight >=2 && Weight <8 ){
      category = "Medium";
    }else if (Weight <2 ){
      category = "Light";
    }
    System.out.println(category);
  }
}
