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
//메소드 안에 없으면 무조건 전역변수
	class CalcStatic { //클래스 멤버필드
		static int num1;//전역변수는 무조건 static
		static int num2;//instance 전역변수

		static int sum() {
			return num1 + num2;
		}
	}

	class CalcInstance {
		int num1; //지역변수
		int num2;

		int sum(int num1) {
			return this.num1 + num2;
		}

		static int sum(int num1,int n2) {
			return num1+n2;
		}
	}
 
