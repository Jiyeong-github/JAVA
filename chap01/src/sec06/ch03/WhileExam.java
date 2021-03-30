package sec06.ch03;

public class WhileExam {

	public static void main(String[] args) {
		// while문은 조건식이 true인 동안 반복
		for (int j = 0; j < 5; j++) {
			System.out.println("j:" + j);
		}
		System.out.println();

		int j = 0;
		while (j < 5) {
			System.out.println("j:" + j);
			j++;
		}
	}
}
