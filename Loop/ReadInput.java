package Loop;
import java.util.Scanner;
public class ReadInput {
    public static void main(String args[]){
        //Scanner -> read user input
        System.out.println("Please input an integer: ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt(); // read user input, expecting it is an integer
        System.out.println("input= " + input);

        for(int i = 0; i<input; ++i){
            System.out.println("Hello");
        }
    //continue
            for(int i =0;i<6;++i){
                System.out.println("Hello");
                if(i>3){
                    continue;// next
                }
                System.out.println("Bye");
            //
    }       
        
}
}