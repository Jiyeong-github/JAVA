package sec06.ch05;

public class Ex2 {
	public static void main(String[] args) {

		String[] menuNmArr = { "콜라", "사이다", "환타" };
		int[] menuPriceArr = { 1000, 1200, 1300 };
		
		for(int i=0;i<menuNmArr.length;i++) {
			System.out.printf("%d.%s(%,d원\n)",(i+1),menuNmArr[i],menuPriceArr[i]);
			
	}

 }//end of main
}//end of class
