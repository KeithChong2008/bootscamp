package RevisionDemo.src;

public class Student <T extends Number> {

  T data;

    public static <S> S getThing(S data){
      return data;
  }
  
  public T getData(){
    return this.data;
  }
  
  public static void main(String[] args) {
    Student<Integer> student = new Student<>();
    student.getThing(2);

  }

}
