package do_whileloop;

import java.util.Arrays;

public class Loop2 {
  public static void main(String[] args) {
    for (int i = 0; i < 3; ++i) {
      System.out.println("basic for loop: Hello");
    }

    // For-each Loop
    // Diffrence of for-each:
    //1.for-each do not have stop condition/modification/counter in loop signature
    //2.Cannot do compare

    int[] arr = new int[] { 1, 2, 3, 4 };

    // for (dataset)
    for (int x : arr) {// loop through all elements
      System.out.println("for-each: Hello" + x);
      System.out.println(arr[0]); 
      //modification
      arr[0] = 8;
    } 
    // loss the index but you can still acccess element by index
    // cannot go thorught start by tail and must go through by head first
    // must run one by one
    
    //(1,4,10,13,20,0)
    //1,0
    //4,20
    //10,13

    for (int i = arr.length/2; i < arr.length; i++) {// counter
      if(i>arr.length/2){
        break;
      }

      System.out.println("for-each: Hello");
      System.out.println(""+arr[i]+arr[arr.length-i-1]);
      arr[0] = 9;

    }

    //String arr
    String [] strs = new String[]{"Hello,", "World"};
    for (String i: strs){
    System.out.println(i); 
    System.out.println();//SOUT
    }
    
    //Interger ,character (Wrapper Class)
    Character [] chars =new Character[]{'L','a','!','('};
    for(Character c : chars){
      System.out.println(c);
    }

    String s2 ="Hello World! I am Keith";

    String [] strings = s2.split(" ");
    for (String s: strings){
      System.out.println(s);
    }

    //Without using split, use a for loop to split s2
    //Output: String[]
    //substing
    //toCharArray

    String a1 =s2.substring(0,5);
    String a2 =s2.substring(6,12);
    String a3 =s2.substring(13, 14);
    String a4 =s2.substring(15, 17);
    String a5 = s2.substring(18,23);

   String str3[] = new String[]{a1,a2,a3,a4,a5};
   for(int i =0; i<str3.length; i++){
    System.out.println(str3[i]);
  }
  //Approach 1: substring()
  //Count spaces
  int spacecount = 0;
  for(int i=0;i<s2.length();++i){
    if(s2.charAt(i) == ' '){
      spacecount++;
    }
  }
  int startIdx = 0;
  int index = 0;
  String [] result = new String[spacecount+1];
  for (int i =0;i<s2.length();++i){
    if(s2.charAt(i) == ' '){
      result[index] =s2.substring(startIdx, i);
      index++;
      startIdx = i+1;
    }else if(i==s2.length()-1){
      result[index] = s2.substring(startIdx, s2.length());
    }

  }


  
  }
}
