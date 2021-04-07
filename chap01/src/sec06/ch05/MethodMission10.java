package sec06.ch05;

import java.util.Scanner;


public class MethodMission10 {

	public static void main(String[] args) {
		// 또또 자판기ㅠ

		Scanner scan = new Scanner(System.in);

		String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "레몬에이드" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000 };
//각 방에는 주소값이 다 달라서 독립적인 개체임
		Drink[] drinkArr = new Drink[5];
		for (int i = 0; i < drinkArr.length; i++) {
			Drink drink = new Drink();	
			drinkArr[i] = drink;
			
			drink.nm = menuNmArr[i];
			drink.price = menuPriceArr[i];
//			
//		drinkArr[0].nm="콜라";
//		drinkArr[0].price=1000;
//
//		drinkArr[i]=drink;
//		drinkArr[i] = new Drink();
		}
		
		printMenu3(drinkArr);
	}

	public static void printMenu3(Drink[] drinkArr) {
		String str = "<메뉴>\n0. 종료\n";
	
		for (int i = 0; i < drinkArr.length; i++) {
			str += String.format("%d. %s(%,d원)\n",i+1,drinkArr[i].nm,drinkArr[i].price);
			//System.out.println(drinkArr[i].nm);
		}
		System.out.println(str);
	}

	
	// .length는 int임!

	// 0번 입력하면 리턴
//	public static boolean chooseMenu(Scanner scan, int len) {
//		System.out.print("선택>");
//		int selectedNum=scan.nextInt();
//		return true;
//	}
	
	

	public static void priceMenu2(String[] nmArr, int[] priceArr) {
		String str = "<메뉴>\n";
		str += "0. 종료\n";
		for (int i = 0; i < nmArr.length; i++) {
			str += String.format("%d.%s(%,d원)\n", (i + 1), nmArr[i], priceArr[i]);
		}
		System.out.println(str);
	} // 이게 더 좋댔음

	public static void priceMenu(String[] a, int[] b) {
		// String[] nmArr, int[] priceArr
		System.out.println("<메뉴>\n");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d.%s(%,d원)\n", (i + 1), a[i], b[i]);
		}
		System.out.print("선택>");
	}

}
