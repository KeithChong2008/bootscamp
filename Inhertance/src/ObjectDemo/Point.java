package ObjectDemo;

import java.util.Objects;

import example.Circle10;

public class Point {
  int x;
  int y;

  public String toString(){
    return "[x=" + this.x + " ]" +"[y=" + this.y + " ]";
  }
  public Point(int x, int y){
    this.x =x;
    this.y= y;
  }

  public int hashCode(){
    return Objects.hash(this.x,this.y);
  }
  
  @Override
  public boolean equals(Object o){
    if (this ==o){
      return true;
    }
    if(!(o instanceof Point)){
      return false;
  }
   Point point =(Point) o;
   //return poin.x == thiz.x && point.y ==this.y;
  return Objects.equals(point.x,this.x) && Objects.equals(point.y,this.y);

  // instanceOf, Object

  Object obj = new String("abc"); //obj is an object reference (address)
  shape shape = new Circle10(5.0d);

  obj = Long.valueOf(10);
  System.out.println(obj instanceof String); //False
  System.out.println(obj instanceof Long); //True

    //Number
    Integer int1 = Integer.valueOf(100);
    System.out.println(int1 instanceof Number); //True
    Double d1 = Double.valueOf(100);
    System.out.println(d1 instanceof Number); //True

    //Wrapper Class equals
    //Premitivates,for comparsion,we use equals ==
    Integer j1 = 127;
    Integer j2 = 127;
    System.out.println(j1.equals(j2));
    Boolean bool1 = false;
    Boolean bool2 = false;
    Long l =1L;
    

    System.out.println(bool1.equals(bool2));
    System.out.println(bool1.equals(false));


  }

    public static void print(Long l, int i){
      System.out.println(l);

    }
    @Override
      public boolean equals(Object o){
    if (this ==o){
      return true;
    }
    if(!(o instanceof Point)){
      return false;
  }
      
   Point point =(Point) o;
   //return poin.x == thiz.x && point.y ==this.y;
  return Objects.equals(point.x,this.x) && Objects.equals(point.y,this.y);
    }

  public static void main(String[] args) {
    Point p1 = new Point(1,1);
    Point p2 = new Point(1,1);
    Point p3 = new Point(1,2);
    System.out.println(p1 == p2); //false
    System.out.println(p1.equals(p2)); //true
    System.out.println(p1.equals(p3)); // false
    if (Long.valueOf("100") < 101 ){ 
      // covert Long 100-> Long 100 
      //101 -> int -> Integer




    }
    if(Boolean.valueOf(false).equals(false)){
      //right: false -> boolean
      //left: Boolean false -> boolean false
      //boolean vs boolean
    }
     //Big bugs
     //unbox Long, abd upcast int
     Long l;
     Integer i;
     System.out.println(Objects.equals(l,i));//false



  }
}
