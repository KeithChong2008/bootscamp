package ClassObject2.Shape;

public class Circle {
  private int id;
  private double radius;
  //static ->shared variable
  //final-> one time initialization only
  private static final double pi = 3.14159;
  
  
  private static int counter;

  
  public Circle(){
    this.id++;
    Addcounter();
  }

  public static void Addcounter(){
    counter++;
  }

  public int gerid(){
    return this.id;
  }

  public double area(){
    return Math.pow(radius, 2)*pi;
  }

  public double cirumference(){ //instance method
    //pi =3; < after final, it cannot change in method
    return 2*radius*pi;
  }


  public void setRadius(double radius){
    this.radius =radius;
  }

  public static void main(String[] args) {
    Circle circle = new Circle();//Constructor
    circle.setRadius(2);
    circle.area();
    circle.cirumference();
  }
}
