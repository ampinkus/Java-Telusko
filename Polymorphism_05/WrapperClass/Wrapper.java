package WrapperClass;

public class Wrapper {
    public static void main(String[] args) {
        int i = 0; // Primitive
        Integer j = 5;  // object wrapping
        System.out.println( j.getClass());

        i = j; // object unwrapping
        System.out.println(i);

        String uno = "123";
        i = Integer.parseInt(uno); // we need to convert the string to an int
        System.out.println(i + 1);

    }
}


/*
In Java, a wrapper class is a class that provides an object representation of a primitive type.
It allows primitive types to be used as objects by encapsulating them within instances of the wrapper class.
Each primitive type in Java has a corresponding wrapper class that provides useful methods and functionalities.

Here are the wrapper classes for the primitive types in Java:
Byte: Represents a byte value.
Short: Represents a short value.
Integer: Represents an integer value.
Long: Represents a long value.
Float: Represents a float value.
Double: Represents a double value.
Character: Represents a character value.
Boolean: Represents a boolean value.

Java provides a feature called autoboxing, which automatically converts primitive types to their corresponding wrapper
classes when needed. This allows you to assign a primitive value directly to a wrapper class variable without explicitly
invoking the constructor.
Integer i = 5; // Autoboxing: int to Integer

In this case, the value 5 is automatically boxed into an Integer object, and you can assign it to the variable i directly.
Autoboxing simplifies the code by eliminating the need for explicit constructor calls in many cases.
However, it's important to note that autoboxing has some implications, such as potential performance overhead and the
possibility of NullPointerException if you use autoboxing with null values.
So, to summarize, it is not mandatory to use the new keyword and call the Integer constructor when assigning a
value to an Integer object. You can use autoboxing and assign the primitive value directly to the Integer variable.


Wrapper classes are typically used in scenarios where objects are required, such as when working with
collections, generics, or when using Java libraries that expect objects rather than primitive types.
Wrapper classes provide methods to convert between primitive types and their corresponding wrapper objects.

Frameworks like Hibernate and Collections dont work with primitives.

 */