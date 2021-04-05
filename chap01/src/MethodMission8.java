
public class MethodMission8 {

	public static void main(String[] args) {
		gugudan(8);
		// 8*1=8
		// 8*2=16;
		// ...8*9=72;
		gugudan(4, 8);
	}

	public static void gugudan(int a) {

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d*%d=%d\n", a, i, (a * i));
		}	
		System.out.println("-------------");
	}

	public static void gugudan(int a, int b) {

		for (int j = a; j <= b; j++) {
			gugudan(j);
		}
		System.out.println();
	}
}
