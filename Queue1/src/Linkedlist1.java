public class Linkedlist1 {
  
  String str;
  Linkedlist1 node;

   public Linkedlist1(){
 
  }


  public void setStr(String str){
    this.str = str;
  }

  public Linkedlist1(String str){
    this.str = str;
  }

   public void setNode(Linkedlist1 node){
    this.node = node;
  }

  public Linkedlist1 getNode(){
    return this.node;
  }

  public String getStr(){
    return this.str;
  }


  public static void main(String[] args) {
    Linkedlist1 LL = new Linkedlist1("Body");
    LL.setStr("head");
    LL.setNode(new Linkedlist1("body") );
 
    LL.getNode().setNode(new Linkedlist1("tail") );

    Linkedlist1 head = LL;
    String string= " ";

    while(head.getNode() != null){

     string += head.getStr();
     head = head.getNode();
    }


  }
}
