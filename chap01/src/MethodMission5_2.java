
public class MethodMission5_2 {

	public static void printStarLine(int a) {
		for (int j = 0; j < a; j++) {
			for (int i = 0; i < a; i++) {// star는 a니까^__^
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int star = 5;
		printStarSquare(star);
		// *****
		// *****
		// *****
		// *****
		// *****

		star = 3;
		printStarSquare(star);
	}

	public static void printStarSquare(int a) {
//		for (int i = 0; i < a; i++) {
			printStarLine(a);
			System.out.println();
		}
	}

