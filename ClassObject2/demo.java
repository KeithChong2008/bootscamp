package ClassObject2;

public class demo {
  public static void main(String[] args) {
      car car = new car();//Empty constuctor
      car car2 = new car(4,7,"Red"); //All-arguments Constructor
      ClassObject2 person = new ClassObject2(); //Constructor
      Computer computer = new Computer();
      String str = new String("Hello");

      
      
      System.out.println(car2.getnoOfWheel());
      System.out.println(car2.getcapacity());
      System.out.println(car2.getcolor());
      
      car2.setcolor("Yellow");
      car.setcolor("BLUE");
      car2 = null;
      car2 = new car(3,4,"Black");

      carfactory.changeColor(car2,"White");
      System.out.println(car2.getcolor());

      System.out.println(car2);//car@1f32e575<-object refering storing object

      //ClassObject2.setAge(15); Error, as private



  }

}
