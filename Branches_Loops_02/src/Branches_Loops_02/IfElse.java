package Branches_Loops_02;

public class IfElse {
	public static void main(String[] args) {
		int n = 6;
		if (n % 2 == 0) {
			System.out.println(n % 2);
			System.out.println("Is Even");

		} else {
			System.out.println(n % 2);
			System.out.println("Is Odd");
		}

		// ternary operator
		n = 8;
		System.out.println(n % 2 == 0 ? "Is Even" : "Is Odd");

		// switch
		n = 1;
		switch (n) {
		case 1:
			System.out.println("Is 1");
			break;

		case 2:
			System.out.println("Is 2");
			break;

		case 3:
			System.out.println("Is 3");
			break;

		default:
			System.out.println("Other");
		}
	}

}
