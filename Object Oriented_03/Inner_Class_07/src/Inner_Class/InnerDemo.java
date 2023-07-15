package Inner_Class ;

// Create an outer class
class Outer{
	// create a variable (a member variable)
	int a;
	// create a method (a member method)
	public void show(){
		System.out.println("Printed in show");
	}

	// We can crete a class inside a class, this is an inner class and also a member class
	class Inner{
		public void display(){
			System.out.println("Printed in display");
		}
	}
}

public class InnerDemo {
	public static void main(String[] args) {
		Outer obj = new Outer();
		//use the show method
		obj.show();

		// create an Inner object referencing an outer object:
		// the class name need to reference the outer class and the constructor (new) need to be a constructor for the object obj
		Outer.Inner obj1 = obj.new Inner();
		obj1.display();

		// we can also to create an Inner class object without invoking the outer object
		Outer.Inner anotherInner = new Outer().new Inner();
		anotherInner.display();

	}
}


/*
In Java, an inner class is a class that is defined within another class. It allows you to logically group classes together and express a close relationship
between them. The class that contains the inner class is known as the outer class.
Inner classes have access to the members (fields and methods) of the outer class, including its private members. This allows for better encapsulation
and can be useful in scenarios where the inner class needs to directly access or manipulate the state of the outer class.

There are four types of inner classes in Java:
1. Member Inner Class: This is the most common type of inner class. It is defined at the member level of the outer class and can access all members of
the outer class. Member inner classes are associated with an instance of the outer class and have access to its instance variables.

2. Static Nested Class: Unlike member inner classes, static nested classes are declared with the static modifier. They are essentially independent
static classes that are nested within the outer class for packaging convenience. Static nested classes can access only static members of the outer class.

3. Local Inner Class: A local inner class is defined within a method or a block of code. It has access to the local variables of the enclosing scope,
but those variables must be effectively final (or final in Java 8+). Local inner classes are typically used when you need to create a class that is closely related to a specific method or block of code.

4. Anonymous Inner Class: An anonymous inner class is a special type of local inner class that doesn't have a name. It is defined and instantiated
simultaneously, usually for overriding a method or implementing an interface.
Anonymous inner classes are useful when you need to provide an implementation for a single-use or small-scale scenario.
*/