 
    
package Bai8;

import java.util.Scanner;

public class ReferenceBook extends Book {

    private String publisher;

    public ReferenceBook() {
    }

    public ReferenceBook(String id, String title, double basePrice ,String publisher) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Publisher: " + publisher);
         System.out.println("CalculatePrice" +calculatePrice() );
    }

    @Override
    public void enfortion() {
        Scanner s = new Scanner(System.in);
        super.enfortion();
        System.out.println("Enter publisher : ");
        this.publisher = s.nextLine();
  
                
    }

    @Override
    public double calculatePrice() {
      
        return this.getBasePrice()*1.2;
      
    }
    @Override
    public void update(){
       Scanner s = new Scanner(System.in);
       super.update();
        System.out.println("Enter publisher : ");
        this.publisher = s.nextLine();
     }
}



