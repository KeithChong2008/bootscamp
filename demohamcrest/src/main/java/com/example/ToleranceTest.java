package demohamcrest.src.main.java.com.example;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class ToleranceTest {
  
  @Test
  void test(){
    double actualValue = 3.14159;
    double expected = 99;
    double tolerance = 1.0;
    MatcherAssert.assertThat(99.0,closedTo(expected,tolerance));

    MatcherAssert.assertThat(3.14159,closedTo(expected,tolerance));

    MatcherAssert.assertThat(actualValue,not(closedTo(expected,tolerance)));
    MatcherAssert.assertThat(3.14159,not(closedTo(expected,tolerance)));

    
  }
}
