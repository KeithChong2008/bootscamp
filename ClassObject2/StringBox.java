package ClassObject2;

public class StringBox { //String ->Class
  private String string;

  // constructor getter setter
  public void setString(String string) {
    this.string = string;
  }

  public String geString() {
    return this.string;
  }

  public StringBox(String string) {
      this.string = string;
  }

    public StringBox() {

  }

  public StringBox append(String str) { // StringBuilder <- return this
    if (str == null || "".equals(str)) {
      return this;
    }
    this.string = this.string + str;
    return this; // StringBox object;
  }

    public static StringBox append2(String str, String s) {
    return new StringBox(str + s);// StringBox object;
  }

  public String toString() {
    return this.string;
  }

  public StringBox insert(int idex, String s) {
    if (idex < 0 & idex > this.string.length()) {
      return this;
    }
    if (s == null || "".equals(s)) {
      return this;
    }
    this.string = this.string.substring(0, idex) + s + this.string.substring(idex);
    return this;
  }

  public char[] toCharArray(){ // no parameter
    char[] arr = new char[this.string.length()];
    for(int i =0;i<arr.length;i++){
      arr[i] = this.string.charAt(i);
    }
    return arr;
}



  public static void main(String[] args) {
    StringBox stringBox = new StringBox(); // empty constructor
    stringBox.setString("Java");
    System.out.println(stringBox.append("Python"));// JavaPython
    stringBox.append("Javascript").append("HTML").toString();

    StringBox s2 = new StringBox(); // this.string ->null
    s2.append("CSS");
    String abc = StringBox.append2("123", "123").toString();
    
  }

}
