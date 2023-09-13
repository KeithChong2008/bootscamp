package demohamcrest.src.main.java.com.example;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class CustomerMatcherTest {
  
  @Test
  void CustomerMatcherTest(){
    String str1 = "Hello World";
    String str2 = "HELLO world";
    String str3 = "hello WORLD";

    MatcherAssert.assertThat(str,containUpperCaseOnly());
    MatcherAssert.assertThat(str2,not(containUpperCaseOnly()));
    MatcherAssert.assertThat(str3,not(containUpperCaseOnly()));
  }
}
