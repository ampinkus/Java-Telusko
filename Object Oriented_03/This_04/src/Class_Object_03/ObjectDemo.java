package Class_Object_03;

class Calculator {
	// define properties
	int num1;
	int num2;
	float num3;
	float num4;

	// I can define more than one constructor -> Constructor overloading
	public Calculator(int num1, int num2) {
		// instance variable  = local variable.  The this keyword tells that the variable of the instance takes the value of the argument
		this.num1 = num1;
		this.num2 = num2;
	}

	public Calculator(float num3, float num4) {
		this.num3 = num3;
		this.num4 = num4;
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
		// define object
		Calculator calculator = new Calculator(4,5);
		System.out.println(calculator.num1);
		System.out.println(calculator.num2);

		Calculator calculator2 = new Calculator(4.5f,5.5f);
		System.out.println(calculator2.num3);
		System.out.println(calculator2.num4);

	}
}
