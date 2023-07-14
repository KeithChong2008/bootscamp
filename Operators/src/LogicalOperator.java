public class LogicalOperator {
    public static void main(String[] args) {
        // and , or , not
        boolean isExpensive = true;
        boolean isWorthtobuy = false;
        boolean result = isExpensive && /* and */ isWorthtobuy; // False
        // && -> and
        // true, true =>true
        // true, false => false
        // false,true => False
        // false,false => false
        System.out.println(result);

        // || -> Or
        // true, true => true
        // true, false => true
        // false, true => true
        // false,false=> false
        boolean result2 = isExpensive || /* Or */ isWorthtobuy; // true
        // System.out.println(result2);

        int a = 5;
        int b = 10;
        int c = 13;

        boolean result3 = a > 9 && b < 12; // false
        // Logical Operator
        boolean result4 = c < 15 || a > 6 && b < 12;// true
        boolean result5 = c < 15 || (a > 6 && b < 12);// true
        boolean result6 = a < 6 || b < 9 || c < 9; // true

        // ==,>=,<= ,!=
        // ==, means asking if a equals b? -> true/false
        // =, assignment
        boolean result7 = (a == b); // false
        boolean result8 = (a >= 5); // true
        boolean result9 = (a <= 13);// true
        boolean result10 = (a != 13);// false
        // ! -> NOT

        boolean result11 = !(c < 13);// Asking if the event of (c<13) is false?If false, =>true
        boolean result12 = !(b == 9) && c != 13;// true && false -> false
        System.out.println(result12);

        // Operators Precedence
        int result13 = (1 + 9) * 3; // 30
        int result14 = ++result13 + 1; // result 14 = 32
        int i = 27;
        int result15 = i++ + 1; // Assignment, so result15 => 28, i =28

        boolean result16 = 25 + 2 < result15 * 3; // true

        int x = 5;
        int y = 10;
        int z = x += 3 * y;// z =35 -> inhertance

        // if x =5,
        // (x++ +2) -> 7, x become 6
        // 7*6 = 42

        int result17 = (x++ + 2) * x++; // (x++ +2) = assignment, so it is 37 , x++ = 36, so it is 37*36 = 1332

        System.out.println(x);
        System.out.println(z);
        System.out.println(result17);

    }
}
