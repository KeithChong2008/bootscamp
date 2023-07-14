package Loop;

public class continueloop {
    public static void main(String[] args) {
        // continue
        for (int i = 0; i < 6; ++i) {
            System.out.println("Hello");
            if (i > 3) {
                continue;// go to the next iteration(next time loop)
            }
            System.out.println("Bye");
            // i = 0, hello, bye
            // i = 1, hello, bye
            // i = 2, hello, bye
            // i = 3, hello, bye
            // i = 4, hello
            // i = 5, hello
            // i = 6, exit
        }
        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                System.out.println("Good");
            } else if (i % 3 == 0) {
                System.out.println("Bad"); // OR = else if, And = Nested if loop
            }
        }
        // Nested Loop
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.println("Hello");
            }
        }
        // i =0, j=0, Hello
        // i =0, j=1, Hello
        // i = 0, j=2, Hello
        // i=0, j=3, exit

        // i=1,j=0, Hello
        // i=1,j=1, Hello
        // i=1,j=2, Hello
        // i=1,j=3, exit

        // i=2,j=0, Hello
        // i=2,j=1, Hello
        // i=2,j=2, Hello
        // i=2,j=3, exit

        // i=3,j=0, Hello
        // i=3,j=1, Hello
        // i=3,j=2, Hello
        // i=3,j=3, exit
    }
}
