public class Zoo <T> {
   T animal;

  public Zoo(T animal){
    this.animal =animal;
  }

  public Zoo(){

  }

  //Zoo <T> -> return type
  // T ->input Parameter
  //<T> -> the range of T

  public static <T extends Animal> Zoo<T> of(T animal){
    return new Zoo<>(animal);
  }


  public T getAnimal(){
    return this.animal;
  }

  public void setAnimal(T animal){
    this.animal = animal;
  }

  public static void main(String[] args) {
    Zoo<Dog> zoo10 = new Zoo<Dog>( new Dog("anc"));  
  }
}
