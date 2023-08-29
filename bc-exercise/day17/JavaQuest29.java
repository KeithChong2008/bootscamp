/*Question : Given an integer n,
 add a dollar sign ("$") and a comma (",") as the thousands separator and return it in string format. */
/*Constraints:

0 <= n <= 231 - 1 */
public class JavaQuest29 {
  public static void main(String[] args) {
    System.out.println(separator(85));// $85
    System.out.println(separator(0));// $0
    System.out.println(separator(1000));// $1,000
    System.out.println(separator(123987405));// $123,987,405

  }

  public static String separator(int n) {
    String number = Integer.toString(n);
    StringBuilder result = new StringBuilder();
    int count = 0;
    
    for (int i = number.length() - 1; i >= 0; i--) {
        result.append(number.charAt(i));
        count++;
        if (count == 3 && i != 0) {
            result.append(",");
            count = 0;
        }
    }

    return "$" + result.reverse().toString();

}
}