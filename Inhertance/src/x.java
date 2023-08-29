public class x extends y {

  private String name;
   
  public x(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  public String getParenName(){
    return super.getName();
  }
  public static void main(String[] args) {
    x x = new x("Peter");
    System.out.println(x.getName());

      // Hiding

      y y = new x("Tommy");
      //y.staticMethod(); // I am Y
      //x.staticMehod(); // I am X
      System.out.println(y.getName()); // Tommy
      System.out.println(((y)x).getName());// John
  }
}
