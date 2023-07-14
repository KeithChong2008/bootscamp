package Loop;

public class ReversString {
    public static void main(String[] args) {
        String str = "hello";
        // output: olleh
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse+ str.charAt(i);
        }

        System.out.println(reverse);
        for (int i = 0; i <str.length(); i++) {
            reverse +=str.charAt(str.length() - 1- i);//Question
        }
        System.out.println(reverse);
    }
}
