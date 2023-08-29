import java.util.Stack;

public class Stack1 {
  public static void main(String[] args) {
    //first in last out
    Stack<String> stack1 = new Stack<>();

    stack1.push("abc");
    stack1.push("def");
    System.out.println(stack1.pop()); //def
    
    stack1.push("xyz");
    stack1.push("abc2");
    
    while(!stack1.isEmpty()){
      System.out.println(stack1.pop()); //def,abc, xyz,abc
    }

    //stack
    stack1.add("fgi");
    stack1.push("ijk");
    stack1.add("ijk");
    System.out.println(stack1);
    
    

  }
}
