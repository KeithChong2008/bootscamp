package example;

import ObjectDemo.shape;

public class Circle10 extends shape{

    private double radius;

    public Circle10 (double radius){
      this.radius =radius;
    }

    @Override
    public double area(){
      return Math.pow(this.radius,2) * Math.PI;
      }

  }
