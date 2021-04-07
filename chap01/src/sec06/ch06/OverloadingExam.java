package sec06.ch06;

public class OverloadingExam {

	public static void main(String[] args) {
		// CalC 객체화
		// sum 메소드 호출 arguments 5, 10

		Calc c = new Calc(); // 참조변수 Calc
		c.sum(5, 10); // 주소값.sum 호출
		c.sum(5,10,11);
		c.sum(5, 10,"30");
	}

}
//파라미터가 더 중요 중요
class Calc {
	void sum(int n1, int n2) {
		System.out.println(n1 + n2);

	}

	void sum(int n1, int n2, int n3) {
		System.out.println(n1+n2+n3);
	}
	
	int sum(int d1, int d2, String d3) {
		System.out.println(d1+d2+d3);
		return 0;
	}
	
	
}

