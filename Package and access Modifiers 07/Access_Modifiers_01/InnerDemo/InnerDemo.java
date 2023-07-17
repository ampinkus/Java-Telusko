package InnerDemo;
// I need to import the class student, also I can import all the classes from the package with import Student.*;
import Student.Student;

public class InnerDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.rollNumber = 10;
        // student.name = "Tomas" //error!
    }
}
