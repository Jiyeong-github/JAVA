
public class MethodMission2 {

	public static void main(String[] args) {
		int n1 = 10, n2 = 3;
		double result = divide(n1, n2);// 3.333333
		System.out.println("result:" + result);// 3.33333

		n2 = 5;
		result = divide(n1, n2);
		System.out.println("result:" + result);// 2.0

		System.out.println("절댓값:" + abs(10)); // 절대값 나오게 하기
		System.out.println("절댓값:" + abs(-10));
	}

	public static double divide(int n1, int n2) {
		return (double) n1 / n2;
	}

	public static int abs(int a) {
		if (a < 0) {
			return -a;
		}
		return a;
	}//Math.abs(a);도 절대값
}