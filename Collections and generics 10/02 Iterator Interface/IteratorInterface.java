import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorInterface {
    public static void main(String[] args) {
        // ArrayList is a class that implements the collection interface
        Collection values = new ArrayList();
        values.add(1);
        values.add(2);
        values.add(3);

        System.out.println(values);
        // If I want to print each value collections don't have an index number, we use the interface Iterator
        Iterator number = values.iterator();
        /*
        System.out.println(number.next());
        System.out.println(number.next());
        System.out.println(number.next());
        System.out.println(number.next()); // gives an error
        */

        // a better way is:
        while (number.hasNext()){
            System.out.println(number.next());
        }



    }
}
