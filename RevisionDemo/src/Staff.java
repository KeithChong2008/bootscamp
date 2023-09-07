package RevisionDemo.src;

public class Staff {
  private int id;
  private double salary;
  private String name;

  public Staff(int id, double salary, String name){
    this.id = id;
    this.salary = salary;
    this.name =name;
  }

  public boolean equals(Object o){
    if(this ==o){
      return true;
    }
    if(!(o instanceof Staff)){
      return false;
    }
    Staff staff = (Staff) o;
    return Object.equals(this.id, staff.id);
  }

  public int getId(){
    return this.id;
  }

  public String getName(){
    return this.name;
  }


}
