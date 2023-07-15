package Class_Object_03;

class Calculator {
	// define properties
	int num1;
	int num2;
	int result;

	// define methods
	public void perform() {
		result = num1 + num2;
	}

}

public class ObjectDemo {
	public static void main(String[] args) {
		// define object
		Calculator calculator = new Calculator();

		// input to values to the object
		calculator.num1 = 3;
		calculator.num2 = 5;
		// calculate result
		calculator.perform();
		System.out.println(calculator.result);
	}
}
