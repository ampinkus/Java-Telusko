import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {
        // ArrayList is a class that implements List, List are objects so I can mix numbers, letters, strings...
        //  uses index numbers and allows me to decide where I put a value based on the index
        // we can specify what type is the list of:
        List<Integer> values = new ArrayList<>(); // take care of the <> on both sides
        values.add(4);
        values.add(9);
        values.add(6);
        values.add(2);

        // we can sort any List using
        Collections.sort(values);

        // Iterate over the list and print each element, see that value needs to be defined as an Object
        for (Object value : values) {
            System.out.println(value);
        }
        // in reverse order
        Collections.reverse(values);
        System.out.println("");
        for (Object value : values) {
            System.out.println(value);
        }

        // get maximum
        System.out.println("");
        System.out.println(Collections.max(values));

    }
}

/*

 */