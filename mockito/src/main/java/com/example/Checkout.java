package com.example;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor

public class Checkout {
private Caculator caculator;

@NonNull
  public Checkout(Caculator caculator){

    this.caculator = caculator;
  }
  
    public  int add(int x, int y){
      //Caculator caculator = new Caculator(weight);
    if(x>1){
      return y + this.caculator.substract(x,y);
    }
    return x+y;
}
}
