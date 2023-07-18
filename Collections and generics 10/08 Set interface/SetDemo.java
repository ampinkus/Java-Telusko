// Set is an Interface so we have to create a class that implements Set, HashSet in this case

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> values = new HashSet<>();
        values.add(59);
        values.add(167);
        values.add(205);
        values.add(200);
        values.add(205); // no duplicated values permitted like in Lists
        System.out.println(values.add(205)); // returns false

        // print the values, they are printed in any order
        for (int i : values){
            System.out.println(i);
        }

        Set<Integer> values1 = new TreeSet<>();
        values1.add(59);
        values1.add(167);
        values1.add(205);
        values1.add(200);
        values1.add(205); // no duplicated values permitted like in Lists
        System.out.println(values1.add(205)); // returns false

        // print the values, they are printed in order
        System.out.println();
        for (int i : values1){
            System.out.println(i);
        }


    }
}

/*
In Java, a `Set` is an interface that defines a collection of unique elements. It is part of the Java Collections Framework
and is implemented by various classes such as `HashSet`, `LinkedHashSet`, and `TreeSet`.
Here are some key characteristics of a `Set`:

1. Unique Elements: A `Set` does not allow duplicate elements. It ensures that each element in the set is unique
based on the object's `equals()` method. If you try to add a duplicate element to a `Set`, it will not be added.

2. No Defined Order: The elements in a `Set` are not stored in a specific order. There is no guarantee on the
iteration order of the elements. If you need to maintain a specific order, you can use the `LinkedHashSet` class.

3. Efficient Membership Testing: `Set` provides efficient membership testing using the `contains()` method.
It allows you to check whether an element is present in the set in constant time (`O(1)` complexity).

4. Common Operations: `Set` supports common set operations such as adding elements (`add()`), removing elements (`remove()`),
checking if the set is empty (`isEmpty()`), getting the size of the set (`size()`), and more.

Here's an example demonstrating the usage of a `HashSet`:
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        // Adding elements to the set
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // Duplicate element, will not be added

        // Printing the set
        System.out.println(names); // Output: [Alice, Bob, Charlie]

        // Checking if an element is present
        boolean containsBob = names.contains("Bob");
        System.out.println("Contains Bob? " + containsBob); // Output: true

        // Removing an element
        names.remove("Charlie");
        System.out.println(names); // Output: [Alice, Bob]

        // Checking the size of the set
        int size = names.size();
        System.out.println("Size of the set: " + size); // Output: 2

        // Clearing the set
        names.clear();
        System.out.println(names); // Output: []
    }
}

In this example, a `HashSet` is used to create a `Set` called `names`. Elements are added to the set using the `add()` method.
Duplicate elements (like `"Alice"`) are not added. The `contains()` method is used to check if an element is present,
and the `remove()` method is used to remove an element. The `size()` method retrieves the size of the set,
and the `clear()` method removes all elements from the set.

Note that while `HashSet` was used in the example, you can also use other implementations of the `Set` interface,
such as `LinkedHashSet` (maintains insertion order) or `TreeSet` (stores elements in sorted order).
 */