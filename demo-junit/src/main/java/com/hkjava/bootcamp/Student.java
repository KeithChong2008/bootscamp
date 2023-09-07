package com.hkjava.bootcamp;

import java.util.List;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import java.util.ArrayList;


public class Student {
  @NonNull
  List<Subject> subjects;


  public Student(){
    subjects = new ArrayList<>();
  }

  public List<Subject> getSubjects(){
    return this.subjects;
  }
}
