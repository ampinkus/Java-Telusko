import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsWithLists {
    public static void main(String[] args) {
        // ArrayList is a class that implements List, List are objects so I can mix numbers, letters, strings...
        //  uses index numbers and allows me to decide where I put a value based on the index
        // we can specify what type is the list of:
        List<Integer> values = new ArrayList<>(); // take care of the <> on both sides
        values.add(1);
        values.add(3);
        values.add(4);
        // we can add an element with his index.
        values.add(2,2);
        // now this gives an error, we defined the list as an Integer
        // values.add("5");

        // Iterate over the list and print each element, see that value needs to be defined as an Object
        for (Object value : values) {
            System.out.println(value);
        }
    }
}

/*
In Java, generics provide a way to create parameterized types, allowing you to design classes and methods that can operate on a
variety of types while providing type safety at compile-time. Generics enable you to parameterize classes, interfaces,
and methods with one or more type parameters.

Here are some key points about generics in Java:
1. Type Safety: Generics ensure type safety by allowing you to specify the type of data that a class or method will work with.
It helps catch type errors at compile-time rather than at runtime.

2. Reusability: Generics promote code reusability by enabling the creation of generic classes, interfaces, and methods
that can be used with different types without duplicating code.

3. Type Parameters: Type parameters are specified using angle brackets (`<>`) and are typically represented
by single uppercase letters (e.g., `T`, `E`, `K`, etc.). Type parameters can be used as placeholders for actual types
when using generic classes, interfaces, or methods.

4. Parameterized Types: A parameterized type is an instantiation of a generic class or interface with specific
types provided for the type parameters. For example, `List<String>` is a parameterized type where `String` is the actual type argument.

5. Wildcards: Wildcards (`?`) can be used in generics to represent an unknown type. This allows for more flexibility
when working with unknown or heterogeneous types. Wildcards can be upper-bounded (`? extends Type`) or lower-bounded (`? super Type`).

6. Generic Methods: Generic methods are methods that can accept generic types as arguments or have generic return types.
They can be defined within generic classes or as standalone methods.

Here's a simple example of using generics in Java:
public class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.setItem(42);
        int value = box1.getItem();
        System.out.println(value); // Output: 42

        Box<String> box2 = new Box<>();
        box2.setItem("Hello");
        String text = box2.getItem();
        System.out.println(text); // Output: Hello
    }
}

In this example, the `Box` class is a generic class that can hold an item of any type. The type parameter `T` represents
the placeholder for the actual type. In the `main` method, two instances of the `Box` class are created—one with the
type `Integer` and another with the type `String`. The `setItem` and `getItem` methods are called with specific types,
ensuring type safety.

Generics are widely used in collections (`List`, `Set`, `Map`, etc.), allowing the creation of type-safe collections that
can store elements of a specific type. They also provide flexibility and code reuse by enabling the creation of
generic algorithms and data structures.
 */