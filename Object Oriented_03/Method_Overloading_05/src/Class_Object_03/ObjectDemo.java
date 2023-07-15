package Class_Object_03;

class Calculator {

	public Calculator() {
	}

	public void add (int i, int j) {
		System.out.println(i+j);
	}
	// method overloading, same name but different parameters
	public void add (int i, int j,int k) {
		System.out.println(i+j+k);
	}
	public void add (double i, double j) {
		System.out.println(i+j);
	}
}


public class ObjectDemo {
	public static void main(String[] args) {
		// define object
		Calculator casio = new Calculator();
		// call the add method
		casio.add(2,6);
		casio.add(1,2,3);
		casio.add(2.4,6.6);
	}
}
