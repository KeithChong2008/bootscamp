public interface Player {
  
int  totalscore();

public static void fillthePocket(Pocket pocket){
  while(pocket.isFull()){
    //Random a ball with a random color; 
    pocket.add(Ball.random());
  }

}


}
