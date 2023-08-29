public class Demo2 {
    
    public static void main(String[] args) {
    // Dynamic Polymprphim (Run-time)
    Building building = new House(0);
    // Compile -time checks
    //building.getCapcaity();//complie error
    building.print(); // complie error

    building.print(); // Compile-time confirm you can call print() method
    //Run-time decide which print() is going to call
    //So, "Building" variable call House's print() method

   building.print2();
   building.print3();

   //static Polymorphism (Compile-time)
   //Method signature (method name + parameters)
  //Constuctor
    House house = new House(0);
    house.print();
    House house2 = new House(3.0d);
    house2.print("hello");
    house2.print();

    //House house3 = new House("String");// Constructor is not found
    //house2.print(3L);//print(long) method is not found


    //upcast,downcast
    long l1 = Long.valueOf(1L);// wrapper class-> unbox
    //downCast (Run-time Polymporphism)

    long l2 =Long.valueOf(1L);
    long l3 = 3L;
    long l5 =2;
    int l4 =(int )3L;
    
    Object obj = new Container();
    if(obj instanceof Cube){
        Cube cube = (Cube) obj;//downcast: Object -> Cube
    }

    Object obj2 = new Cube();
    if(obj2 instanceof Container){ //true
        Container cube = (Container) obj;//downcast: Object -> Container
    }


    Container obj3 = new Clone();
    Cube cub2 = (Cube) obj3; //Java.lang.ClasscastExcpetion
    //run-time exception Run-Time polymorphism

    Number number = Integer.valueOf(3);
    Double d1 =(Double) number; //Java.lang.ClasscastExcpetion


 


    }
}
