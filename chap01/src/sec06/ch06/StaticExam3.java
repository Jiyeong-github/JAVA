package sec06.ch06;

public class StaticExam3 {

	public static void main(String[] args) {
		//static 안 붙은 메소드
		CalcInstance ci = new CalcInstance();
		int result = ci.sum(10, 20);
		System.out.println("result:" + result);
		//static 붙은 메소드 - 계산 바로 뚝딱~
		int result2 = CalcStatic.sum(10, 30);
		System.out.println("result2:" + result2);
	}

}

class CalcStatic {
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

class CalcInstance {
	int sum(int num1, int num2) {
		return num1 + num2;
	}
}
