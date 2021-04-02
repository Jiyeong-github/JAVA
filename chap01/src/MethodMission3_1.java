
public class MethodMission3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sumAllFromTo(5, 10); // sum:45 - 첫번째 시작~두번째 끝

		sumAllFromTo(2, 4);// void일 확률이 높음

		sumAllFromTo(4, 2);// 9 나오게 하기
	}

	public static void sumAllFromTo(int a, int b) {// final값 주면 빨라짐
		int sum = 0;
		if (a < b) {
			for (int i = a; i <= b; i++) {
				sum += i;
			}
		} else if (a > b) {
			for (int i = b; i <= a; i++) {
				sum += i;
			}
		}
		System.out.println("sum:" + sum);
	}

}
