import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue1 {
  public static void main(String[] args) {
    LinkedList <String> queue = new LinkedList<>();
    //First in First out
    queue.add("Hello");
    queue.add("World");
    System.out.println(queue.peek()); //the first one of the queue -> hello
    System.out.println(queue.poll()); //hello
    System.out.println(queue.poll()); // the last one of the queue ->world

    System.out.println(queue.size()); //0 , first one and last one is not counted
    queue.add("abc");
    queue.add("def");
    queue.add("xyz");
    System.out.println(queue.remove("def")); // true
    System.out.println(queue.poll());
    System.out.println(queue.poll());

    System.out.println(queue.offer("ijk")); // add(),  cannot add null
    System.out.println(queue.offer("abc")); // add(),  cannot add null
    System.out.println(queue.offer("ijk")); // add(),  cannot add null
    System.out.println(queue.size()); // 3

    if(queue.contains("ijk")){ // true
      queue.remove("ijk");
    }

    while(!queue.isEmpty()){
      System.out.println(queue.poll()); // abc ijk
    }

    LinkedList<Integer> queueNum = new LinkedList<>();
    queueNum.add(10);
    queueNum.add(10); // 2nd even number
    queueNum.add(9);
    queueNum.add(0); 
    queueNum.add(-3);
    queueNum.add(100);
    queueNum.add(10);

    int count =0;
    int element =0;
    int countEven =0;
    int size = queueNum.size(); // 0,1,2,3,4,5,6
    int i=0;


     while(i++ < size){
      element = queueNum.poll();
      if(element % 2 ==0 && ++countEven == 2){
          continue;
        }
        queueNum.add(element);
      }
      
      System.out.println(queueNum);

    
      


  }
}
