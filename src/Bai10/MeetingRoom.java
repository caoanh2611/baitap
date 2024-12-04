
package Bai10;
import java.util.Date;
import java.util.Scanner;
public class MeetingRoom extends Room{
 private int numberOfBeds ;

    public MeetingRoom() {
      
    }

    public MeetingRoom(int numberOfBeds, String id, String name, double basecost, Date checkinDate, Date checkoutDate  ) {
        super(id, name, basecost, checkinDate, checkoutDate);
        this.numberOfBeds = numberOfBeds;
    }
 
 @Override
     public void enformation() {
         super.enformation();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter numberOfBeds : ");
        this.numberOfBeds =  s.nextInt();
     }
   
    @Override
    public double calculateCost() {
     if(numberOfBeds >=3 ){
         return this.getBasecost() *1.1 * this.dayStay();
     }
     return this.getBasecost() * this.dayStay();
     
     }
    

    @Override
    public void displayDetails() {
      super.display();
      System.out.print("NumberOfBeds : " +numberOfBeds);
       
    }
 @Override
    public  void update(){
        super.update();
          Scanner s = new Scanner(System.in);
         System.out.print("Enter numberOfBeds : ");
        this.numberOfBeds =  s.nextInt();
    }
}

