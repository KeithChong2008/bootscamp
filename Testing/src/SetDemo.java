import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
public class SetDemo {

  
  public static void main(String[] args) {
    Set<String> bankA = new HashSet<>();
    bankA.add("Jessica");
    bankA.add("Wilson");
    bankA.add("Tony");

    Set<String> bankB = new HashSet<>();
    bankB.add("Steven");
    bankB.add("Tony");

     Set<String>commonCustomers = new HashSet<>();
     Set<String>commonCustomersToremove = new HashSet<>();
     for(String i : bankA){
        if(bankB.contains(i)){
          bankA.remove(i);
          commonCustomers.add(i);
          commonCustomersToremove.add(i);
        }
     }
     bankA.removeAll(commonCustomersToremove);
     bankB.removeAll(commonCustomersToremove);

     Map<String,Double> bookMap = new HashMap<>();
     bookMap.put("Introduction to Computer" , 200d);
     bookMap.put("Java Programming" , 250d);
     bookMap.put("Computer Network" , 150d);

     Collection <Double> Avgprice = bookMap.values();
     double total =0;
     double aveprice =0;
     int count =0;
     for(Double i : Avgprice){
        total +=i;
        count++;
     }
     aveprice = total/count;
  }
  
}
