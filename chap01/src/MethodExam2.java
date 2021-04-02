
public class MethodExam2 {

	public static void main(String[] args) {
		int n1 = 10, n2 = 30;

		voidSum(n1, n2); //return을 안 하기 때문에 void형 앞에 절대 int 안 옴!
		voidSum(1, 2);

		System.out.println("---------");

		int result = intSum(n1, n2);
		System.out.printf("%d 더하기 %d는 %d입니다.\n", n1, n2, result);
		intSum(1, 2);
		System.out.printf("%d+%d=%d\n", n1, n2, result); //result 대신 voidSum 넣으면 에러

		for (int i = 0; i < 100; i++) {
			hello();
		}
	}

	public static void hello() {
		System.out.println("안녕!");
	}

	public static void voidSum(int n1, int n2) { // void는 리턴하지 않는 거!
		System.out.printf("%d+%d=%d\n", n1, n2, (n1 + n2));
	}

	public static int intSum(int n1, int n2) { // 메소드에서는 int 값 각각 줘야 함!
		return n1 + n2;
	}

}
