package demohamcrest.src.main.java.com.example;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class CollectionTest {
  
  @Test
  void testlist(){
    List<String> strings = new Arrays.asList("Apple", "Banana","Cherry");
    assertThat(strings, hasItem("Cherry"));
    assertThat(strings, hasItem("Apple","Cherry"));
    assertThat(strings, hasSize(3));
    assertThat(strings, contains("Apple", "Banana","Cherry")); // all elements and orders
    assertThat(strings, not(contains("Apple", "Banana","Cherry"))); 

    // number of items + ignore ordering
    assertThat(strings, containsInAnyOrder("Apple", "Banana","Cherry"));
    assertThat(strings, not(containsInAnyOrder("Apple", "Banana","Cherry")));

    List<String> emptylist = new ArrayList<>();
    assertThat(emptylist, empty());

    

  }
}
