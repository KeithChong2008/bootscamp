package DemoException.src.CheckedError;
public class Student {
  String name;
  long pocketMoney;


  public Student() {
    
  }

  public Student(String name) {
    this.name = name;
  }

  public void setPocketMoney(long D) throws AmountSmallerThanZeroExcpetion {
    if (pocketMoney <= 0) {
      throw new AmountSmallerThanZeroExcpetion("Amount <=0");
    }
    this.pocketMoney = pocketMoney;
  }

  public static void main(String[] args) throws NameNotMatch {
    Student student = new Student("John");
    try {
      student.setPocketMoney(-3);
    } 
    catch (AmountSmallerThanZeroExcpetion | NameNotMatch e  ) {
      System.out.println("Northing happen");
    }
    finally{
      System.out.println("finally");
    }



    Student student2 = new Student();
    student2.name.length();
  }
}