package do_whileloop;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

import Sttring.src.contains;

public class dowhileloop {
  //do-while, do first, than check condition to start looping
  public static void main(String[] args) {
     int count =0;
  do{
    System.out.println("Hello count= " + count);
    count++;
  }while(count <3);

  int input = 0;
  Scanner scanner;
  do {
    scanner = new Scanner(System.in);
    System.out.println("Please enter a integer: ");
    input = scanner.nextInt();
    //input is even->continue 
    //odd->exit and print the number
      
  }while(input %2 ==0);
  if(input%2 == 1){
    System.out.println("input= " + input);
  }

}
}
