package ClassObject2.Shape;

public class Edge {
  private double length;
  private String color;
  public int id;
  private static int counter;

  public void setColor(String color){
    this.color = color;
  }

  public Edge(int id,double length,String color){
    this.id = id;
    this.length =length;
    this.color = color;
  }
    public String getColor(){
    return this.color;
  }
  public void setLength(double length){
    this.length = length;
  }
  public static void resetid(){
    counter =0;
  }
}
