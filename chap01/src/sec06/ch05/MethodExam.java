package sec06.ch05;

public class MethodExam {

	public static void main(String[] args) {// 메인 메소드
		// void=리턴타입 / main은 메소드명 / 소괄호 = 파라미터, 매개 변수
		int a =10;
		int result = sum(a, 20); //값을 보낸 것, 사용하는 부분에 int 제발 적지 말 것!
		System.out.println("sum-result:" + result);
		
		result=minus(20,10);
		System.out.println("minus-result:"+result);
	}

	public static int sum(int n1, int n2) { // 소괄호는 선언부, int 중요
		return n1 + n2; // 안쪽은 구현구 , return하는 값의 타입
	}

	public static int minus(int a, int b) {
		return a-b; //이 식 안에서 살아있어서 위의 내용은 관련x
	}
}
