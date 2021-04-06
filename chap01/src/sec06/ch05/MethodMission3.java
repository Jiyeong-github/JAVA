package sec06.ch05;

public class MethodMission3 {

	public static void main(String[] args) {

		sumAllFromTo(5, 10); // sum:45 - 첫번째 시작~두번째 끝

		sumAllFromTo(2, 4);//void일 확률이 높음

		sumAllFromTo(1, 100);
	}

	public static void sumAllFromTo(int a,int b) {//final값 주면 빨라짐
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println("sum:" + sum);
	}

}
