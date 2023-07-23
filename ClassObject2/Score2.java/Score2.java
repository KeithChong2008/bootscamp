
public class Score2 {
  int number1;
  int number2;


  public void SetNumber1(int number1){
    this.number1 = number1;
  }

  public void SetNumber2(int number2){
    this.number2 = number2;
  }

  public int divide(){ // non-static method
    //return number2/number1;
    this.print(); // non static method call non-static method
    //number2.add(this.number1,this.number2);
    return this.number2/this.number1;
  }

public int divide(int number1, int number2){ // static method
    return number2/number1;
  }


  // Non-static mathod can call static method
  public void print(){
    System.out.println("this.number1 = " +this.number1);
    System.out.println("this.number2 = " +this.number2);
  }


public static void print(int number1, int number2){
    System.out.println("this.number1 = " + number1);
    System.out.println("this.number2 = " + number2);
  }


  public static void main(String[] args) {
    Score2 n1 = new Score2();
    n1.SetNumber1(13);
    n1.SetNumber2(26);

    Score2 n2 = new Score2();
    n2.SetNumber1(10);
    n2.SetNumber2(100);

    System.out.println(n1.divide());
    System.out.println(n2.divide());


    n1.print();
    n2.print();
  }
}
