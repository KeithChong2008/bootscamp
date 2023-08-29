public abstract class Game {

  int score;

  public int getScore(){
    return this.score;
  }

  public void setScore(int score){
    this.score = score;
  }

  public void AddScore(int score){
    this.score += score;
  }

  public abstract void jump();

  public void print(){}


  public static void UpOnce(Game ... games){ //mulitiple args
    for (Game game: games){
      game.jump(); //dog / student objects.
    } 
  }


  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    Game.UpOnce(new Dog(), new Cat());
    System.out.println(dog.getScore());
    System.out.println(cat.getScore());

    //Interface Move default instance method
    dog.print();
    // static method
    System.out.println(Move.concat("abc", "abc"));

    Cow cow = new Cow();
    cow.print();



  }
}
