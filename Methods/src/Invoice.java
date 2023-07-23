package Methods.src;

public class Invoice {

  //Task 1: method to caculates item total prices of an items
  public static double caculation(int quality, double unitPrice){
    //Parameters Control
    // Early Return
    if (quality <0 || unitPrice <=0){
      return 0;
    }

    return quality * unitPrice;//10*10.9 // main logic
  } 
  
  //Task 2:A method to caculate total amount of the invoice
  public static double caculTotoalInvoiceAmount(double[] totalPriceItems){//Array can be paramenter
    double total=0.0d;
    for(int i =0;i <totalPriceItems.length;i++){
      total +=totalPriceItems[i];
    }
    return total;
  }

  public static void main (String [] args){
    int[] quanities = new int[]{5,4,7,20,10};
    double[] unitPrices = new double[]{10.9,100.3,2.1,9.9,1000.3};
    double[] totalPriceItems = new double [unitPrices.length] ; // 5

    //Loop
    for(int i = 0;i <totalPriceItems.length;++i){
     totalPriceItems[i] = caculation(quanities[i],unitPrices[i]);
    }

    double invoiceTotalAmount = caculTotoalInvoiceAmount(totalPriceItems);
    System.out.println("Total Amount: " + invoiceTotalAmount);
  }
}
