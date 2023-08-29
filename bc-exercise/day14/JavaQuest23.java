/*
 * Question : given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 */

// hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public static void main(String[] args) {
    System.out.println(sameNumberOfVowels("book")); // true
    System.out.println(sameNumberOfVowels("textbook")); // false
  }

  public static boolean sameNumberOfVowels(String s) {
    int n = s.length();
    int count1 = 0, count2 = 0;
    String a = s.toLowerCase().substring(0, n/2);
    String b = s.toLowerCase().substring(n/2, n);
    for(char c : a.toCharArray()) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
            count1++;
        }
    }
    for(char c : b.toCharArray()) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count2++;
        }
    }
    return count1 == count2;
}
    }


