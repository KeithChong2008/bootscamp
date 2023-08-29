package ThreadsDemo.src;

public class TestSynchorized {
  int number;

  public synchronized void increment(){ // Like a "Atomic" method
    this.number++; // non-atomic operation 
  }
  public static void main(String[] args) {
    TestSynchorized i = new TestSynchorized();

    Runnable formula = () -> {
      for(int x = 0; x<10000; ++x){
        i.increment();
      }
    };
    Thread thread1 = new Thread( formula);
    Thread thread2 = new Thread( formula);

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
