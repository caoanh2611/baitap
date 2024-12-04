package Bai11;

import java.util.*;

public class Teacher extends Person {

    private int numberOfClasses;
    private double baseSalary;

    public Teacher() {
    }

    public Teacher(int numberOfClasses, double baseSalary, String id, String name, Date dateofBtith) {
        super(id, name, dateofBtith);
        this.numberOfClasses = numberOfClasses;
        this.baseSalary = baseSalary;
    }

    @Override
    public void inputPreson() {
        Scanner s = new Scanner(System.in);
        super.inputPreson();
        System.out.print("Ennter numberOfClasses : ");
        this.numberOfClasses = s.nextInt();

        System.out.print("Ennter tuitionFee : ");
        this.baseSalary = s.nextDouble();
    }

    @Override
    public double calculateIncome() {
   
        return numberOfClasses * baseSalary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("numberOfClasses : " + numberOfClasses);
        System.out.println("baseSalary : " + baseSalary);
        System.out.println("Income : "+ calculateIncome());
    }

    @Override
    public void up() {
        super.up();
        Scanner s = new Scanner(System.in);

         System.out.print("Ennter numberOfClasses : ");
        this.numberOfClasses = s.nextInt();

        System.out.print("Ennter tuitionFee : ");
        this.baseSalary = s.nextDouble();
    }

}
