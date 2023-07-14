package Loop;

public class Loop2 {
    public static void main(String[] args) {
        // break
        /*
         * for (int i =0; i<6;++i){//0,1,2,3,4,5
         * for (int j =0; j<3;++j){//0,1,2,
         * System.out.println("i= " +i + " j= " + j);
         * if (i==j){
         * break; // this break statment just break the inner loop
         * }
         * }
         * }
         */

        // continue
        /*
         * for (int i = 0; i < 6; i++) {
         * for (int j = 0; j < 3; ++j) {
         * if (i == j) {
         * continue; // skip the next rest in inner loop, go to the next interation
         * }
         * System.out.println("i= " + i + " j= " + j);
         * }
         * }
         */

        /*
         * for (int i = 0; i <= str.length(); ++i) { //Remember ,for loop based on the
         * length of string
         * System.out.println("Hello");
         * }
         * 
         */

        // Print the first time of the character "e".
        // Print the index of the charcter
        // str.charAt(int index)
        /*
         * for (int i = 0; i < str.length(); ++i) {
         * char str2 = str.charAt(i);// make variable in the loop
         * if (str2 == 'e') {
         * System.out.println(i);
         * break;
         * }
         */
        /*
         * for (int i = 0; i < str.length(); ++i) {
         * if (str.charAt(i) == 'e') {// true/false
         * System.out.println(i);
         * break;
         * }
         * }
         */
        
 
        // check if""y" exists in the String
        boolean found = false;
        for (int i = 0; i < str.length(); ++i) {
            if ((str.charAt(i) == 'y')) {
                System.out.println("Found");
                break;
            } else if (str.length() - 1 != 'y') {
                System.out.println("Not Found");
                break;
            }
        }
        /* 
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == 'y') {
                found = true;
                break;
            }
            if (found == true) {
                System.out.println("Found");
            } else {
                System.out.println("Not Found");
            }
        }
        */
        // if the number of occurance of target >= 3. print "yes", otherwise print "No"
        String str = "I Love Programing. I Love Java. ";
        char target = 'o';
        int count = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == target){
                count++;
            }
            //nice to have
            if (count >=3){
                break;
            }
        }   
        if (count >=3){
            System.out.println("yes");
        }else{
            System.out.println("No");
    }
}
}
