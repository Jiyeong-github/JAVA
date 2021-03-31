package sec06.ch04;

public class WhileExam3 {

	public static void main(String[] args) {
		int val = 0, sum = 0;
		do {
			val = (int) (Math.random() * 11);
			System.out.println("val:"+val);
			sum+=val;
		} while (val != 0);
		System.out.println("dowhile-sum:" + sum);
	}
}
//while이랑 달리 최초 한 번은 실행시켜 줌.