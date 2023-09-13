package demohamcrest.src.main.java.com.example;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class ArrayTest {
  
  @Test
  void testArray(){
    String[] strings = new String[]{"Apple","Cherry","Banna"};
    assertThat(strings, arrayContaining("Apple","Cherry","Banna"));
    assertThat(strings, not(arrayContaining("Apple","Cherry","Banna")));
    assertThat(strings, not(arrayContaining("Cherry","Banna")));
  
    assertThat(Strings,arrayContainingInAnyOrder("Cherry","Banna","Apple"));
    assertThat(Strings,not(arrayContainingInAnyOrder("Cherry","Banna","Apple")));

    
  }

}
