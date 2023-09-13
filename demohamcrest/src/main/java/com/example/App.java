package demohamcrest.src.main.java.com.example;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
 
public class App {

    public void Test(){
        int value = 40;

        assertThat(value,is(equals(40)));
        assertThat(value,is(greaterThan(40)));
        assertThat(value,greaterThan(40));
        assertThat(value,is(not(greaterThan(50))));
        assertThat(value,is(lessThan(50)));
        assertThat(value,is(lessThanOrEqual(50)));
        assertThat(value,is(greaterThanOrEqual(50)));
    }

    @Test
    void testString(){
        String str = "Hello World";
        assertThat(str,containsString("world"));
        assertThat(str,not(containsString("world")));

        String str2 = new String("Hello World");
        assertThat(str,equals(str2)); // check value of Strings
        assertThat(str,is(not(sameInstatnce(str2)))); // check if they are same object
        assertThat(str2, is(notNullValue()));

        String nullString = null;
        assertThat(nullString,is(notNullValue()));

        assertThat(str,startsWith("Hello"));
        assertThat(str,not(startsWith("Hello")));
        assertThat(str,endsWith("World"));
        assertThat(str,not(endsWith("World")));

        String empString ="";
        assertThat(empString, is(empString));

    }

     @Test
     void testLogicalMatcher(){
        int val = 42;
        assertThat(val, allof(
        greaterThan(41),
        lessThan(43),
        greaterThanOrEqual(42),
        lessThanOrEqual(42)
        ));
        
        //OR

        assertThat(val, anyof(
            greaterThan(43),
            lessThan(40),
            greaterThanOrEqual(50),
            lessThanOrEqual(42)
        ));
     }

    
}
