package example;

import ObjectDemo.shape;

public class Square10 extends shape{
    private double length;

    public Square10 (double length){
      this.length =length;
    }

    @Override
    public double area(){
      return Math.pow(this.length, 2);
    }
    
  }

