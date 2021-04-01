package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission3 {

	public static void main(String[] args) {
		/*
		 * 돈을 주입해주세요:3000 <메뉴> 0.종료 1.콜라(1000원) 2.사이다(1200원) 3.환타(1300원) 선택>1 콜라를
		 * 선택하셨습니다(남은 금액 2000원) 선택>5 금액이 부족합니다. (남은 금액 700원) 선택>0 종료 - 남은 금액 :700원.
		 */

		String[] menuNmArr = { "콜라", "사이다", "환타" };
		int[] menuPriceArr = { 1000, 1200, 1300 };

		Scanner scan = new Scanner(System.in);

		System.out.println("돈을 넣어주세요.");
		int money = scan.nextInt();

		while (true) {
			System.out.println("\n<메뉴>");
			for (int i = 0; i < menuNmArr.length; i++) {
				System.out.printf("%d.%s(%,d원)\n", (i + 1), menuNmArr[i], menuPriceArr[i]);
			}
			System.out.print("선택>");
			int choice = scan.nextInt();

			if (choice == 0) {
				break;
			} else if (choice < 0 || choice > menuNmArr.length) {
				System.out.println("잘못 선택하셨습니다.");
				continue;
			}
			
			int selectedIdx = choice - 1;
			System.out.printf("%s를 선택하셨습니다.\n", menuNmArr[selectedIdx]);
			
			//1번 골랐을 때 이름 나오게 하기
		
			if(selectedIdx==0) { 
				System.out.println("콜라");
			}else if(selectedIdx==1) {
				System.out.println("사이다");
			}else if(selectedIdx==2) {
				System.out.println("환타");
			}
			System.out.println("종료");
			
			
		}
	}

}
