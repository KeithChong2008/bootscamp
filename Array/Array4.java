package Array;

public class Array4 {

public static String swap(String str, int idx1, int idx2){
      if (str ==null ){
        return null;  
      }else if( str.isBlank()){
        return str;
      }else if (idx1<0||str.length()<=idx1){
        return str;
      }

      char[] chars = str.toCharArray();
      char temp = chars[idx1];
      chars[idx1] = chars[idx2];
      chars[idx2]= temp;
      return String.valueOf(chars);

}


  public static void main (String args[]){
      System.out.println(swap("hello",2,4));
    




  }
}
