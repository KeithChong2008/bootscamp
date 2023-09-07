package com.hkjava.bootcamp;

public class Main {
    
    public static int add(int x, int y){// Main.add(1,2)
        if(x>1){ // new add
            // let anotherMethod(x+y) ->1
            return y+ anotherMethod(x+y); // new add
        }
        return x+y;
    }

    public  static int divide(int x, int y){
        return x / y;
    }

    public static int anotherMethod(int z){
        return (z+13)/100;
    }
    
}