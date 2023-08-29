package ThreadsDemo.src;

public class TestSyncronizedLock {
  int x;
  Object lock = new Object();
  Object lock2 = new Object();


  public int caculate(int amount){
    int total = amount;
    synchronized(this.lock){
      this.x++;
    }
    //codes......
    //Can be more than one synchronized code block
    //synchronized(this.lock)
    // this.increment();// x++
    return total + this.x;
  }

  // public synchronized void increment(){
  //   this.x++;
  // }


  public static void main(String[] args) {
    TestSyncronizedLock obj = new TestSyncronizedLock();
    Runnable formula = ()-> {
      for(int x =0; x<10000; ++x){
        obj.caculate(0);
      }
    };

    Thread thread1 = new Thread(formula);
    Thread thread2 = new Thread(formula);

    thread1.start();
    thread2.start();

    try{
      thread1.join();
      thread2.join();
  }catch(InterruptedException e){

  }
    System.out.println(obj.length());
  }
  
  }
}
