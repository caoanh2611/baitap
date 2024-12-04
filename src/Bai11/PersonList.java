package Bai11;

import java.util.*;

public class PersonList {

    ArrayList< Person> personList;
    Scanner s = new Scanner(System.in);

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    public PersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person) {
        personList.add(person);

    }

    public void enaddPerson() {
        System.out.println("List Person !");
        System.out.print("Enter number Person :");
        int n = s.nextInt();
        s.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Person number " + (i + 1) + " !");
            System.out.print("Tpye Person (1.Student / 2.Teacher) : ");
            int type = s.nextInt();
            if (type == 1) {
                Student st = new Student();
                st.inputPreson();
                addPerson(st);
            } else if (type == 2) {
                Teacher tc = new Teacher();
                tc.inputPreson();
                addPerson(tc);
            } else {
                System.out.println("Not found type Room !");
            }

        }
    }

    public void displayAll() {
        System.out.println("List Person !");
        for (Person person : personList) {
            person.displayDetails();
        }
    }

    public ArrayList< Student> findTop3Students() {
        ArrayList<Student> students = new ArrayList<>();
        for (Person person : personList) {
            if (person instanceof Student student) {
                students.add(student);
            }

        }
        if (students.size() <= 3) {
            return students;
        }

        if (students.size() > 3) {
            students.sort((s1, s2) -> Double.compare(s2.gpa, s1.gpa));
        }

        return new ArrayList<>(students.subList(0, 3));

    }

    public Teacher findTeacherWithHighestIncome() {
        Teacher highestIncomeTeacher = null;
        for (Person person : personList) {
            if (person instanceof Teacher teacher) {
                if (highestIncomeTeacher == null || teacher.calculateIncome() > highestIncomeTeacher.calculateIncome()) {
                    highestIncomeTeacher = teacher;
                }
            }
        }
        return highestIncomeTeacher;
    }

    public ArrayList<Student> findStudentsWithScholarships() {
        ArrayList<Student> scholarshipStudents = new ArrayList<>();
        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.gpa >= 3.5) {
                    scholarshipStudents.add(student);
                }
            }
        }
        return scholarshipStudents;
    }
}

