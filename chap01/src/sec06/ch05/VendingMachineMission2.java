package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission2 {

	public static void main(String[] args) {
		/*
		 * <메뉴> 0.종료 1.콜라(1000원) 2.사이다(1200원) 3.환타(1300원) 선택>1 콜라를 선택하셨습니다.
		 * 
		 * 선택>4 잘못 선택하셨습니다.
		 * 
		 * 선택>0 종료- 사용한 금액은 :2,300원
		 */

		String[] menuNumArr = { "콜라", "사이다", "환타" };
		int[] menuPriceArr = { 1000, 1200, 1300 };
		int sum = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("\n<메뉴>");
			for (int i = 0; i < menuNumArr.length; i++) {
				System.out.printf("%d.%s(%,d원)\n", (i + 1), menuNumArr[i], menuPriceArr[i]);
			}

			while (true) {
				System.out.print("선택>");
				int choice = scan.nextInt();

				if (choice == 0) {
					break;
				} else if (choice < 0 || choice > menuNumArr.length) {
					System.out.println("잘못 선택하셨습니다.");
					continue;
				} 
				int selectedIdx=choice-1;
				System.out.printf("%s를 선택하셨습니다.\n", menuNumArr[selectedIdx]);
				sum += menuPriceArr[selectedIdx];
			}
			System.out.printf("종료 - 합계 : %,d원",sum);
		}

	}
}