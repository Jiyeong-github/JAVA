package sec06.ch03;

public class ForMission5 {

	public static void main(String[] args) {
		// 2~9단 출력
		// 한 단 끝나면 빈칸 만들어주기!

		for (int j = 2; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d*%d=%d\n", j, i, (j * i));
			}
			System.out.println(" ");
		}

	}
}
