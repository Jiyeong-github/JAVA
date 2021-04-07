package sec06.ch06;

public class StaticExam {

	public static void main(String[] args) {
		Toy t1 = new Toy();
		Toy t2 = new Toy();

		t1.name = "디즈니";
		System.out.println("t1.name:" + t1.name);
		
		t2.name = "롯데";
		
		Toy.name="SOC";
		System.out.println("t1.name:" + t2.name);
		System.out.println("t1.name:" + t1.name);
		System.out.println("Toy.name:" + Toy.name);
	}
}

	class Toy {
		static String name; //static 공용, 메모리상 완전 다른 곳에 할당
	}
	//string 변수가 static에 들어감. 
	//static 붙이는 순간 바로 메모리에 들어감.
	//한 값밖에 저장 못 함!
	//객체화와 연관 X

