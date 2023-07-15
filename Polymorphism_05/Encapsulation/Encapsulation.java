// encapsulation:  Binding data with methods.
package Encapsulation;

class Student{
    // the variables should be private
    private int rollNumber;
    private String name;

    // I create setters and getters to get and set the variables
    public int getRollNumber() {
        // I can put lines of code inside
        System.out.println("Somebody is asking for the roll number");
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // in the class Student we can access the properties directly
        Student stu1 = new Student();
        // As the variables are private I cant access them directly
        // stu1.rollNumber = 12;
        // stu1.name = "Fredi";

        // to changes the variables I need to use the set methods
        stu1.setRollNumber(12);
        stu1.setName("Fredi");

        // to get the variables I need to use the get methods
        System.out.println(stu1.getRollNumber());
        System.out.println(stu1.getName());

    }
}
