package sec06.ch06;

public class CapsuleExam1 {

	public static void main(String[] args) {
		Human2 h1 = new Human2();
		Human2 h2 = new Human2();
		// 나이는 12, 이름은 "홍길동"
		// 나이는 20, 이름은 "신사임당"

		h1.setName("홍길동");
		h1.setAge(12);
		h2.setName("신사임당");
		h2.setAge(20);

		System.out.printf("My name %s, age is %d.", h1.getName(), h2.getAge());
		;

		h1.whoAmI();
		h2.whoAmI();

	}

}

class Human2 {
	private int age; //프라이빗 멤버필드에 숫자 넣는 법(메소드, 생성자)
	private String name;
//	private final int MAX_AGE = 100;
//(쓰기)setter 메소드는 값을 넣을 때 씀, 생성자
	//setter는 없고 생성자는 있는 상태 - 변수라도 값을 바꿀 수 없다.
//(읽기)getter 메소드는 값이 나올 때 씀

//멤버필드는 웬만하면 프라이빗을 줘라 - 값이 고정되어야 함.
//산수는 프라이빗 안 줘도 된다 - 어차피 값이 안 바뀌니까
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
//this 사용법 : this(int,String 등등): 생성자 호출 this.():멤버필드, 멤버메소드 접근
	public void setName(String name) {
		this.name = name;
	}

	public void whoAmI() {
		System.out.printf("내 이름은 %s 나이는 %d살입니다.\n", name, age);
	}
// generate Constructor using Fields
	Human2(String name, int age) {
		this.age = age;
		this.name = name;
	}//생성자는 클래스명이랑 같아야 하고, 리턴 타입이 없음

	Human2(String name) {
		this(name, 10);
	}

	Human2(int age) {
		name = "미상";
		this.age = age;
	}

	Human2() {
		this("미상", 10);
	}
}