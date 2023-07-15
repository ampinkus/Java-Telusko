package Branches_Loops_02;

public class Continue {
	public static void main(String[] args) {
		for (int j = 0; j < 11; j++) {
			if (j % 2 == 1)
				continue;

			System.out.println(j);
		}
	}
}
