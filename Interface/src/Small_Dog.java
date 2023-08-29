public class Small_Dog extends Dog {
  //jump()

  @Override
  public void jump(){ //this is contract from Class Dog
    super.AddScore(5);
  }
  
  public static void main(String[] args) {
    Small_Dog smalldog = new Small_Dog();
    smalldog.jump();

    System.out.println(smalldog.getScore());
    smalldog.Up();
    System.out.println(smalldog.getScore());
  }
}
