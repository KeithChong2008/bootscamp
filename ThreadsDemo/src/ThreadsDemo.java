package ThreadsDemo.src;

public class ThreadsDemo {
  
  public static void main(String[] args) {

    //Approach 1: Runnable (lambda) to implement Thread
    //Task Logic

    for(int i =0; i<1000;i++){
      System.out.println("i" + i);
    }


    Runnable printout = () -> System.out.println("Hello World"); //step 4
   //Task
    Thread thread = new Thread(printout); //Task Management

    System.out.println("start thread"); //step 1
    thread.start();//step 2
    System.out.println("end thread"); //step 3

    //Approach 2 : Create PrintOut Class implement Runnable
    Thread thread2 = new Thread(new Printout());
    System.out.println("start thread 2");
    thread2.start();
    System.out.println("end thread 2 ");

    //Approach 3: Create Another 
    Thread thread3 = new Thread(new Printout2());
    thread3.start();

    try{
      thread.join();
      thread2.join();
      thread3.join();
    }catch(InterruptedException e){

    }
    System.out.println("Main Threads End");

  }
}
