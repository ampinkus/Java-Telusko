
public class AccessModifiers {
    public static void main(String[] args) {

    }
}

/*
In Java, an access modifier is a keyword used to control the visibility or accessibility of classes, methods, variables, and constructors within a Java program.
It specifies the level of access that other parts of the program have to a particular component.


1. **Classes**:
   - Public: A class with the `public` access modifier can be accessed from any other class or package.
   - Default (Package-private): If no access modifier is specified, the class has default (or package-private) access. It allows access to the class from
     within the same package but restricts access from classes in different packages.

2. **Methods** and **Variables**:
   - Public: Methods and variables with the `public` access modifier can be accessed from any other class or package.
   - Private: Methods and variables with the `private` access modifier are only accessible within the same class.
   - Protected: Methods and variables with the `protected` access modifier are accessible within the same class, subclasses
     (even if they are in a different package), or classes in the same package. However, access from classes in different packages that are not subclasses is restricted.
   - Default (Package-private): If no access modifier is specified, methods and variables have default (or package-private) access.
     They can be accessed within the same package but are not accessible from classes in different packages.

 */
