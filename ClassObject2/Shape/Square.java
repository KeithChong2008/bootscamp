package ClassObject2.Shape;

public class Square {
  private final Edge[] edges;//finaled address -> 
  private double length;
  public int id;

  // public Square(){
  //   edges = new Edge[4];
  //   edges[0] = new Edge(3, "Red");
  //   edges[1] = new Edge(3, "Yellow");
  //   edges[2] = new Edge(3, "Black");
  //   edges[3] = new Edge(3, "BLUE");
  // }

  public static Square Of(double length){
    return new Square(length);
  }

  public static Square Of(int length){
    return new Square(length);
  }

    public static Square Of(float length){
    return new Square(length);
  }

    public static Square Of(String length){
    return new Square(Double.valueOf(length));
  }
    


  public Square(double length){
    edges = new Edge[4];
    edges[0] = new Edge(++id, length, "Red");
    edges[1] = new Edge(++id,  length, "Red");
    edges[2] = new Edge(++id,  length, "Red");
    edges[3] = new Edge(++id,  length, "Red");
    //Square.resetid();
  }

  public Edge getEdge(int id){
      return this.edges[id-1];
  }

  public Edge[] getEdges(){
    return this.edges;
  }

    public void modify(double legth){
    this.edges[0].setLength(length);
  }
    public void modify(String color){
    this.getEdges()[0].setColor(color);
    this.getEdges()[1].setColor(color);
    this.getEdges()[2].setColor(color);
    this.getEdges()[3].setColor(color);
  }
    public void modify(int id,String color){
      this.getEdges()[id].setColor(color);
    }

}
