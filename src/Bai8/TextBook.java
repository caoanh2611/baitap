package Bai8;

import java.util.Scanner;

public class TextBook extends Book {

    private String subject;

    public TextBook() {
    }

    public TextBook(String id, String title, double basePrice,String subject) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
         System.out.println("CalculatePrice" +calculatePrice() );
    }

    @Override
    public void enfortion() {
        Scanner s = new Scanner(System.in);
        super.enfortion();
        System.out.println("Enter Subject : ");
        this.subject = s.nextLine();
  
                
    }

    @Override
    public double calculatePrice() {
      
        return this.getBasePrice()*1.2;
      
    }
    @Override
    public void update(){
     Scanner s = new Scanner(System.in);
       super.update();
       System.out.println("Enter Subject : ");
        this.subject = s.nextLine();
     }
}


