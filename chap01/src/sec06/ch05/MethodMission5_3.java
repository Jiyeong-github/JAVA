package sec06.ch05;

public class MethodMission5_3 {

	public static void printStarLine(int a) {
		for (int j = 0; j < a; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int star = 5;
		printStarTri(star);
		// *
		// **
		// ***
		// ****
		// *****
		System.out.println();
		star = 3;
		printStarTri(star);
	}

	public static void printStarTri(int star) {
		for (int a = 0; a < star; a++) {
			printStarLine(a);
		}
		System.out.println();
	}
}
