package Competitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Card extends Paper {
  int number;

  public Card(int number, int size){
    super(size);
    this.number = number;
  }
  
  @Override
  public String toString(){
    return "[ Card number = " + this.number + "]" + ",[ size= " + super.size + "]";
  }

  public static void main(String[] args) {
    List <Card> cards = Arrays.asList(new Card(1,2),new Card(4,3));
    Collections.sort(cards, new SortByNumber());
    System.out.println(cards);

    
    List<? extends Number> numbers =  new ArrayList<Integer>();
    numbers = new ArrayList<>(Double);

    Number number = Integer.valueOf(10); // Polymorhism
    number = Double.valueOf(2.0); // Polymorhism

    


  }

}
