//Create a Book class for a library system.
// • Instance variables: title, author, isbn.
// • Static variable: totalBooks, a counter for the total number of book 
// instances.
// • Instance methods: borrowBook(), returnBook().
// • Static method: getTotalBooks(), to get the total number of books in the 
// library.


package Challenges;

import java.util.Scanner;

public class Challenge51 {
  public static void main(String[] args) {
    Book book1 = new Book();
    Book book2 = new Book();
    Book book3 = new Book();

    book1.title = "The Love We Carried";
    book1.author = "Prasanth Thakur";
    book1.isbn = 123456789;

    book2.title = "Life Changes When, Time Changes";
    book2.author = "Sushanth Thakur";
    book2.isbn = 652387490;

    book2.title = "Room No 69";
    book2.author = "Sushanth Thakur";
    book2.isbn = 652388356;

    Book[] bookshelf = {book1, book2, book3};

    book1.borrowBook(bookshelf);
    book1.returnBook(bookshelf);
    Book.getTotalBooks(bookshelf);
    Book.getTotalBookses();
  }
}

class Book {
  Scanner input = new Scanner(System.in);
  String title;       //instance variable
  String author;     //instance variable
  int isbn;         //instance variable

  static int totalBooks;

  Book(){
    totalBooks++;
  }

  static void getTotalBookses(){
    System.out.println("total books " + totalBooks);
  }

  void borrowBook(Book[] bookshelf){
    System.out.print("Do you want to borrow books ? (Yes/No): ");
    String checkBorrow = input.nextLine();
    if (checkBorrow.equalsIgnoreCase("Yes")) {
      System.out.print("Enter the Name of the book you want to borrow: ");
      String borrowBookTitle = input.nextLine();

      int i = 0;
      boolean found = false;

      while (i < bookshelf.length) {
        if (bookshelf[i].title.equalsIgnoreCase(borrowBookTitle)) {
          found = true;
          System.out.println("Book is available, You Borrowed " + bookshelf[i].title);
          break;
        }
        i++;
      }
      if (!found) {
        System.out.println("Sorry, Book is not available");
      }
    }
  }

  void returnBook(Book[] bookshelf){
    System.out.print("Do you want to return books ? (Yes/No): ");
    String checkReturn = input.nextLine();
    if (checkReturn.equalsIgnoreCase("Yes")) {
      System.out.println("Enter the Book You want to return: ");
      String returnBook = input.nextLine();

      int i = 0;
      boolean found = false;

      while (i < bookshelf.length) {
        if (bookshelf[i].title.equalsIgnoreCase(returnBook)) {
          found = true;
          System.out.println("You're lying, this book is already in the shelf " + bookshelf[i].title);
          System.out.println("Fuck You!");
          break;
        }
        i++;
      }

      if (!found) {
        System.out.println("Your Book is returned, Thank You!");
      }
    }
  }

  static void getTotalBooks(Book[] bookshelf){
    int i = 0;
    int count = 0;
    while (i < bookshelf.length) {
      count += 1;
      System.out.printf("%d. Name of the Book is %s in the shelf\n", i+1, bookshelf[i].title);
      i++;
    }
    System.out.println("The Total Number of the books available on shelf is " + count);
  }
}
