public class B extends A {
  String str;

  public void SetStr(String str){
    this.str =str;
  }

    public void print(String anotherStr){
      System.out.println(this.str + " " + anotherStr);
    }
}