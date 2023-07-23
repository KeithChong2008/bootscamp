package Methods.src; 18 July 2023

public class Retangle {
  public static double area(double x, double y){
  return x*y;
}


public static double perimeter(double x, double y){
  return (x+y)*2;
}

  public static void main(String args[]){
    //area
    double area1 = area(5.1,3.1);
    double area2 = area(13.2,5.2);

    //perimeter
    double perimeter1 = perimeter(10.1,90.2);
    double perimeter2 = perimeter(55.0,44.1);

    System.out.println(area1);
    System.out.println(area2);

    
    System.out.println(perimeter1);
    System.out.println(perimeter2);
  }
}
