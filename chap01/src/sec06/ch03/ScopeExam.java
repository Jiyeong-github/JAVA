package sec06.ch03;

public class ScopeExam {

	public static void main(String[] args) {
		// 스코프(변수&상수가 살아있는 범위)

		int a = 10;

		if (a > 9) {
			System.out.println("a:" + a);

			int j = 0;
			System.out.println("j(1):" + j);
		}
		System.out.println("j(2):" + j);

		for (int j = 0; j < 10; j++) {
		}
		for (int j = 0; j < 22; j++) {
		}
		if (true) {
			int j = 10;
		}
	}
}
