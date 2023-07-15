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
        super(i);
        System.out.println("in B int i");
    }
}

public class Super {
    public static void main(String[] args) {
        //A objA = new A();  // it initialize both default constructors
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