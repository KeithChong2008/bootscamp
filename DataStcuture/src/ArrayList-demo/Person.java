public class Person implements Player {
  
  Pocket[] pockets;



  public Person(){
    pockets = new Pocket[]{new Pocket(),new Pocket()};
  }

  @Override
  public int totalscore(){
    return this.getLeftPocket().totalscore() + this.getRightPocket().totalscore();
  }

  public Pocket getLeftPocket(){
    return this.pockets[0];
  }

  public Pocket getRightPocket(){
    return this.pockets[1];
  }





 public static void main(String[] args) {
  Person p1 = new Person();
  Player.fillthePocket(p1.getLeftPocket());
  Player.fillthePocket(p1.getRightPocket());
  System.out.println(p1.getLeftPocket().getSize());
  System.out.println(p1.getRightPocket().getSize());
  
  Person p2 = new Person();
  Player.fillthePocket(p2.getLeftPocket());
  Player.fillthePocket(p2.getRightPocket());

  System.out.println("p1 Total Score:" + p1.totalscore());
  System.out.println("p1 Left Ball Details:" + p1.getLeftPocket().toString());
  System.out.println("p1 Left Ball Details:" + p1.getRightPocket().toString());



 }
}