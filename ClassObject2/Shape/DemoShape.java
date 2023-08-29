package ClassObject2.Shape;

public class DemoShape {
  public static void main(String[] args) {
    Square s1 = new Square(10);
    Square s2 = new Square(4);
    Square s4 = Square.Of(4.0f);
    

    
    //s1->edge[0] color -> Yellow
    s1.getEdge(0).setColor("Yellow");    
    System.out.println(s1.getEdges()[0].getColor());
    //getEdges() has 4 address.

    s1.getEdges();
  }
}
