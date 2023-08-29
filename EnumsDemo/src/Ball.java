public class Ball {
  
  private Color color; //Sting -> "RE D", "RED, "red"

  public Ball (Color color){
    this.color = color;
  }

  public Color getColor(){
    return this.color;
  }

  @Override
  public boolean equals(Object o){
    if(this == o){
      return true;
    }
    if(!(o instanceof Ball)){
      return false;
    }
    Ball ball = (Ball) o;
    return this.color == ball.color;
  }

  public static void main(String[] args) {
    Ball RedBall = new Ball(Color.RED);
    System.out.println(RedBall.getColor().name());


    //Object is topmost parent

    Object object = new Ball(Color.RED);
    object.hashCode();//reference presentation

    //Complie-time check if object class has hashCode() method
    //Complie-time check if Ball class ingerit Object

    //Run-Time object variable stores an address, point to a Ball objects in heap
    //Run-Time dertermine if Class Ball has hashcode() method.
    //If no, them invoke class Object hashCode()
    //If Yes, invoke the Class Ball hashCode()

    Color color = ((Ball) object).getColor();
    System.out.println(color); // Compile-time type checking
    Class<?> clas = color.getClass();
    System.out.println(clas.getName());
    System.out.println(clas.toString());


    //run-time

    if(Color.BLUE instanceof Color){ //true
      System.out.println("BLUE is instanceof Color");
    }

    Object o = 1-'a'; // int ->
    System.out.println(o.getClass().getName()); //Integer
    Object o2 = 'b';
    System.out.println(o2.getClass().getName()); //.Character
    Object o3 = new Ball(Color.GREEN);
    System.out.println(o3.getClass().getName());

    System.out.println((o3.getClass().isEnum())); //Flase
    System.out.println(clas.isEnum()); //True


  }
}
