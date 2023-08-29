import java.util.Objects;
import java.util.Random;

public class Ball {
  private int id;
  private Color color;
  private static int idcounter =0;

  public Ball(Color color){
    this.id = ++idcounter;
    this.color = color;
  }

  public int getScore(){
    return this.color.getScore();
  }

  public int getID(){
    return this.id;
  }

  public static Ball random(){
    //Get Random Color
    int random = new Random().nextInt(3); //0,1,2
    Color color= Color.getColor(random);
    return new Ball(color);
  }



/* 
public equals(Object o){

   if (this == o) {
      return true;
    }
    if(!(o instanceof Ball)){ // check class
      return false;
    }
    Ball ball = (Ball) o; 
    return this.id == ball.id && this.color == ball.color;    
    }


@Override
public int hashCode(){
  return Objects.hash(this.id, this.color);
}
*/


public String toString(){
  return "[" +
    "id = " + this.id +
    "color = "+ this.color +
  "]";
}

}