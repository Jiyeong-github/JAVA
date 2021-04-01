package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission7 {

	public static void main(String[] args) {

		String[] menuNmArr = { "콜라", "사이다", "환타" };
		int[] menuPriceArr = { 1000, 1200, 1300 };

		Scanner scan = new Scanner(System.in);

		System.out.println("돈을 넣어주세요");
		int money = scan.nextInt();

		while(true) {
			
			System.out.println("<메뉴>\n");
			for(int i=0;i<menuNmArr.length;i++) {
				System.out.printf("%d.%s(%,d원\n)",(i+1),menuNmArr[i],menuPriceArr[i]);
			}
		}

	}
}