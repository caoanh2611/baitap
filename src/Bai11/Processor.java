
package Bai11;


public class Processor {
    public static void main(String[] args) {
     System.out.println("\nTop 3 :");
        for (Student student : personList.findTop3Students()) {
            student.displayDetails();
        }
         Teacher topTeacher = personList.findTeacherWithHighestIncome();
        if (topTeacher != null) {
            topTeacher.displayDetails();
        }
        System.out.println("\nSinh viên nhan hõ bong:");
        for (Student student : personList.findStudentsWithScholarships()) {
            student.displayDetails();
        }
}
