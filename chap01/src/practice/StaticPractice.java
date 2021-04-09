package practice;

public class StaticPractice {

	public static void main(String[] args) {
		CalcInstance ci = new CalcInstance();
		ci.num1 = 10;
		ci.num2 = 20;
		int result = ci.sum();
		System.out.println("result:" + result);

		String.format("%d", result);

		String str = new String();
		str.format("%d", result);
	}
}

	class CalcStatic {
		static int num1;
		static int num2;

		int sum() {
			return num1 + num2;
		}
	}

	class CalcInstance {
		int num1;
		int num2;

		int sum() {
			return num1 + num2;
		}

	}
 
