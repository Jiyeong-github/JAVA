package sec06.ch06;

public class IfExam4 {

	public static void main(String[] args) {
		// 삼항식
		System.out.println(abs(-10));
		System.out.println(abs(7));
	}

	public static int abs(int val) {
		return val<0? -val : val; //구분자 ? : , 삼항식
//		if (val < 0) {
//			return -val;
//		}
//		return val;
	}

}
