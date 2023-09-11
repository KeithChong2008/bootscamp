package com.example;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SpyTest {
  
  @Spy
  Caculator caculator;

  @InjectMocks
  Checkout checkout;

  @Test
  void testAdd1(){
    when(caculator.substract(3, 4)).thenReturn(100);
    int result = checkout.add(3, 4);
    assertEquals(104,result);
    verify(caculator, times(1)).substract(3,4);
  }


  @Test
  void testAdd2(){
    when(caculator.substract(3, 4)).thenReturn(100);
    int result = checkout.add(3, 4);
    assertEquals(3,result); //4 + (4-3-2)

  }
    @Test
  void test3(){
    when(caculator.multiply(-2, 4)).thenReturn(100);
    int result = checkout.multiply(-2, 4);
    assertEquals(104,result); //100 + (4-(-2)-2)

  }
}
