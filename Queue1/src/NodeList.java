public class NodeList {
 
    Node head;

    public NodeList(Node head){
      this.head = head;
    }

    public void add(Node head){
      this.head.next = head;
    }
  
    public static void main(String[] args) {
      NodeList list = new NodeList(new Node (10));
      list.add( new Node(100));
      list.add( new Node(200));
    }
}
