package Bai11;

import java.util.*;

public class Student extends Person {

    double gpa;
    private double tuitionFee;

    public Student() {
    }

    public Student(double gpa, double tuitionFee, String id, String name, Date dateofBtith) {
        super(id, name, dateofBtith);
        this.gpa = gpa;
        this.tuitionFee = tuitionFee;
    }

    public void inputPreson() {
        Scanner s = new Scanner(System.in);
        super.inputPreson();
        System.out.print("Ennter gpa : ");
        this.gpa = s.nextDouble();

        System.out.print("Ennter tuitionFee : ");
        this.tuitionFee = s.nextDouble();
    }

    @Override
    public double calculateIncome() {
        if (gpa > 3.5) {
            return tuitionFee * 0.5;
        }
        return tuitionFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Gpa : " + gpa);
        System.out.println("tuitionFee : " + tuitionFee);
         System.out.println("Income : "+ calculateIncome());
    }

    @Override
    public void up() {
        super.up();
        Scanner s = new Scanner(System.in);

        System.out.print("Ennter gpa : ");
        this.gpa = s.nextDouble();

        System.out.print("Ennter tuitionFee : ");
        this.tuitionFee = s.nextDouble();
    }

}
