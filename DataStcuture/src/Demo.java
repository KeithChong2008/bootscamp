package DataStcuture.src;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Demo {
  
  public static void main(String[] args) {
    //ArrayDeque & LinkedList

    Deque<String> arraydeque = new ArrayDeque<>(); // Array
    arraydeque.addFirst("a");
    arraydeque.addLast("a");
    arraydeque.pollFirst();
    arraydeque.pollLast();

    Deque<String> linkedlist = new LinkedList<>(); //Linked List
    linkedlist .addFirst("a");
    linkedlist .addLast("a");
    linkedlist .pollFirst();
    linkedlist .pollLast();

    Queue<String> queue = new LinkedList<>(); //Linked List
    queue .add("a");
    queue.poll();
    queue.remove();

    Queue<String> pQueue = new PriorityQueue<>(); //array 
    pQueue.add("a");
    pQueue.poll();

    List<Integer> list = new ArrayList<>(); //array
    List<Integer> list2 = new LinkedList<>(); // linked list
    //linkedlist.poll();
    list2.add(3);
    list2.remove(3);

    List<String> stack = new Stack<>();
    stack.add("abc");
    stack.remove(0);


    Vector <String> stack2 = new Stack<>();
    stack2.add("abc");
    stack2.remove(0);

    Stack<String> stack3 = new Stack<>();
    stack3.push("abc");
    stack3.pop();

    

  }
}
