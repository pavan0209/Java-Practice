import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String firstName;
    String lastName;
    double percentage;
    char grade;

    Student(int rollNo, String firstName, String lastName, double percentage, char grade) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.percentage = percentage;
        this.grade = grade;
    }

    // setters
    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    void setGrade(char grade) {
        this.grade = grade;
    }

    // getters
    int getRollNo() {
        return this.rollNo;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    double getPercentage() {
        return this.percentage;
    }

    char getGrade() {
        return this.grade;
    }

    public int compareTo(Student other) {
        // return this.getRollNo() - other.getRollNo();
        // return this.getFirstName().compareTo(other.getFirstName());
        // return this.getLastName().compareTo(other.getLastName());
        // return (int) (this.getPercentage() - other.getPercentage());
        return this.getGrade() - other.getGrade();
    }

    @Override
    public String toString() {
        return "Student(rollNo: " + this.rollNo +
                ", firstName: " + this.firstName +
                ", lastName: " + this.lastName +
                ", percentage: " + this.percentage +
                ", grade: " + this.grade;
    }
}

class Solution {
    public static void main(String[] args) {

        Student pavan = new Student(10, "Pavan", "Sonawane", 92.40, 'A');
        Student ganesh = new Student(1, "Ganesh", "Shinde", 80.00, 'B');
        Student rushi = new Student(5, "Rushi", "Birari", 91.20, 'A');
        Student dipak = new Student(20, "Dipak", "Kalaskar", 70.00, 'C');
        Student prasad = new Student(18, "Prasad", "Potdar", 85.00, 'B');

        ArrayList<Student> list = new ArrayList<>();

        list.add(pavan);
        list.add(ganesh);
        list.add(rushi);
        list.add(dipak);
        list.add(prasad);

        System.out.println(list);

        System.out.println("After sorting");

        Collections.sort(list);

        System.out.println(list);

    }
}