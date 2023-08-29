package ClassObject2;

public class ItemDesc {
   private String header;
   private String body;

   public ItemDesc(String header,String body){
    this.header =header;
    this.body = body;
   }

   public static void main(String[] args) {
    ItemDesc itemDesc = new ItemDesc("Iteam A","Good");
    ItemDesc itemDesc2 = new ItemDesc("Iteam B","Good");
    Transaction t = new Transaction(itemDesc2, 1, 3.5, 10);
    Transaction t2 = new Transaction(itemDesc2, 1, 3.5, 10);
    Order order = new Order(new Transaction[]{t,t2});

    System.out.println(order.getTotal());
    
   }
}
