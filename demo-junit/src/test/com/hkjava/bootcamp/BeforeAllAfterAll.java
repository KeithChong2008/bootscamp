package com.hkjava.bootcamp;

import java.beans.Transient;

public class BeforeAllAfterAll {

  @BeforeAll
  void beforeAll() {
    System.out.println("beforeAll start");
  }

  @AfterAll
  void AfterAll() {
    System.out.println("AfterAll start");
  }

  @Test
  void test() {
    x++;
    assertTrue(x ==1);
  }

  @Test
  void test2() {
    x++;
    assertTrue(x ==1);
  }
}
