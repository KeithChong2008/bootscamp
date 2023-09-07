package RevisionDemo.src;
import java.util.ArrayList;
import java.util.List;

public class Company {
  List<Staff> staffs;
  List<List<Staff>> staffLists;
  int [][] arr = new int[2][3];
  private static int counter;


  public Company(){
    staffs =new ArrayList<>();
    staffLists = new ArrayList<>();
  }

public Company(List<Staff> staffs){
  this.staffs = staffs;
}

public List<Staff> getStaffs(){
  return this.staffs;
}

public void add(Staff staff ){
  this.staffs.add(staff);
  counter++;
}



public String getStaffName(int staffid){
  return this.staffs.stream()
  .filter(s -> s.getId() == staffid) // List <Staff>
  .map(s ->s.getName()) //Convert List<Staff> to List <String>
  .findAny()  // Option<String>
  .orElse(null); // String
}


}
