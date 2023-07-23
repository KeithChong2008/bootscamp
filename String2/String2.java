package String2;

public class String2 { // 19 July 2023
  public static void main(String [] args){
    //method signature = method name + parameter type & quantity

    // trim(), remove leading space and trail space
    String str = "Hello ";
    String str2 = "hel  lo";

    System.out.println(str.trim());
    System.out.println(str2.trim());

    //startsWith(), check if the String start with the target string
    if (str.startsWith("Hel")){
      System.out.println("String is start with Hel");
    }

    //endswith(), check if the String ends with the target string
    boolean endsWithSpace =str.endsWith(" ");
    if (endsWithSpace){
      System.out.println("String is start with leo");
    }

    // indexOf(int) or indexof(char) -> return first index of the value
    System.out.println(str.indexOf('4')); //4
    System.out.println(str.indexOf("ll")); //2
    System.out.println(str.indexOf("lll"));// -1,as you cannot find 'lll'
    
    System.out.println(str.indexOf('o',5)); // -1, as you cannot find 'o'

    System.out.println(str.indexOf("ll", 3));//-1, as you cannot find "ll"

    // Not good to use lastIndex of 
    //LastIndexof(int), the last ocurrence of the char in the String
    String str3 = "hello";
    
    System.out.println(str.lastIndexOf('l')); //3
    System.out.println(str.lastIndexOf("ll")); //2
    System.out.println(str.lastIndexOf('l',3)); //3, as searching backward starting

    // replaceof ()

    String s = "Java is the proramming language.";
    System.out.println(s.replace("Java", "Python"));//Python is the proramming language.
    System.out.println(s.replace("p", "q")); //Java is the qroramming language.

    //equals (), equalsIgnoreCae()
    if ("Hello".equals(str3)){// false, case sentitive
    System.out.println("str3 = Hello");
  }

    if("Hello".equalsIgnoreCase(str3)){//ture, case sentitive
      System.out.println("str3 = hello");
    }
    if("HELLO".equals(str3.toUpperCase())){
      System.out.println("Alternative");
    }

    //concat(String),append someting
    String newString =str3.concat("Java"); //+operation
    System.out.println(newString); //helloJava

    //CompareTo() <-not good to use
    String a = "apple";
    String f = "Facebook";

    System.out.println(a.compareTo(f)); //-5; 97-102('a' - 'f')

    



  }
}
