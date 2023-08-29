package ThreadsDemo.src;

public class TestStringBuffer {

  public static void main(String[] args) {
    StringBuffer sf = new StringBuffer();

    Runnable appendS = ()-> {
      for(int x =0; x<10000; ++x){
        sf.append("s");
      }
    };

    Thread thread1 = new Thread(appendS);
    Thread thread2 = new Thread(appendS);

    thread1.start();
    thread2.start();

    try{
      thread1.join();
      thread2.join();
  }catch(InterruptedException e){

  }
    System.out.println(sf.length());
  }
  


}
