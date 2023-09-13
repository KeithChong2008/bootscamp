package demohamcrest.src.main.java.com.example;

public class CustomMacher extends TypeSafeMacher<String>  {
  
  @Override
  protected boolean matchesSafely(String str){
    return str.matches("[A-Z]+");
  }

  @Override
  public void describeTo(Description description){
    description.appendText("String should contain upperCase letter only");
  }

  public static Matcher<String> containUpperCaseOnly(){
    return new UppercaseMatcher();
  }
}
