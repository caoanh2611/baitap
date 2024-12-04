package Bai8;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {

        BookList bl = new BookList();
        Scanner s = new Scanner(System.in);
        System.out.println("Menu function Book !  ");
        System.out.println("List Book !");
        while (true) {
            System.out.println("1.Add new (textbook/reference book) ! ");
            System.out.println("2.Update book by id ! ");
            System.out.println("3.Delete book by id ! ");
            System.out.println("4.Find book by id ! ");
            System.out.println("5.Display all books ! ");
            System.out.println("6.Find the most expensive book ! ");
            System.out.println("7.Count the total number of TextBooks and ReferenceBooks separately in the book list. ! ");
            System.out.println("8.Exit...!");
            System.out.println("Choise function :  ");
            int n = s.nextInt();
            s.nextLine();
            switch (n) {
                case 1:
                    bl.eninfortion();
                    break;
                case 2:
                    System.out.print("Enter bool id to update : ");
                    String id = s.nextLine();
                    System.out.println("Update book "+ id +" !");
                    if (bl.updateBookById(id)) {
                        System.out.println("Book update successfully ! ");
                    } else {
                          System.out.println("Not find book !");
                    }
                    break;
                case 3:
                    System.out.print("Enter bool id to delete : ");
                    String id1 = s.nextLine();
                    if (bl.deleteBookById(id1)) {
                        System.out.println("Book delete successfully ! ");
                    } else {
                        System.out.println("Not find book !");
                    }
                    break;
                case 4:
                        System.out.print("Enter book id to find : ");
                    String found1 = s.nextLine();
                    Book found =  bl.findBookById(found1);
                    if(found != null){
                        System.out.println("Book Find successfully ! ");
                        bl.displayAllBooks();
                     }else{
                        System.out.println("Not find book !");
                    }
                    break;
                case 5:
                      bl.displayAllBooks();
                    break;
                case 6:
                     Book findMostExpensiveBook = bl.findMostExpensiveBook();
                     if(findMostExpensiveBook != null){
                         System.out.println("the most expensive book : ");
                         findMostExpensiveBook.displayDetails();
                     }else{
                          System.out.println("No Book available.");
                     }
                    break;
                case 7:
                    bl.countBooks();
                    break;
                case 8:
                    System.out.println("Exit Propgram !");
                   s.close();
                    return;
                default:
                    System.out.println("Not find function ! . Again Enter !");
                    break;
            }
        }
    }
}
