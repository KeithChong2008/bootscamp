package lambda.src;

public class MathDemo {

  public static int caculation(int i ,int j,MathOperation formula){
    return formula.operate(i, j);
  }
  
  public static void main(String[] args) {
    MathOperation addition = (a, b)->a+b;
    MathOperation substract = (x,y)->x-y;
    MathOperation multipy = (x,y)->x*y;
    MathOperation divide = (x,y)->x/y;

    System.out.println(caculation(1,3,addition));
    System.out.println(caculation(1,3,substract));
    System.out.println(caculation(10,2,divide));
    
  }
}
