package RevisionDemo.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Company2 {
  Staff[] staffs;

   public Company2(){
    staffs =  new Staff[0];
  }

public Company2(Staff[] staffs){
  this.staffs = staffs;
}

public Staff[] getStaffs(){
  return this.staffs;
}


public void add(Staff staff){
  Staff [] orginal = this.staffs; //reference
  this.staffs = new Staff[this.staffs.length+1];
  for(int i =0 ; i< orginal.length; ++i){
    this.staffs[i] = orginal[i];
  }
  this.staffs[this.staffs.length] = staff;
}

public void remove(Staff staff){
  this.staffs = new Staff[this.staffs.length-1];
  int idx = -1;
  for(int i =0;i< this.staffs.length; ++i){
    if(staffs[i].equals(staff)){
      idx = i; // the index going to remove
    }
  }
  //Not found, do northing
  if(idx == -1){
    return;
  }
  //found, resize array and remove
    Staff[] original = this.staffs;
    this.staffs = new Staff[this.staffs.length-1];
    for(int i = idx; i< this.staffs.length;++i){
    if(idx == -idx){
      continue;
  }
  this.staffs[i] = original[i];
}
}
public static void main(String[] args) {
  Company company = new Company();
  company.getStaffs().add(new Staff(1 ,2000, "John"));
  company.add(new Staff(2, 10000, "Peter"));

  company.getStaffName(1); //"John"

  List<Person> persons = Arrays.stream(company.getStaffs())
  .filter(s -> s.getSalary() > 20000 )
  .map(s -> new Person(e.getName()))
  .collect(Collectors.toList());



}
}
