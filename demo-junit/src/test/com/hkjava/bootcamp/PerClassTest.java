package com.hkjava.bootcamp;

import java.beans.Transient;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class PerClassTest {
  private int x;

  @Test
  @Order(2)
  void Test1(){
    this.x++;
    assertEquals(1,x);
  }

  @Test
  @Order(1)
  void Test2(){
    this.x++;
    assertEquals(2,x);
  }
}
