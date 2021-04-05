import java.util.Scanner;

public class MethodMission10 {

	public static void main(String[] args) {
		// 또또 자판기ㅠ

		Scanner scan = new Scanner(System.in);
		String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "레몬에이드" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000 };

		priceMenu(menuNmArr, menuPriceArr);
	}
	
	public static void priceMenu2(String[] nmArr, int[] priceArr) {
		String str="<메뉴>\n";
		for(int i=0;i<nmArr.length;i++) {
			str+=String.format("%d.%s(%,d원)\n", (i + 1), nmArr[i], priceArr[i]);
		}
		System.out.println(str);
	}

	public static void priceMenu(String[] a, int[] b) {
		//String[] nmArr, int[] priceArr
		System.out.println("<메뉴>\n");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d.%s(%,d원)\n", (i + 1), a[i], b[i]);
		}
		System.out.print("선택>");
	}

}
