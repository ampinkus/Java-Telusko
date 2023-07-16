package Interface;

// define an interface class, all the methods are abstract and don't have a body.
interface  Writer {
    void write();
}
// the classes Pen and Pencil as they implement the interface we need to define the method of the Interface class Writer.
// A class can implement multiple interfaces but ONLY one class!
class Pen implements Writer {
    public void write(){
        System.out.println("I am a pen");
    }
}
class Pencil implements Writer{
    public void write(){
        System.out.println("I am a pencil");
    }
}

// in this class Kit we implement a method that takes as arguments the Interface class
class Kit {
    public void doSomething(Writer p){
        p.write();
    }
}

public class Interface {
    public static void main(String[] args) {
        Kit k = new Kit();
        Pen p = new Pen();
        Pencil pc = new Pencil();

        // We can pass to the method doSomething defined in the Kit class an object p and pc because we defined the Write
        // interface and Pen and Pencil classes implements Write

        k.doSomething(p);
        k.doSomething(pc);

    }
}

/*
In Java, an interface is a reference type that defines a collection of abstract methods and constants.
It serves as a contract that specifies a set of methods that a class implementing the interface must implement.
An interface can be seen as a blueprint for a class, defining the behavior it should exhibit.

Here are some key points about interfaces in Java:
1. Declaration: An interface is declared using the `interface` keyword. It consists of method signatures (without implementation)
and constants. By default, all methods in an interface are implicitly public and abstract.

2. Method Signatures: In an interface, methods are declared without any implementation details.
They only specify the method name, parameters (if any), return type, and possibly thrown exceptions.
Classes that implement the interface must provide the actual implementation for these methods.

3. Multiple Inheritance: One of the key benefits of interfaces in Java is that a class can implement multiple interfaces.
This allows a class to inherit and provide implementations for the methods of multiple interfaces,
enabling a form of multiple inheritance for behavior.

4. Implementation: To implement an interface, a class must use the `implements` keyword followed by the interface name(s)
it is implementing. The class must provide the implementation for all the methods defined in the interface(s).

5. Default Methods: Starting from Java 8, interfaces can also have default methods. A default method is a method with a default
implementation in the interface itself. It provides a way to add new methods to existing interfaces without breaking
the implementations of classes that implement those interfaces.

6. Constant Variables: Interfaces can define constants, which are implicitly public, static, and final.
These constants can be accessed using the interface name followed by the constant name.

Here's an example of an interface declaration:
interface Shape {
    void draw(); // Abstract method

    double calculateArea(); // Abstract method

    default void displayInfo() {
        System.out.println("This is a shape.");
    }

    int MAX_SIDES = 4; // Constant variable
}

In this example, the `Shape` interface declares two abstract methods: `draw()` and `calculateArea()`. It also includes a default
method `displayInfo()` with an implementation. Additionally, the interface defines a constant variable `MAX_SIDES`.
A class implementing this interface would need to provide the implementation for the `draw()` and `calculateArea()`
methods and can choose to override the default method `displayInfo()`.

Interfaces provide a way to achieve abstraction, encapsulation, and loose coupling in Java programs.
They enable the definition of common behaviors that can be shared across different classes, promoting code reusability
and flexibility in object-oriented systems.

*/


