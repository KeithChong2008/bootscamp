package ThreadsDemo.src;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {
  AtomicInteger number = new AtomicInteger(0);
  public static void main(String[] args) {
    Test i = new Test();
    // i.number++; // Non- Atomic Operation
    // System.out.println(i.number); //1
    
    Runnable imcrement = ()-> {
      for(int x =0; x<10000; ++x){
        i.number.incrementAndGet(); //i.number++ //Atomic operation
      }
    };

    Thread thread1 = new Thread(imcrement);
    Thread thread2 = new Thread(imcrement);

    thread1.start();
    thread2.start();

    try{
      thread1.join();
      thread2.join();
  }catch(InterruptedException e){

  }
    System.out.println(i.number);


    
}
}