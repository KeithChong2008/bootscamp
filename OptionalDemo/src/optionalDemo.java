package OptionalDemo.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional; 

public class optionalDemo {
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("John"));
    books.add(new Book("Mary"));
    books.add(new Book("Peter"));

    Optional <Book> book = books.stream()
    .filter(b -> b.name.startsWith("M"))
    .findAny();

    book.ifPresent(e ->{
      System.out.println(e);
      //code....
    });

    if(book.isPresent()){
      System.out.println(book.get());
    }else{
      System.out.println("No book found");
    }

    Optional <Book> book2 = Optional.of( new Book("Eric"));
    //Optional <Book> book3 = Optional.of( new Book(null)); // run-time error
    Optional <Book> book4 = Optional.ofNullable(null);
    System.out.println(book4.isPresent()); //false
    Optional <Book> book5 = Optional.ofNullable(new Book("Jenny"));
    Optional <Book> book6 = Optional.empty();
    System.out.println(book6.isPresent()); //false

    Optional<Book> book7 = null;

    //Optional <Book> -> Book
    Book newBook = book6.orElse(new Book("Default"));

    Book newBook2 = book6.orElseGet(()->new Book("Default"));

   //Book newBook3 = book6.orElseThrow(()-> new Exception());

     
    }

    public static Optional <Book> getBook(){
      return Optional.empty();
    }
}
