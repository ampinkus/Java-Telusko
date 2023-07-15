package MultipleInheritance;

public class MultipleInheritance {
    public static void main(String[] args) {
        /*
Java does not support multiple inheritance to avoid certain complexities and ambiguities that can arise from it.
The decision to exclude multiple inheritance in Java was a deliberate design choice made by the language creators.

Here are a few reasons why Java does not support multiple inheritance:
1. Diamond Problem: Multiple inheritance can lead to the diamond problem, which occurs when a class inherits two or more
superclasses that have a common superclass. This can result in ambiguity in method and attribute resolution.
Java avoids this problem by allowing only single inheritance for classes but supporting multiple inheritance through interfaces.

2. Complexity: Multiple inheritance can make the code more complex and harder to understand, especially when conflicts
arise between inherited members. It can lead to naming collisions and difficulties in determining which superclass member to use.

3. Code Conflicts: In a scenario where two superclasses define the same method signature, it would be unclear
which implementation should be used by the subclass. This ambiguity can introduce errors and make
the code more challenging to maintain.

4. Language Simplicity: Java aims to be a simple and straightforward language. By avoiding multiple inheritance,
Java keeps the language design cleaner and reduces the chances of unintended consequences and complexity.

To overcome these challenges, Java introduced the concept of interfaces. Interfaces allow classes to implement multiple interfaces,
enabling a form of multiple inheritance for behavior without introducing the complexities associated with multiple inheritance
of state and implementation. This design choice strikes a balance between code flexibility and maintainability
while avoiding the potential pitfalls of multiple inheritance.
         */
    }
}
