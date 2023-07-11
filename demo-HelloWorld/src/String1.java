public class String1 {
    public static void main(String[] args){
        String str = "I am happy.";
        str = str +"!";
        System.out.println(str);
        
        //Method - length()
        int i = str.length();
        System.out.println("str length is " + i + ".");
        System.out.println("str length is " + "I am happy.".length() + ".");
        System.out.println("str length is " + str.length() + ".");
        
        //Method - equals()
        String st1 = "abc";
        String st2 = "abcd";
        String st3 = "abc";
        boolean areTheyEqual1 = st1.equals(st2); //false
        boolean areTheyEqual2 = st1.equals(st3); //true
        boolean areTheyEqual3 = st2.equals(st3+ "d");

        System.out.println(areTheyEqual1);
        System.out.println(areTheyEqual2);
        System.out.println(areTheyEqual3);

        //chatAt(2), find the index 2 of the string
        String str4 = "Hello";
        System.out.println(str4.charAt(0));
        

        
    }
}