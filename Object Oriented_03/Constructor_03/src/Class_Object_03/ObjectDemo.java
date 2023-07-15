package Class_Object_03;

class Calculator {
	// define properties
	int num1;
	int num2;
	float num3;
	float num4;


	// I can define more than one constructor -> Constructor overloading
	public Calculator() { // I create a constructor without any variable initialization
		// I define the initial value of the variables
		num1 = 1;
		num2 = 1;
	}

	public Calculator(int n) { // I create another constructor that takes an int value
		// I define the initial value of the variables as n
		num1 = n;
		num2 = n;
	}
	
	public Calculator(float n) { // I create another constructor that takes an int value
		// I define the initial value of the variables as n
		num3 = n;
		num4 = n;
	}

}

public class ObjectDemo {
	public static void main(String[] args) {
		// define object
		Calculator calculator = new Calculator();
		System.out.println(calculator.num1);

		// as I pass a value it uses the second constructor
		Calculator calculator2 = new Calculator(4);
		System.out.println(calculator2.num1);

		Calculator calculator3 = new Calculator(4.4f);
		System.out.println(calculator3.num3);


	}
}
