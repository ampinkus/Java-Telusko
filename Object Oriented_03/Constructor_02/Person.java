/*
In the example, the Person class has two constructors. The first constructor takes two parameters (name and age)
and assigns them to the corresponding instance variables. The second constructor is a default constructor that calls the
constructor with parameters using the this() keyword and provides default values for the name and age variables.
The main method demonstrates how to create objects using both constructors and retrieve their values using getter methods.
 */

public class Person {
    private String name;
    private int age;

    // Constructor with parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default constructor (no parameters)
    public Person() {
        this("Unknown", 0); // Calls the constructor with parameters
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person john = new Person("John", 25); // Creating an object using the constructor with parameters
        System.out.println(john.getName() + " is " + john.getAge() + " years old.");

        Person unknown = new Person(); // Creating an object using the default constructor
        System.out.println("Name: " + unknown.getName());
        System.out.println("Age: " + unknown.getAge());
    }
}


/*
In Java, a constructor is a special method that is used to initialize objects of a class.
It is called automatically when an object is created using the new keyword. Constructors have the following characteristics:
1. The name of the constructor must be the same as the name of the class.
2. Constructors do not have a return type, not even void.
3. Constructors can be overloaded, meaning a class can have multiple constructors with different parameter lists.
4. Constructors can have access modifiers like public, private, or protected to control their visibility.
5. Constructors can also call other constructors using the this() keyword to reuse code.

In Java, constructors, like other class members, can have access modifiers to control their visibility and accessibility from other classes.
Here's an explanation of the different access modifiers that can be applied to constructors:
Public: A public constructor can be accessed from anywhere, including other classes in different packages.
It allows unrestricted access to create objects of the class.

Private: A private constructor can only be accessed from within the same class. It is commonly used to prevent direct instantiation
of the class and enforce a specific way of creating objects, such as using static factory methods or singleton patterns.

Protected: A protected constructor can be accessed from within the same class, its subclasses, and other classes in the same package.
It restricts access to the constructor outside the package, providing a level of encapsulation and control over object creation.

Default (Package-private): If no access modifier is specified for a constructor, it becomes package-private.
It allows access within the same package but restricts access from outside the package.

The choice of access modifier for a constructor depends on the desired level of encapsulation and the intended usage of the class.
For example, if you want to allow anyone to create objects of your class, you can use a public constructor.
On the other hand, if you want to restrict object creation to a specific method or class, you can use a private constructor.

*/