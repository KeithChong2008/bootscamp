package ObjectDemo;

import java.util.Objects;

public class Ball {
  private String color;


  public void ball(String color){
    this.color = color;
  }

  @Override
  public String toString(){
    return "[color=+"+this.color +" ]";
  }

  public int hashCode(){
    // Hash Code is not unique rrepresentation of object reference
    return Objects.hash(this.color);
  }

  @Override
  public boolean equals(Object o){
    //if address same, values inside the object must be same
    if (this ==o){
      return true;
    }
      if(!(o instanceof Ball)){
        return false;
    }
     Ball ball =(Ball) o;
    return ball.color.equals(this.color); 
 }
  
      public static void main(String[] args) {
      Ball b1 = new Ball();
      Ball b2 = new Ball();
      System.out.println(b1);
    }

}