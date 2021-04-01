package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission {

	public static void main(String[] args) {
		/*
		 * 아래는 콘솔이 출력해야 하는 내용 <메뉴> 1. 콜라(1000원) 2. 사이다(1,200원) 3. 환타(1,300원)
		 */
		// intArr 안 쓰면 if else를 많이 써야 함

		Scanner scan = new Scanner(System.in);

		String[] menuNumArr = { "콜라", "사이다", "환타", "스프라이트", "레몬에이드" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000 };

		while (true) {
			System.out.println("\n<메뉴>");
			for (int i = 0; i < menuNumArr.length; i++) {
				System.out.printf("%d.%s(%,d원)\n", (i + 1), menuNumArr[i], menuPriceArr[i]);
			}
			System.out.print("선택>");
			int choice = scan.nextInt();

			if (choice == 0) {
				break;
			} else if (choice >= 1 && choice <= menuNumArr.length) {
				System.out.printf("%s를 선택하셨습니다.\n", menuNumArr[choice - 1]);
			} else {
				System.out.println("잘못 선택하셨습니다.");
			}
			System.out.println("종료!");
//			scan.close();
		}
//		while (true) {
//			System.out.println("\n<메뉴>");
//			for (int i = 0; i < menuNumArr.length; i++) {
//				System.out.printf("%d.%s(%,d원)\n", (i + 1), menuNumArr[i], menuPriceArr[i]);
//			}
//			System.out.print("선택>");
//			int choice = scan.nextInt();
//
//			if (choice == 0) {
//				break;
//			} else if (choice >= 1 && choice <= menuNumArr.length) {
//				System.out.printf("%s를 잘못 선택하셨습니다.", menuNumArr[choice - 1]);
//			} else {
//				System.out.println("잘못 선택하셨습니다.");
//			}
//		}
//		System.out.println("종료!");
//		scan.close();

//		for (int i = 0; i < menuNumArr.length; i++) {
		// 0,1,2가 방 번호고(방 호실 번호=index),0부터 시작해서 3개가 되게 만들기
//			System.out.printf("%s>%d\n", menuNumArr[i], menuPriceArr[i]);
		// System.out.printf("%.%s(%,d원)\n", menuNumArr[i], menuPriceArr[i]);
//		}

	}

}
