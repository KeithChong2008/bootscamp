package PriorityQueue.src;

import java.util.Queue;

import java.util.PriorityQueue;


public class DemoPQ {
  public static void main(String[] args) {
  Queue <String> queue = new PriorityQueue<>();
  queue.add("bcd");
  queue.add("abc");
  queue.add("def");

  System.out.println(queue.poll()); //abc

  //Priority: Custom Priority by Comparator
  Queue <String> custom = new PriorityQueue<>(new SortByDescending());
  queue.add("bcd");
  queue.add("abc");
  queue.add("def");

  System.out.println(custom.poll()); //def



  }




}
