package do_whileloop;
import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    //1-100
    //boom:45(Random number)
    //user input:30 
    //Next round: Please input a number:31-100
    //user input:60
    //Next round: pleaae input a numer:631-100
    //user input:45
    //exit loop.boomb!
    // Not clear understand the requirments
    int min = 1;
    int max = 100;
    int bomb = new Random().nextInt(100)+1;
    int input = 0;
    boolean isWin = false;
     do {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input the number from "+ min + " to "+ max);
    input = scanner.nextInt();
    if (input<min || input>max){
      System.out.println("Please re-input ");
      continue;
     }
     
    if(input>bomb ){
      max = input;
    }else if(input<bomb){
      min =input;
    }else if (input == bomb){
      System.out.println("You bomb");
      isWin = true;
    }

  }while(!isWin);
   
  }
}
