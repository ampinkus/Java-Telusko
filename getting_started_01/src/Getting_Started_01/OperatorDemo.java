package Getting_Started_01;

public class OperatorDemo {

	public static void main(String[] args) {
		// aritmetic operators
		int m = 10, n = 3;
		int result1 = m + n;
		int result2 = m - n;
		float result3 = (float) m / (float) n;
		int result4 = m * n;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

		result4 += 1;
		System.out.println(result4);
		System.out.println(result4++);
		System.out.println(result4);
		System.out.println(++result1);

	}
}
