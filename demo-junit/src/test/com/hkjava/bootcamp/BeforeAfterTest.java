package com.hkjava.bootcamp;

import java.beans.Transient;



public class BeforeAfterTest {
  
  @Test

 
  @BeforeAfterTest
  void BeforeEach(){
    assertEquals(0,x);
    x +=3;
  }

  @Test
  void testAdd(){
    assertEquals(10,App.add(this.x,5));
  }

 @AfterEach
  void endOfTest(){
    System.out.println("endOfTest start "+ this.x);
    this.x -=2;
    System.out.println("ended.x="+ this.x);
  }

  

}
