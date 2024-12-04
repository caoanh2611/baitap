package Bai11;

import java.util.Scanner;
import java.util.Date;
import java.text.*;

public abstract class Person implements IPerson {

    private String id;
    private String name;
    Date dateofBtith;

    public Person() {
    }

    public Person(String id, String name, Date dateofBtith) {
        this.id = id;
        this.name = name;
        this.dateofBtith = dateofBtith;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDateofBtith() {
        return dateofBtith;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateofBtith(Date dateofBtith) {
        this.dateofBtith = dateofBtith;
    }

    public void displayDetails() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Id Preson :" + id);
        System.out.println("Name Preson :" + name);
        System.out.println("Id Preson :" + df.format(dateofBtith));
    }

    public void inputPreson() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Id :");
        this.id = s.nextLine();

        System.out.print("Enter Name :");
        this.name = s.nextLine();

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        while (true) {
            System.out.print("Enter date Of Bitrh :");
            String dofb = s.nextLine();
            try {
                this.dateofBtith = df.parse(dofb);
            } catch (Exception e) {
                System.out.println("Not true . Agian enter !");
            }

        }
    }

    public void up() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Name :");
        this.name = s.nextLine();

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        while (true) {
            System.out.print("Enter date Of Bitrh :");
            String dofb = s.nextLine();
            try {
                this.dateofBtith = df.parse(dofb);
            } catch (Exception e) {
                System.out.println("Not true . Agian enter !");
            }

        }
    }
}
