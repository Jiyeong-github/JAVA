package sec06.ch06;

public class StaticExam4 {

	public static void main(String[] args) {
		// CalCInstance2 객체화
		// num1= 10, num2 = 20;
		// 더한 값을 콘솔에 출력!

		CalcInstance2 ci = new CalcInstance2();
		ci.num1 = 10; // 객체화된 애를 찾을려면 무조건 주소값.~
		ci.num2 = 20;
		int result = ci.sum();
		System.out.println("result:" + result);
		// static이 안 붙은 애를 쓰고 싶다면 무조건 객체화 ㄱ
		// CalcStatic2.num1=20;
		// CalcStatic2.num2=40;

		// CalcStatic2 cs2=new CalcStatic2();
		// int result=cs2.sum();
		// sysout("result:"+result);

		String.format("%d", result);

		String str = new String();
		str.format("%d", result);

	}
//언제 static을 붙일 수 있고 언제 안 되는가?

	class CalcStatic2 {// 클래스멤버필드
		static int num1;
		static int num2; // int static보다 먼저 메모리에 올라갈 수 없음.
		// static이 붙은 애들은 instance를 사용 할 수 없다.

		int sum() {
			return num1 + num2;
		}
	}

	class CalcInstance2 {// 멤버필드 사용
		int num1;
		int num2;

		int sum() {
			return num1 + num2;
		}

		static int sum(int n1, int n2) {
			return n1 + n2;
		}

	}
}
