package HashMap1;


public class Author {

  String Author;
  int age;

  public Author(String Author,int age){
    this.Author = Author;
    this.age = age;
  }

  @Override
  public boolean equals(Object o){
    if(this ==o){
      return true;
    }
    if(!(o instanceof Author)){
      return false;
    }
    Author Author = (Author) o;
    return this.Author  == Author .Author ;
  }

}
