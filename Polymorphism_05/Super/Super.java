package Super;
// we create 2 clases
class A{
    // constructor
    // when I create an instance of the class the constructor is called and the string is printed
    public A() {
        System.out.println("in A");
    }
    public A( int i) {
        System.out.println("in A int i");
    }
}

class B extends A {
    // when I create an instance of the class B the constructor is called and as B extends A
    // both constructors of A and are called
    public B() {
        super(); // even if we don't write it, the compiler call the super class, A in this case.
        System.out.println("in B");
    }

    public B (int i) {
        // if I add a parameter it will call the A class with an int parameter
        // if we need to invoke the Super class it needs to be at the top of the code
        //super(i);
        System.out.println("in B int i");
    }
}

public class Super {
    public static void main(String[] args) {
        // A objA = new A();  // it initialize both default constructors
        B objB = new B(5); // it initializes the B constructor with a parameter int and the default A constructor
    }
}

/*
When the main method in the Super class is executed, an instance of class A is created with the line A objA = new A();.
This line invokes the constructor of class A, which is defined as public A() { System.out.println("in A"); }.
As a result, when the object objA is created, the constructor of class A is called, and it prints "in A" to the console.

In the given code, the strings "in A" and "in B" are printed because class B extends class A, and when an instance of
class B is created, both the constructor of class A and class B are invoked.
Let's break down the code and understand the execution:

1. Class A:
   - Class A has a constructor defined as `public A() { System.out.println("in A"); }`.
   - This constructor prints the string "in A" when an instance of class A is created.

2. Class B:
   - Class B extends class A using the `extends` keyword. This means that class B inherits the properties and methods of class A.
   - Class B also has its own constructor defined as `public B() { System.out.println("in B"); }`.
   - This constructor prints the string "in B" when an instance of class B is created.

3. Super class:
   - The `main` method is defined in the `Super` class.
   - In the `main` method, an instance of class B is created using the line `B objB = new B();`.
   - This line invokes the constructor of class B, which in turn invokes the constructor of class A (since class B extends class A).
   - Therefore, both constructors are executed, resulting in the output "in A" followed by "in B".

If you were to run this code, the output would be:
in A
in B

This demonstrates the concept of inheritance in Java, where a subclass can inherit the properties and methods of its superclass.
In this case, when an instance of class B is created, both the constructor of class A and class B are executed.
*/


/*
Polymorphism is a fundamental concept in object-oriented programming that allows objects of different classes to be treated as objects of a
common superclass or interface. It provides a way to perform a single action in different ways based on the specific type of an object.
There are two main types of polymorphism in Java:
1. **Compile-time Polymorphism (Method Overloading)**: Compile-time polymorphism is achieved through method overloading.
It allows multiple methods with the same name but different parameters to exist within the same class. The appropriate method
is selected at compile-time based on the number, types, and order of arguments passed to the method.
Here's an example of method overloading:

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
In this example, the `add()` method is overloaded with two versions: one that takes two integers and one that takes two doubles.
The appropriate method is selected based on the argument types provided during compilation.

2. **Run-time Polymorphism (Method Overriding)**: Run-time polymorphism is achieved through method overriding. It occurs when a subclass
provides its own implementation of a method defined in its superclass. The method in the subclass must have the same name, return type,
and parameter list as the method in the superclass.
Here's an example of method overriding:

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

In this example, the `makeSound()` method is overridden in the `Cat` class with a different implementation than the one in the `Animal` class.
When calling the `makeSound()` method on a `Cat` object, the overridden method in the `Cat` class is invoked, demonstrating run-time polymorphism.

Polymorphism allows for code reusability, flexibility, and extensibility in object-oriented systems.
It promotes loose coupling and enables objects to be manipulated at a higher level of abstraction, treating them based on their common behavior
rather than their specific type.
*/