package ClassObject2;
//State // Behaviour
public class Student {
  String firstname;
  String lastName;
  int age;

  public Student(String firstname,String lastName, int age){
      this.firstname = firstname;
      this.lastName = lastName;
      this.age = age;
  }

  public String fullName(){
    
    return this.firstname.concat(this.lastName);

  }

  public String getfirstname(){
    return this.firstname;
  }
  public String getlastname(){
    return this.lastName;
  }
  public int getAge(){
    return this.age;
  }

  public void setfirstname(String firstname){
    this.firstname = firstname;
  }
  public void setlastname(String lastName){
    this.lastName = lastName;
  }
  public void setAge(int age){
    this.age = age;
  }
  public boolean isAduit(){ // in Object
    // if(this.age >=18){
    //   return true;
    // }return false;
    return this.age >= 18;
  }

   public static boolean isAduit(int age){ // public Method<- not in object
    return age >=18;
   }




}
