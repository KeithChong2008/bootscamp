import java.util.ArrayList;

public class ShoppingCart <T extends CheckoutItem> {

   private ArrayList<T> foods;

   public void add(int quantity, DisplayItem DisplayItem){
      //construct CheckoutItem
      CheckoutItem checkoutItem = new CheckoutItem(quantity, DisplayItem.getPrice());
      items.add((T) checkoutItem);
   }

   public ShoppingCart(){
    foods = new ArrayList<>();
   }


    private ArrayList <T> items;


   public void add(T item){
    foods.add(item);
   }

   public boolean remove(T food){
    return foods.remove(food);
   }

   public int totalAmount(){
      int sum =0;
      for(CheckoutItem item: this.items){
         sum += Math.max(0,  item.getPrice() * Math.max(0,item.getQuantity()));
      }
      return sum;
   }

   public void clear(){
      this.items.clear();
   }

   public static void main(String[] args) {
    


    ShoppingCart <CheckoutItem> cart = new ShoppingCart<>();
    cart.add( new Rice());
    //cart.add(new Food());
   //  ShoppingCart <Item> cart2 = new ShoppingCart<>();
   //  ShoppingCart <Drink> car3 = new ShoppingCart<>();
   //    ShoppingCart <Food> car4 = new ShoppingCart<>();


   }
   
}
