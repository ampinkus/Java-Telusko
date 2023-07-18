import java.util.*;

public class MapInterface {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>(); // we specify the type of data
        map.put("My name", "Fredi");
        map.put("My surname", "Pinkus");
        map.put("My profession", "Fool");

        System.out.println(map); // not printed in sequence

        // to print a value based on the key
        System.out.println(map.get("My name"));

        // Sort the map entries by value
        List<Map.Entry<String, String>> sortedEntries = new ArrayList<>(map.entrySet());
        Collections.sort(sortedEntries, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> entry1, Map.Entry<String, String> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        // Print the sorted entries
        for (Map.Entry<String, String> entry : sortedEntries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
/*
In this modified code, the HashMap is created and populated with key-value pairs. To sort the map entries by value,
a new ArrayList called sortedEntries is created and initialized with the entries from the map using map.entrySet().

Next, the Collections.sort() method is used to sort the sortedEntries list based on the values of the map entries.
A custom Comparator is provided to specify the comparison logic, which compares the values of each entry
using entry1.getValue().compareTo(entry2.getValue()).

Finally, a loop is used to iterate over the sorted entries and print each key-value pair.
 */


/*
In Java, a `Map` is an interface that represents a collection of key-value pairs. It is part of the Java Collections
Framework and is implemented by classes such as `HashMap`, `LinkedHashMap`, and `TreeMap`.

Here are some key characteristics of a `Map`:
1. Key-Value Pairs: A `Map` stores elements as key-value pairs, where each key is unique within the map.
The key is used to retrieve the associated value. Each key-value pair is treated as a single entity.

2. Unique Keys: Just like elements in a `Set`, keys in a `Map` must be unique. If you try to add a duplicate key,
it will replace the existing entry with the new value.

3. Fast Retrieval: `Map` provides fast retrieval of values based on their associated keys. By providing a key,
you can quickly get the corresponding value using the `get()` method.

4. No Defined Order: The order of elements in a `Map` is not fixed and may not be preserved during iteration.
If you need a specific order, you can use classes like `LinkedHashMap`, which maintains the insertion order, or `TreeMap`,
which sorts the elements based on their keys.

5. Common Operations: `Map` supports common operations such as adding key-value pairs (`put()`),
retrieving values by key (`get()`), checking if a key exists (`containsKey()`), removing key-value pairs (`remove()`), and more.

Here's an example demonstrating the usage of a `HashMap`:
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();

        // Adding key-value pairs to the map
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 35);

        // Retrieving values by key
        int aliceAge = ageMap.get("Alice");
        System.out.println("Alice's age: " + aliceAge); // Output: Alice's age: 25

        // Checking if a key exists
        boolean containsBob = ageMap.containsKey("Bob");
        System.out.println("Contains Bob? " + containsBob); // Output: Contains Bob? true

        // Updating a value
        ageMap.put("Bob", 31);
        System.out.println("Bob's updated age: " + ageMap.get("Bob")); // Output: Bob's updated age: 31

        // Removing a key-value pair
        ageMap.remove("Charlie");
        System.out.println("Size of the map: " + ageMap.size()); // Output: Size of the map: 2

        // Iterating over the map
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();
            System.out.println(name + " is " + age + " years old");
        }
    }
}

In this example, a `HashMap` is used to create a `Map` called `ageMap`. Key-value pairs are added to the map using
the `put()` method. The `get()` method is used to retrieve the value associated with a given key. The `containsKey()`
method checks if a key exists in the map. The `put()` method can also be used to update the value associated with a key.
The `remove()` method removes a key-value pair from the map. The `size()` method retrieves the size of the map.

The example also demonstrates how to iterate over the map using a `for` loop and the `entrySet()` method, which
returns a set of key-value pairs as `Map.Entry` objects.

Note that while `HashMap` was used in the example, you can also use other implementations of the `Map` interface,
such as `LinkedHashMap` (maintains insertion order) or `TreeMap` (stores elements sorted by keys).
 */
