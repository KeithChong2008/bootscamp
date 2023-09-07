package OptionalDemoagain.src;

import lambda.src.lambdademo;

public class Polymorphism {

  public static void main(String[] args) {
    //static polynorphism (overloading)

    //get(int x) is different to get(String x)
    //compile-time check

    //dynamic polynorphism (Parent class, Interface)
    //Customer extend Human implements Orderable

    Human customer = new Customer("John");
    customer.order();
    System.out.println(Customer.counter); //1

    Customer customer2 = new Customer("Peter");
    customer2.order();
    System.out.println(Customer.counter); //2(+1)

    Human Human = new Human("Mary");
    Human.order();
    System.out.println(Customer.counter); //4(+2)


    customer2.HumanOrder();
    System.out.println(Customer.counter); //6 (+2)

    //Interface
    Orderable customer3 = new Customer("Eric");

    customer3.order(); //7 (+1)

    Orderable[] orders = new Orderable[]{ new Customer("Peter"), new Driver()};

    Orderable order = getByName(orders, "Peter");
    order.order();
    Orderable order2 = getByName(orders, "Vincent");
    order2.order();
    System.out.println(Customer.counter); //11

    


    //Customer human = new Human(); //Cannot assign Parent class to Child class
  
  }

  public static Orderable getByName(Orderable[] orders,String name){
    for(Orderable order: orders){
        if(order instanceof Customer){
          Customer customer = (Customer) order;
          if(name.equals(customer.getName())){
            return customer;
          }
        }
    }
    return new Driver();
  }
  
}
