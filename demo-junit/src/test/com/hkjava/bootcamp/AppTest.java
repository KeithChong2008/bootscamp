package com.hkjava.bootcamp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;
import java.lang.annotation.Target;
import java.time.Duration;

import com.hkjava.bootcamp.Main;
import com.hkjava.bootcamp.Student;

@TestInstance(TestInstance.Lifecycle.PER_METHOD) // default

@DisplayName("Assert Method Tests")

// @TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AppTest {

  private int x; // Instatnce Variable

  @Test
  @DisplayName("Assert")
  void additioTest() {
    // AssertionsEquals(actual value, expected value(1,2))
    assertEquals(5, Main.add(2, 3));
    assertEquals(1, Main.add(2, 5)); // new add // false
    // Object-Testing
    x++;
    assertEquals(1, Main.add(x));
  }

  @Test
  @DisplayName("AssertEquals Test")
  void tsetAssertEqual() {
    assertNotequals(4, Main(1, 2));
    // Object-Testing
    x++;
    assertEquals(1, Main.add(x));

  }

  @Test
  void testAssertTrue() {
    assertTrue(5 > 3);
    assertTrue(12 == App.add(7, 5));
  }

  @Test
  void testAssertFalse() {
    AssertFalse(13 == App.add(7, 5));

  }

  @Test
  void testAssertNull() {
    String str = null;
    assertNull(str);
  }

  // @Test
  // void testAssertNotNull(){
  // String str = null;
  // assertNull(str);
  // }

  @Test
  void testAssertNotNull() {
    Student student = new Student();
    assertNull(student);
  }

  @Test
  void testAssertTimeout() {
    testAssertTimeout(Duration.ofMillis(100), () -> {
      Thread.sleep(50);
    });
  }

  @Test
  void testCombine() {
    assertAll(
        () -> assertTrue(10 > 3),
        () -> assertEquals(10, App.add(4, 6)),
        () -> assertNull(null)

    );
  }

  @Test
  void testSame() {
    String s1 = new String("Junit");
    String s2 = new String("Junit");
    assertNotSame(s1, s2);

    String s3 = "Junit";
    String s4 = "Junit";
    assertNotSame(s3, s4);
    assertEquals(s3,s4);
  }





  public static void main(String[] args) {
    AppTest t1 = new AppTest();
    test.additioTest();
    AppTest t2 = new AppTest();
    test.tsetAssertEqual();

  }
}
