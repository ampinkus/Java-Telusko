import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        // ArrayList is a class that implements List, List are objects so I can mix numbers, letters, strings...
        //  uses index numbers and allows me to decide where I put a value based on the index
        List values = new ArrayList();
        values.add(1);
        values.add(3);
        values.add(4);
        // we can add an element with his index.
        values.add(2,2);

        // Iterate over the list and print each element, see that value needs to be defined as an Object
        for (Object value : values) {
            System.out.println(value);
        }





    }
}
