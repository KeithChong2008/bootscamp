
public class Operators {
    public static void main(String[] args) {
        int a = 1;
        a = a + 1; // 2
        a = a - 2; // 0
        int b = 10 / 5; // 2
        b = b * 3 + 5; // 11
        System.out.println("a+b = " + a + b); // a+b =011

        // +1 Operation
        int x = 1;
        x += x + 1;
        x++;// means x = X+1;
        ++x; // means x = x+1;
        x += 1;// means x = x+1;
        System.out.println("x=" + x);// x=5

        // -1 Operation
        int y = 10;
        y = y - 1; // 9
        y--; // 8
        --y; // 7
        y -= 1;// 6
        System.out.println("y=" + y); // 6

        // Other +,-
        int z = 4;
        z = z + 2;
        z += 2;

        int i = 6;
        i = i - 3;
        i -= 3;

        // Other *
        int w = 9;
        w = w * 3;
        w *= 3; //

        // Other /
        int u = 81;
        u = u / 9;
        u /= 3;

        // Other %
        int integer = 12 % 5; // 2

        int integer2 = 12;
        integer2 %= 5; // 2

        // ++, --
        int m = 3;
        m++;// 4
        int preIncrement = ++m;// +1 first and then assignment
        System.out.println("preIncrement= " + preIncrement);
        int postIncrement = m++;
        System.out.println(postIncrement); // assignment First
        System.out.println("m= " + m); // and then +1

        int g = 5;
        g--; // 4
        int preIncrement2 = --g; // g -1 first
        System.out.println("preIncrement2= " + preIncrement2); // 3
        int postIncrement2 = g--; // Assignment First , Still no n- 1
        System.out.println("postIncrement2= " + postIncrement2); // 3
        System.out.println("g= " + g); // and then -1 -> 2

        // String +=

        String str = "hello ";
        str += "World"; // "hello World"

    }
}
