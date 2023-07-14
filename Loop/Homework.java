package Loop;

public class Homework {
        public static void main(String[] args) {
                /*
                 * for (int a=1;a<=5;a++){
                 * for(int b =0;b<a;b++){
                 * //System.out.print("*");
                 * System.out.print("a = " + a + ",b= " + b + ", ");
                 * }
                 * System.out.println("");
                 * }
                 */
                /*
                 * for (int a=1;a<=5;a++){
                 * String str = "";
                 * for(int b =0;b<a;b++){
                 * //str +="*";
                 * System.out.print("a = " + a + ",b= " + b + ", ");
                 * } System.out.println(str);
                 */

                /*
                 * for (int a=1;a<=5;a++){
                 * System.out.print("*");
                 * 
                 */
                for (int i = 0; i < 5; ++i) {
                        for (int j = 0; j < i + 4; ++j) {
                                System.out.print("*");
                        }
                        System.out.print(" ");
                }
        }
}
