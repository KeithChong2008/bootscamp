public class Testing2 {
  public static int totalMoney(int n) {
    int money =0;
    for(int i =0; i<=n;i++){
        money+= i;
    }
    return money;
}
public static void main(String[] args) {
  System.out.println(totalMoney(4));
}
}
