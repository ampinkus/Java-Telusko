class A {
    public void show(){
        System.out.println("In class A");
    }
}

// I can use an interface for a anonymous class
interface Abc {
    void showInt();
}

public class AnonimousIinnerClass {
    public static void main(String[] args) {
        // instead of using the method of class A I want to do something different
        // adding the {} after A()
        A obj = new A() { // start of the anonymous class
            public void show() {
                System.out.println("In the anonymous class");
            }
            // end of the anonymous class.  It is not possible to call an anonymous class. Implemented before the ;
        };
        obj.show();

        Abc obj1 = new Abc() {
            @Override
            public void showInt() { // start of the anonymous class
                System.out.println("In the Interface Anonymous Class");
            }
        };
        obj1.showInt();
    }
}


/*
In Java, an anonymous class is a class that is defined and instantiated at the same time without giving it a name.
It allows you to create a one-time use class without explicitly defining a separate class definition.
Here are some key points about anonymous classes:
1. Definition: An anonymous class is declared and instantiated inline using the `new` keyword followed by a class
or interface declaration.

2. No Name: Unlike regular classes, anonymous classes do not have a name. They are defined at the point of use without
a separate class declaration.

3. Subclassing or Implementing Interfaces: Anonymous classes are often used to subclass an existing class or to implement an interface.
This allows you to override methods or provide implementations inline without creating a separate class.

4. Single Use: Anonymous classes are typically used for one-time use cases, where you need a class for a specific
purpose and do not require reusability.

5. Limited Scope: The scope of an anonymous class is limited to the block in which it is defined.
It cannot be referenced or accessed outside that block.

Here's an example to illustrate the usage of an anonymous class:
interface Greeting {
    void greet();
}

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, anonymous class!");
            }
        };

        greeting.greet();
    }
}

In this example, an anonymous class is created by implementing the `Greeting` interface and overriding the `greet()` method.
The anonymous class is defined and instantiated inline within the `main()` method using the `new` keyword.
The anonymous class provides the implementation for the `greet()` method, which simply prints "Hello, anonymous class!" when invoked.
Anonymous classes are often used for event handling, callbacks, and defining small-scale implementations on the fly
without the need for a separate class definition. They provide a convenient way to create and use classes without the need for a named class declaration.
 */
