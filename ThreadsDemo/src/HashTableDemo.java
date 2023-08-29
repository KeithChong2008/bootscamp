package ThreadsDemo.src;

import java.util.HashMap;
import java.util.Map;

public class HashTableDemo {

  Map<String, Integer> table = new HashMap<>();
  
  public static void main(String[] args) {
    HashTableDemo t = new HashTableDemo();
    
    Runnable putOne = () ->{
      for(int i =0;i<10000;++i){
      t.table.compute("abc", (key,old)-> old ==null?1:old+1);
      }
    };
    Thread thread1 = new Thread(putOne);
    Thread thread2 = new Thread(putOne);

    thread1.start();
    thread2.start();

    try{
      thread1.join();
      thread2.join();
    }catch(InterruptedException e){

    }
    System.out.println(t.table.get("abc"));
    }
}
