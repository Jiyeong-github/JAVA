package sec06.ch06;
//같은 패키지 안이라 접근 가능
//같은 파일명만 가능
public class AccessExam {
//접근지시어 - 책 265쪽
//캡슐화를 통해 데이터를 보호함(감춰짐)
	public static void main(String[] args) {
		Access acc = new Access();
		acc.num = 10;
	}

}

class Access {
	private int num;//이 클래스를 벗어나면 접근할 수 없다.
	
	void printNum() {
		System.out.println("num:"+num);
	}
}

