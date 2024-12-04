
package Bai10;

import java.util.*;
public class Processor {
    public static void main(String[] args) {
        RoomList rl = new RoomList();
        Scanner s= new Scanner(System.in);
        System.out.println("List ALL Room !");
        System.out.println("Menu function !");
        while (true) {            
            System.out.println("\n1.Add a new Room (1.meeting room / 2.bedroom)!");
            System.out.println("2.Update room by id !");
            System.out.println("3.Delete room by id !");
            System.out.println("4.Find room by id !");
            System.out.println("5.Display all Rooms");
            System.out.println("6.Find the most expensive Room");
            System.out.println("7.Count the total number of meeting room and bedroom separately in the RoomList !");
            System.out.println("8.Exit !");
            System.out.print("Choise : ");
            int choise = s.nextInt();
            s.nextLine();
            switch (choise) {
                case 1:
                    rl.enformationroom();
                    break;
                     case 2:
                         System.out.print("Enter Id room to update : ");
                    String up =  s.nextLine();
                         System.out.print("Update room has "+ up  + " !");
                         if(rl.updateRoomById(up)){
                             System.out.println("Room update successfully");
                         }else{
                             System.out.println("Not found Room !");
                         }
                    break;
                     case 3:
                       System.out.print("Enter Id room to delete : ");
                    String dele =  s.nextLine();
                    if(rl.deleteRoomById(dele)){
                            System.out.println("Room delete successfully");
                         }else{
                             System.out.println("Not found Room !");
                         }
                    
                    break;
                     case 4:
                     System.out.print("Enter Id room to Find : ");
                    String id =  s.nextLine();
                    Room find = rl.findRoomById(id);
                    if(find != null){
                        find.displayDetails();
                    }else{
                        System.out.println("NOT FIND ROOM !");
                    }
                    break;
                     case 5:
                      Room MostExpensiveRoom = rl.findMostExpensiveRoom();
                      if(MostExpensiveRoom != null){
                          MostExpensiveRoom.displayDetails();
                      }else{
                          System.out.println("Not room avil.");
                      }
                    break;
                     case 6:
                     rl.displayAllRooms();
                    break;
                     case 7:
                         rl.countRooms();
                    break;
                     case 8:
                         System.out.println("Exit propgram !");
                         
                   return ;
                default:
                    System.out.println("Not find function . Agian enter !");
            }
        }
    }
}
