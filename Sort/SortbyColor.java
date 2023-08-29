package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortbyColor implements Comparator<Ball>{
    
  @Override                                                                                                                                                                                                                     aAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
  public int compare(Ball b1,Ball b2){
    return b2.color.id <b1.color.id ? 1:-1;
  }

  public static void main(String[] args) {
    ArrayList <Ball> balls = new ArrayList<>();
    balls.add(new Ball(4, Color.YELLOW));
    balls.add(new Ball(1,Color.RED));
    balls.add(new Ball(5,Color.BLUE));
    balls.add(new Ball(100,Color.BLUE));
    Collections.sort(balls, new SortbyColor());
    System.out.println(balls);

    Collections.sort(balls);
    System.out.println(balls);
  }
}
