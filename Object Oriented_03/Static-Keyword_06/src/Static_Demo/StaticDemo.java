package Static_Demo;

class employee {
	// properties
	static int employeeID;
	int salary;
	// with the keyword static the variable don't belong anymore to the object but to the class
	static String employeeCEO;

	// static block  // will be executed when load the class
	static {
		employeeCEO = "Not known";
	}

	public employee() { // will be executed when we create an object, in our example twice
		employeeID = 0;
		salary = 0;
	}

	// methods
	public void show(){
		System.out.println(employeeID + " : " + salary + " : " + employeeCEO);
	}
}

public class StaticDemo {
	// main is static because we don't need to define an object to call it.
	// to use a variable inside a static method the variable must be static
	static int numberEmployees = 0;
	public static void main(String[] args) {

		// as the employeeCEO is a static variable I assign it as a class variable and not as an object variable
		employee.employeeCEO = "Gervasio";

		employee Fredi = new employee();
		Fredi.employeeID = 8;
		Fredi.salary = 4000;
		Fredi.show();
		++numberEmployees;

		employee Tomas = new employee();
		Tomas.employeeID = 6;
		Tomas.salary = 6000;
		// as I don't specify a new name for the CEO Tomas will have the class CEO who is Gervasio
		Tomas.show();
		++numberEmployees;
	}
}