/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8;
import java.util.Scanner;
public abstract class Book implements IBook{
    private String id  ;
    private String title  ;
    private double basePrice ;

    public Book() {
    }

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }
    public abstract double calculatePrice();

    
    @Override
    public void displayDetails() {
        System.out.println("Id Book : "+id);
        System.out.println("Title Book : "+title);
        System.out.println("BasePrice book : "+ basePrice);
    }
    public void enfortion(){
        Scanner s = new Scanner(System.in);
         System.out.print("Enter Id book : ");
         this.id =  s.nextLine();
         System.out.print("Enter Titel book : ");
         this.title = s.nextLine();
         System.out.println("Enter basePrice : ");
         this.basePrice  =  s.nextDouble();
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
     public void update(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Titel book : ");
         this.title = s.nextLine();
         System.out.println("Enter basePrice : ");
         this.basePrice  =  s.nextDouble();
     }
    
}
