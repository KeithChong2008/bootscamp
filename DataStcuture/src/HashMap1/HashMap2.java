package HashMap1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Hashset1.Book;

import HashMap1.HashMap1;

public class HashMap2 {
  public static void main(String[] args) {
    HashMap<Integer, Book> books = new HashMap<>();
    // key = Address of Byte or value or Byte?
    books.put(128, new Book("book1", "dummy"));
    books.put(128, new Book("book2", "dummy"));
    System.out.println(books.size());

    HashMap<Author, Book> bookMap = new HashMap<>();

    Author author1 = new Author("John", 30);
    Author author2 = new Author("May", 29);

    bookMap.put(author1, new Book("Book3", "dummy"));
    bookMap.put(author1, new Book("Book4", "dummy"));

    System.out.println(bookMap.size()); // 1

    HashMap<Author, ArrayList<Book>> bookMap2 = new HashMap<>();
    ArrayList<Book> booklist1 = new ArrayList<>();
    booklist1.add(new Book("Book1", "dummy"));
    booklist1.add(new Book("Book2", "dummy"));

    ArrayList<Book> booklist2 = new ArrayList<>();
    booklist2.add(new Book("Book3", "dummy"));
    booklist2.add(new Book("Book4", "dummy"));

    bookMap2.put(author1, booklist1);
    bookMap2.put(author2, booklist2);

    // Loop bookMap2, print out all the books from each Author
    // Author = Key

    for (Map.Entry<Author, ArrayList<Book>> author : bookMap2.entrySet()) {
      for (Book book : author.getValue()) {
        System.out.println("Author Name: " + author.getKey().Author + " & Book name: " + book.getName());
      }
    }

    for (Book book : bookMap2.get(new Author("John", 0))) {
      System.out.println(book);
    }

    

  }
}
