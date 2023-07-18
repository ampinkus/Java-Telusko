import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// create a Estudiantes class, in order to compare instances we need to implement the Comparable Interface
class Estudiantes implements Comparable<Estudiantes> {
    int rollNumber, marks;
    String name;

    public Estudiantes(int rollNumber, int marks, String name) {
        super();
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.name = name;
    }

    // to print the instances
    @Override
    public String toString() {
        return "Estudiantes{" +
                "rollNumber=" + rollNumber +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
    // the compareTo method that we need to implement in the class, in this example marks
    @Override
    public int compareTo(Estudiantes other) {
        // Implement the comparison logic based on rollNumber
        return Integer.compare(this.marks, other.marks);
    }
    /*
    The compareTo method is implemented within the Estudiantes class. Inside this method, we provide the comparison logic
    based on the rollNumber of the students. The compareTo method returns a negative value if this.rollNumber
    is less than other.rollNumber, a positive value if it is greater, and zero if they are equal.
     */
}

public class CollectionClass {
    public static void main(String[] args) {
        List<Estudiantes> stud = new ArrayList<>();
        stud.add(new Estudiantes(23, 9, "Fredi"));
        stud.add(new Estudiantes(24, 6, "Tomas"));
        stud.add(new Estudiantes(25, 7, "Juan"));

        // Sort the list based on rollNumber
        Collections.sort(stud);

        // Reverse the sort order
        Collections.reverse(stud);

        for (Estudiantes s : stud) {
            System.out.println(s);
        }
    }
}
