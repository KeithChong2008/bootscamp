package Sort;


public class Ball implements Comparable<Ball> {
  int id;

  Color color;
  
  public Ball(int id,Color color){
    this.id =id;
    this.color = color;
  }

  @Override
  public int compareTo(Ball b1){
    return b1.id > this.id? 1: -1;
  }

// Yello come first, if color same, id ascending order
//if not Yellow, id decending Order



// public String sortingYellow( <Ball> balls){

// if(ball.color == color.YELLOW){
//   return 1;
// }else{
//   return -1;
// }


// }

@Override
public String toString(){
  return "[id= " +this.id +", color="+this.color+"]";
}
}