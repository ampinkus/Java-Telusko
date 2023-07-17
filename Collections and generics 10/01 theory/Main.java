public class Main {
    public static void main(String[] args) {

    }
}

/*
Collection:
In Java, a Collection is an interface that represents a group of objects known as elements. It provides a way to organize and manipulate collections of
objects in a unified manner. The Collection interface is part of the Java Collections Framework, which provides a set of classes and interfaces
for working with collections efficiently.

The Collection interface defines several common methods for working with collections, such as adding and removing elements, checking if an element exists,
iterating over the elements, and determining the size of the collection. Some of the key methods defined by the Collection interface include:
- `add(E element)`: Adds an element to the collection.
- `remove(Object element)`: Removes a specific element from the collection.
- `contains(Object element)`: Checks if the collection contains a specific element.
- `size()`: Returns the number of elements in the collection.
- `iterator()`: Returns an iterator for iterating over the elements in the collection.

The Collection interface is extended by two main subinterfaces: List and Set. The List interface represents an ordered collection where duplicate
elements are allowed, and elements can be accessed by their index. The Set interface represents a collection that does not allow duplicate elements.

There are several concrete classes in the Java Collections Framework that implement the Collection interface, such as ArrayList, LinkedList, HashSet,
and TreeSet. These classes provide different implementations and performance characteristics depending on the specific needs of your application.

By using the Collection interface and its implementations, you can easily manipulate groups of objects, perform common operations on them,
and choose the appropriate data structure based on your requirements.

List:
In Java, a List is an interface that extends the Collection interface and represents an ordered collection of elements.
Unlike sets, lists typically allow duplicate elements, and they maintain the insertion order of elements.
The List interface provides additional methods to work with elements at specific positions within the list.

Here are some key characteristics and methods provided by the List interface:
1. Ordered Collection: Lists maintain the order in which elements are added, allowing elements to be accessed by their index.
The first element has an index of 0, the second has an index of 1, and so on.

2. Duplicates: Lists can contain duplicate elements. You can add the same element multiple times, and it will be stored as separate occurrences.

3. Index-based Access: Lists provide methods to access elements based on their index, such as `get(int index)` to retrieve an element
at a specific position and `set(int index, E element)` to replace an element at a given index.

4. Positional Operations: Lists support various operations that manipulate elements at specific positions, such as `add(int index, E element)`
to insert an element at a particular index, `remove(int index)` to remove the element at a specific index, and `indexOf(Object element)`
or `lastIndexOf(Object element)` to find the index of the first or last occurrence of an element, respectively.

Some commonly used implementations of the List interface in Java include:
- ArrayList: An implementation of a dynamically resizable array. It provides fast random access but may be slower when inserting or removing elements
in the middle of the list.

- LinkedList: An implementation based on a doubly linked list. It provides efficient insertion and removal of elements but slower random
access compared to ArrayList.

- Vector: A legacy implementation similar to ArrayList but with synchronized methods, making it thread-safe.
It is less commonly used in modern Java development.

It's important to note that the List interface is just an interface, and you typically use one of its concrete implementations
to work with lists in your Java programs. The choice of implementation depends on factors such as the expected size of the list,
the frequency of insertions and removals, and the need for thread-safety.


Set:
In Java, a Set is an interface that extends the Collection interface and represents a collection of unique elements.
Unlike lists, sets do not maintain the insertion order of elements, and they do not allow duplicate elements.
The Set interface defines the behavior of a mathematical set, where each element in the set is unique.

Here are some key characteristics and methods provided by the Set interface:
1. Unique Elements: Sets do not allow duplicate elements. If an attempt is made to add an element that already exists in the set, it will be ignored,
and the set will remain unchanged.

2. No Order: Sets do not guarantee any specific order of elements. The iteration order of elements may vary based on the specific implementation
of the Set interface.

3. Membership Testing: Sets provide methods such as `contains(Object element)` to check if an element is present in the set.

4. Set Operations: The Set interface includes methods to perform common set operations such as union, intersection, and difference.
These methods are inherited from the Collection interface.

Some commonly used implementations of the Set interface in Java include:
- HashSet: This implementation stores elements in a hash table, providing constant-time performance for the basic operations (add, remove, contains)
on average. However, it does not guarantee a specific order of elements during iteration.

- TreeSet: This implementation stores elements in a balanced tree structure, such as a Red-Black Tree. It provides a sorted order of elements
during iteration, but the performance of the basic operations is O(log n).

- LinkedHashSet: This implementation maintains a doubly linked list in addition to a hash table, preserving the insertion order of elements
during iteration. It offers slightly slower performance compared to HashSet but provides predictable iteration order.

It's important to note that the Set interface is just an interface, and you typically use one of its concrete implementations
to work with sets in your Java programs. The choice of implementation depends on factors such as the need for uniqueness, the requirement for a specific order, and the expected performance characteristics.


Map:
In Java, a Map is an interface that represents a collection of key-value pairs, where each key is unique.
The Map interface provides methods for manipulating and accessing the elements based on their keys.
It allows you to store, retrieve, and manipulate data in a key-value format.

Here are some key characteristics and methods provided by the Map interface:
1. Key-Value Pairs: Each element in a Map is a key-value pair. The key is used to uniquely identify the value associated with it.

2. Unique Keys: Keys in a Map are unique. If you attempt to add a key that already exists in the Map, the new value will replace
the existing value associated with that key.

3. No Order: The Map interface does not guarantee any specific order of the key-value pairs. The iteration order of the entries
may vary based on the specific implementation of the Map interface.

4. Retrieval by Key: You can access the value associated with a specific key using the `get(Object key)` method.
This allows efficient retrieval of values based on their corresponding keys.

5. Key Set: The Map interface provides methods to retrieve the set of keys (`keySet()`) or the collection of values (`values()`) in the Map.
You can also obtain a set of key-value pairs (`entrySet()`) as a collection of `Map.Entry` objects.

Some commonly used implementations of the Map interface in Java include:
- HashMap: This implementation stores the key-value pairs in a hash table, providing constant-time performance for the basic
operations (put, get, remove) on average. The order of the entries is not guaranteed during iteration.

- TreeMap: This implementation stores the key-value pairs in a sorted tree structure, such as a Red-Black Tree.
It maintains the entries in sorted order based on the natural ordering of the keys or a custom Comparator.
The performance of the basic operations is O(log n).

- LinkedHashMap: This implementation combines a hash table with a doubly linked list, preserving the insertion order of the
entries during iteration. It offers slightly slower performance compared to HashMap but provides predictable iteration order.

It's important to note that the Map interface is just an interface, and you typically use one of its concrete implementations
to work with maps in your Java programs. The choice of implementation depends on factors such as the need for uniqueness, the requirement
for a specific order, and the expected performance characteristics.

*/