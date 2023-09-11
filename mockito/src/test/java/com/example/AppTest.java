package com.example;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class AppTest {

   @Mock
   Caculator caculator;
   @Mock
   Caculator caculator2;

   @InjectMocks
   Checkout checkout;

   @Test
   void testSubstract() {
      Caculator selfnew = new Caculator();
      assertEquals(-4, Caculator.substract(10, 6));
      assertEquals(6, selfnew.multiply(2, 3));
   }

   @Test
   void testAdd(){
      when(caculator.substract(3,4)).thenReturn(100);

      Checkout checkout = new Checkout(caculator);
      //Test Start
      int result = checkout.add(3, 4);
      assertEquals(104, result);
      verify(caculator, times(1)).substract(3,4);
   }

   @Test
   void testAdd2(){
      when(caculator2.substract(1,4)).thenReturn(1000);
      Checkout checkout = new Checkout(caculator2);
      //Test Start
      int result = checkout.add(3, 4);
      assertEquals(5, result);
      verify(caculator, never()).substract(3,4);
   }

   @Test
   void testMultiply(){
      when(caculator.substract(7, 9)).thenReturn(10000);
      when(caculator.multiply(7, 9)).thenReturn(10000);
      int result = checkout.multiply(7, 9);
      assertEquals(10009, result);
      }

   void testMultiply2(){
      when(caculator.substract(3, 8)).thenReturn(10000);
      int result = checkout.multiply(3, 8);
      assertEquals(8, result);
      }

}
