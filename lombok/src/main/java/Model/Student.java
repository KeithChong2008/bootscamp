package Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor // The minimal args to create  Student Object
@AllArgsConstructor

public class Student {
  //No final and no @NonNull arrtibute in this class
  
  private int age;

  public static void main(String[] args) {
    Student student = new Student(); //come from RequiredArgsConsturctor
    Student s2 = new Student(10);

  }
}
