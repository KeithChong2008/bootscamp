package ThreadsDemo.src;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestVictor { 
   Vector<Integer> integers = new Vector<>();

  public static void main(String[] args) {
    TestVictor t  = new TestVictor();

    Runnable add = ()->{
      for(int i =0; i<10000; i++){
        t.integers.add(1);
      }
 };
      
    Thread thread1 = new Thread(add);
    Thread thread2 = new Thread(add);

    thread1.start();
    thread2.start();

    try{
      thread1.join();
      thread2.join();
  }catch(InterruptedException e){

  }
    System.out.println(t.integers.size());

   
  }
}
