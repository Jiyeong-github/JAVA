package practice;

public class MethodMission {

	public static void main(String[] args) {
		// 크기 비교하기
		whoIsBig(10,30);
		whoIsBig(10,9);
		whoIsBig(11,25);
		
		int big=getBigNum(10,30);
		big=30;
		System.out.println("big:"+big);
		
		big=getBigNum(10,9);
		System.out.println("big:"+big);

	}
	
	public static void whoIsBig(int a,int b) {
		
		int bigNum=b;
		if(a>b) {
			bigNum=a;
		}
		System.out.printf("%d가 가장 큽니다\n",bigNum);
	}
	
	public static int getBigNum(int a,int b) {
		if(a>b) {
			return a;
		}
		return b;
	}
}
