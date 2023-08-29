import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedMap;

public class DemoArrayQueue {

public static void run(Deque<String> deque){
      deque.addFirst("SS");
      deque.addLast("ss");
}

public static void run(Queue<String> queue){
      queue.add("SS");
      queue.add("ss");
}
  
  public static void main(String[] args) {

    ArrayDeque <String> strings = new ArrayDeque<>();
    strings.add("abc");
    strings.add("def");
    strings.add("adc");

    System.out.println(strings.poll()); // abc
    System.out.println(strings.size()); //2

    strings.addLast("xyz"); // addLast() = add()
    System.out.println(strings.poll()); //def

    strings.addFirst("ijk"); // head
    System.out.println(strings.peek()); //ijk

    strings.pollFirst(); //ijk, pollFirst() =poll() 
    strings.pollLast(); //xyz

    Queue <String> queue = new LinkedList<>();
    Deque <String> deque = new LinkedList<>();

    run(new LinkedList<>());
    run(new ArrayDeque<>());
    //run(new PriorityQueue());
    

    queue.add("abc");
    queue.add("abc");
    deque.addFirst("def");
    deque.addFirst("ijk");

    Queue<String> LList = new LinkedList<>(); // Hide Queue Methods














  }
}
