
// a functional interface cam have only one method, we can use the annotation @FunctionalInterface
@FunctionalInterface
interface Abc {
    void show();
}

interface MyFunction {
    // I want to define  lambdas for operations, I define int arguments
    int calculate(int a, int b);
}


public class Funcional_Interface_Lambda_Expression {
    public static void main(String[] args) {
        // I can define as many Lambda expressions I need using the Abc Interface
        // using the Abc interface I define Abc objects and the lambdas, no arguments in this case
        Abc obj1 = () -> System.out.println("This is a Lambda expression");
        Abc obj2 = () -> System.out.println("This is a another Lambda expression");
        obj1.show();
        obj2.show();

        // using the MyFunction interface I define MyFunction objects and the lambdas
        MyFunction addition = (a, b) -> a + b;
        MyFunction product = (a, b) -> a * b;

        int result = addition.calculate(5, 3);
        System.out.println(result); // Output: 8

        result = product.calculate(3,6);
        System.out.println(result); // Output: 18

        }
    }

/*
In Java, a lambda expression is a concise way to represent an anonymous function—a function that doesn't have a name and
can be passed as a parameter or assigned to a variable. Lambda expressions were introduced in Java 8 as part of the
functional programming enhancements.
Here are some key points about lambda expressions:

1. Syntax: The syntax of a lambda expression consists of three parts: parameter list, arrow token (`->`), and a body.
The body can be a single expression or a block of code.

2. Functional Interfaces: Lambda expressions are primarily used in conjunction with functional interfaces,
which are interfaces with a single abstract method. Lambda expressions provide a compact way to implement the abstract
method of a functional interface.

3. Type Inference: Java uses type inference to determine the types of parameters in a lambda expression.
In many cases, you don't need to specify the types explicitly, as they can be inferred from the context or the target type (the functional interface).

4. Simplified Syntax: Lambda expressions eliminate the need for explicit anonymous class declarations and
reduce the boilerplate code required for small functional implementations.

Here's a simple example of a lambda expression:
interface MyFunction {
    int calculate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        MyFunction addition = (a, b) -> a + b;
        int result = addition.calculate(5, 3);
        System.out.println(result); // Output: 8
    }
}

In this example, the `MyFunction` interface represents a functional interface with a single abstract method
called `calculate()`. The lambda expression `(a, b) -> a + b` implements the `calculate()` method by performing addition
on the two parameters. The lambda expression is assigned to a variable of type `MyFunction` named `addition`.

The lambda expression `addition` can be invoked like a regular method call, passing arguments to the parameters `a` and `b`.
In this case, it returns the sum of the two numbers, which is then printed to the console.

Lambda expressions enable the use of functional programming idioms in Java, making it more expressive and concise.
They are widely used in functional interfaces, streams, and various APIs that leverage functional programming paradigms.
 */
