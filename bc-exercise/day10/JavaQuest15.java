public class JavaQuest15 {
  // Question :
  // Given a string s and a character letter, return the percentage of characters
  // in s that equal letter rounded down to the nearest whole percent.

  // Constraints:
  // 1<=s.length<=100
  // s consists of lowercase English letters.
  // letter is a lowercase English letter.

  public static void main(String[] args) {
    // Example 1
    String s1 = "foobar";
    char letter1 = 'o';
    System.out.println("Example 1 : " + percentageLetter(s1, letter1));

    // Example 2
    String s2 = "jjjj";
    char letter2 = 'k';
    System.out.println("Example 2 : " + percentageLetter(s2, letter2));
  }

  public static int percentageLetter(String s, char letter) {
    int count = 0;
    for (char c : s.toCharArray()) {
      if (c == letter) {
        count++;
      }
    }
    double percentage = (double) count / s.length() * 100;
    return (int) percentage;
  }
}