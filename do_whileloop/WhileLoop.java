package do_whileloop;

public class WhileLoop {
  public static void main(String[] args) {
    //while
    int count =0;
    while(count<5){//continue condition: true/false
      count++;
    }//count = 5

    boolean isHoilday = false;
    int counter = 0;
    // while(!isHoilday){ //Is Not Hoilday // condition can has many 
    //   System.out.println("counter=" + counter);
    //   count++;
    //   }if(count >=6){
    //     isHoilday = true;
    //   }
      int c =0;
      while (c>=0 && c<5 ){
        System.out.println(c);
        c++;
      }

      int a =0;
      int b =10;
      while (a<5 || b>0){
        System.out.println("hello"); // while a>=5, (false || true)
        a++;
        b--;
      }

      // break , continue
      int k =0;
      while (k>6){
        System.out.println("break: Hello");
        k++;
        if(k>3){
          break;
        }
      }

      int j =0;
      while (j<6){
        j++;
        if (j>3){
          continue;
        }
        System.out.println("continue: Hello");
      }








    }
    }

