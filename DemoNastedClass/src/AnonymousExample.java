interface Reading{
  void read();
}


public class AnonymousExample {
  public static void main(String[] args) {
      Reading read1 = () ->{
    System.out.println("I am Lambda, reading ......");
  };
      read1.read();

      Reading read2 =  new Reading() {
        int x;

        @Override
        public void read(){
          this.x++;
          System.out.println("I am Anonumoys, reading ...x=" +x);
        }
      };
      read1.read();
      read2.read();
  }



}
