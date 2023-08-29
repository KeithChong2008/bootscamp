package ClassObject2;

import java.util.Arrays;

public class StringBox2 {
  char[] string;

  public StringBox2(){}

  public StringBox2(char[] source){
    this.string = new char[source.length];
    for(int i =0; i< source.length;++i){
      string[i] = source[i];
    }//approach 2
    //copyOf() -> new array object, and with the copy values of the original array
    this.string= Arrays.copyOf(source,source.length);
  } 

  public StringBox2 append(String s){//hello ->helloWorld
    //String ->toCharArray()
    char [] res = new char[this.string.length+ s.length()];
    int idx =0;
    int j =0;
    while(idx<this.string.length){
      res[idx] =this.string[j];
      idx++;
      j++;
    }
    j=0;
    while(j < s.length()){
      res[idx] =s.charAt(j);
      idx++;
      j++;
    }
    this.string = res;
    return this;
  }


  public String toString(){
    return String.valueOf(this.string);
  }




  public static void main(String[] args) {
    char[] chars = new char[]{'a','c','b'};

    StringBox2 box = new StringBox2(chars);
    System.out.println(box);

    chars [1] ='x';
    System.out.println(Arrays.toString(chars)); //[a,x,b]
    System.out.println(box.toString()); //[a,c,b]

    System.out.println(box.append("def").toString());

  }

}
