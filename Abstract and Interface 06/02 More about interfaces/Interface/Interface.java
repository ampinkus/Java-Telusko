package Interface;

// define an interface class, all the methods are abstract and don't have a body.
// you can not create an object of class interface
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
        // we create the reference of a Interface and the object of a class
        Writer p = new Pen();
        Writer pc = new Pencil();

        // We can pass to the method doSomething defined in the Kit class an object p and pc because we defined the Write
        // interface and Pen and Pencil classes implements Write
        k.doSomething(p);
        k.doSomething(pc);

    }
}

/*
Writer is an interface and Pen is a class.
What means:  we create the reference of an Interface Writer and the object of a class Pen?
        Writer p = new Pen();

In the given statement, `Writer` is an interface, and `Pen` is a class that implements the `Writer` interface.
The statement `Writer p = new Pen();` creates a reference variable of type `Writer` named `p` and assigns it an object of the `Pen` class.
Here's what it means:

1. Interface Reference: `Writer p` declares a reference variable `p` of type `Writer`. It means that `p` can refer to any object that
implements the `Writer` interface, including objects of the `Pen` class or any other class that implements the `Writer` interface.

2. Object Creation: `new Pen()` creates a new object of the `Pen` class. This object represents an instance of the `Pen` class
and provides the implementation for the methods defined in the `Writer` interface.

3. Assignment: The newly created `Pen` object is assigned to the `p` reference variable of type `Writer`. This assignment is
possible because the `Pen` class implements the `Writer` interface. It allows you to treat the `Pen` object as a `Writer` object,
accessing the methods and behaviors defined in the `Writer` interface through the `p` reference.

The benefit of using the interface reference (`Writer p`) instead of the specific class reference (`Pen p`) is that it allows
for flexibility and polymorphism. By using the interface reference, you can easily switch the implementation by assigning different
objects that implement the `Writer` interface to the same reference variable. This promotes loose coupling and enables you to work
with objects based on their common behavior defined by the interface rather than their specific implementation details.

In this case, by creating the reference of the `Writer` interface and assigning it the object of the `Pen` class, you can access
the methods defined in the `Writer` interface through the `p` reference, even though the object being referred to is of the `Pen` class.
*/


