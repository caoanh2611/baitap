
package Bai8;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class BookList {

    ArrayList<Book> list;
    Scanner s = new Scanner(System.in);

    public BookList(ArrayList<Book> list) {
        this.list = list;
    }

    public BookList() {
        this.list = new ArrayList<>();
    }

    public void addBook(Book book) {
        list.add(book);
    }

    public void eninfortion() {
        System.out.println("List Book !");
        System.out.print("Enter Number Book : ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("book number :  " + (i + 1) + " !");
            System.out.print("Type Book (1.TextBook / 2.ReferenceBook  : ");
            int TypeBook = s.nextInt();
            if (TypeBook == 1) {
                TextBook textbook = new TextBook();
                textbook.enfortion();
                addBook(textbook);

            } else if (TypeBook == 2) {
                ReferenceBook referenceBook = new ReferenceBook();
                referenceBook.enfortion();
                addBook(referenceBook);
            } else {
                System.out.println("Not type Book . Agian Enter !");
                --i;
            }

        }
    }

    public void displayAllBooks() {
        System.out.println("List Book !");
        for (Book book : list) {
            book.displayDetails();
        }
    }

    public Book findBookById(String id) {
        for (Book book : list) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;

    }

    public boolean updateBookById(String id) {
        Book up = findBookById(id);
        if (up != null) {
            System.out.println("List Book update !");
            up.update();
            return true;
        }

        return false;

    }

    public boolean deleteBookById(String id) {
        Book dl = findBookById(id);
        if (dl != null) {
            list.remove(dl);
            return true;
        }
        return false;
    }

    public Book findMostExpensiveBook() {
        Book MostExpensiveBook = list.get(0);
        for (Book book : list) {
            if (Double.compare(book.calculatePrice(), MostExpensiveBook.calculatePrice()) > 0) {
                MostExpensiveBook = book;
            }
        }
        return null;
    }

    public void countBooks() {
        int count = 0;
        int count1 = 0;
        for (Book book : list) {
            if (book instanceof TextBook) {
                count++;
            }
            if (book instanceof ReferenceBook) {
                count1++;
            }
        }
        System.out.println("Total TextBook: " + count);
        System.out.println("Total ReferenceBook: " + count1);
    }
}
