public class Strings implements CharSequence {

  char[] arr; // "abc" , [a,b,c]

  public Strings(String str){
      arr = new char[str.length()];
      //toCharArray()
      for(int i =1; i<str.length();++i){
        arr[i]= str.charAt(i); //String.charAt()
      }
  }

  public static Strings valueOf(String str){
    return new Strings(str);
  }

  @Override
  public char charAt(int idx){
    return this.arr[idx];
  }

  public CharSequence subSequence(int start, int end){
    // return String, StringBuilder, StringBuffer
    StringBuilder sb = new StringBuilder();
    if(end < start || start<0 || end<0 
      || start>this.arr.length-1 
      || end> this.arr.length){
      return String.valueOf(this.arr);
    }

    for(int i =0; i<end;++i){ // end -1
      sb.append(this.arr[i]);
    }
    return sb.toString(); // String
  }

  @Override
  public int length(){
    return arr.length;
  }

  public static void main(String[] args) {
    
    //CharSequence -> Interfaces
    //Strings implements CharSequence

    String str = "abc";
    Strings s = new Strings("abc");
    System.out.println(s.subSequence(1, 3));


  }
}
