package sec06.ch03;

public class ForMission7 {

	public static void main(String[] args) {
		int star = (int) (Math.random() * 5 + 3);// 3~7 랜덤값
		// star=3
		// *
		// **
		// ***

		for (int i = 0; i < star; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
