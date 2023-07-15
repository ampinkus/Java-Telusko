package Abstract;
// I crete a class that will not vahe any instance but serve as a blueprint for other classes
// like Men and Women that extends Human
abstract class Human{
    public abstract void eat();  // I am not implementing the method, needs to be implemented in the extended classes
    public void walk(){
    }
}

class Man extends Human{
    @Override
    public void eat() {

    }
}

public class Abstract {
    public static void main(String[] args) {
        Human obj = new Man(); // I can crete an object of reference Human of class Man

    }
}


/*
In Java, an abstract class is a class that cannot be instantiated directly but serves as a blueprint for its subclasses.
It is declared using the `abstract` keyword. An abstract class can have both abstract and non-abstract (concrete) methods,
as well as member variables.

Here are some key points about abstract classes:
1. Abstract Method: An abstract class can contain abstract methods, which are declared without an implementation.
These methods are meant to be overridden by the subclasses. The subclasses must provide the implementation for all
the abstract methods inherited from the abstract class.

2. Concrete Method: An abstract class can also have non-abstract methods, which have a complete implementation.
Subclasses may choose to override these methods, but it's not mandatory.

3. Incomplete Class: Abstract classes cannot be instantiated directly, meaning you cannot create objects of abstract classes
using the `new` keyword. However, you can create references of an abstract class type, which can be used to refer
to objects of its concrete subclasses.

4. Inheritance: Abstract classes are used as base classes or superclasses, providing a common interface and behavior
that subclasses can inherit and extend. A subclass that extends an abstract class must either provide the implementation
for all the abstract methods or be declared as abstract itself.

5. Partial Implementation: Abstract classes can have instance variables, constructors, and even provide partial implementation
for certain methods. This allows abstract classes to define common behavior and characteristics for its subclasses.

Summary: Abstract classes provide a way to define common behavior and enforce certain contracts among subclasses while allowing
flexibility in implementation. They are often used in scenarios where you want to create a base class with some common
functionality but leave specific implementation details to the subclasses.

 */