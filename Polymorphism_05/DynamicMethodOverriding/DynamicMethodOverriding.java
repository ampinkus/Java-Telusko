package DynamicMethodOverriding;


class A {
    public void show(){
        System.out.println("Show in A");
    }
}

class B extends A {
    public void show() {
        System.out.println("Show in B");
    }

    public void config() {
        System.out.println("Config in B");
    }
}

class C extends A {
    public void show() {
        System.out.println("Show in C");
    }
}

public class DynamicMethodOverriding {
    public static void main(String[] args) {
        // as B extends A, I can use as reference A and object of B
        // the objects are of B, linking is done at runtime.  Its called runtime polymorphism.
        A objB = new B();
        // decision of which methods is done at runtime, we will call the method in B
        objB.show();
        // Note:
        // objB.config();  // Cannot resolve method 'config' in 'A' because config is not in A, only in B

        objB = new C();
        //it will call the method in C because now it is an object of C.
        // this is called dynamic method dispatch
        objB.show();

    }
}

/*
In the given code, the concept being demonstrated is dynamic method dispatch or dynamic method overriding.

Dynamic method dispatch refers to the ability of an object to determine at runtime which implementation
of a method to invoke, based on the actual type of the object rather than the declared type of the reference variable.
Let's analyze the code:
1. Class A:
   - Class A defines a method called `show()` which prints "Show in A".

2. Class B:
   - Class B extends class A and overrides the `show()` method.
   - The overridden `show()` method in class B prints "Show in B".

3. DynamicMethodOverriding class:
   - In the `main()` method, an instance of class B is created, but it is assigned to a reference variable of type A: `A objB = new B();`.
   - This is allowed because class B is a subclass of class A, and Java supports polymorphism.
   - The reference variable `objB` of type A points to an object of type B.
   - When the `show()` method is called on `objB`, the actual implementation to be invoked is determined dynamically at runtime.
   - In this case, since `objB` points to an object of type B, the overridden `show()` method in class B is called.
   - As a result, the output will be "Show in B".

This behavior is known as dynamic method dispatch because the decision on which implementation of the method to call is made
dynamically based on the actual object type at runtime.
Dynamic method dispatch is an important feature in object-oriented programming as it enables polymorphism and allows different
objects to respond differently to the same method invocation based on their specific implementations.
 */
