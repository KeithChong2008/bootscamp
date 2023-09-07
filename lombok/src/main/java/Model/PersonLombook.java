package Model;
import lombok.AllArgsConstructor; // **
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor // annotation
@NoArgsConstructor
@Getter
@Setter
//@ToString
@ToString(onlyExplicitlyIncluded = true)

public class PersonLombook extends Person{
  //@Getter
  private String name;

  @ToString.Include 
  private int age;

public static void main(String[] args) {
  PersonLombook personLombook = new PersonLombook("Peter", 30);
  PersonLombook p2 = new PersonLombook();

  p2.setAge(13);
  p2.setName("Eric");

  System.out.println(p2.getAge());
  System.out.println(p2.getName());


  System.out.println(p2.toString()); // PersonLombook(name=Eric, age=13)


  }

}
