package practice;

public class OverrideExam {
//다양성 때문에 오버라이딩 씀!
	public static void main(String[] args) {
		NumBox nb1 = new NumBox(10);
		NumBox nb2 = new NumBox(10);

		System.out.println("nb1==nb2:" + (nb1 == nb2));
		// ==비교는 주소값 비교
		System.out.println("nb1.equals(nb2):" + (nb1.equals(nb2)));
	} // String처럼 만들어 보겠다 - Override

}

class NumBox {
	private int num;

	NumBox(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	@Override
	public boolean equals(Object obj) {// 무슨 객체든지 다 보낼 수 있음
		NumBox temp = (NumBox) obj;
		return this.getNum() == temp.getNum();
	}

}
