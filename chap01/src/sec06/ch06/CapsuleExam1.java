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
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void whoAmI() {
		System.out.printf("내 이름은 %s 나이는 %d살입니다.\n", name, age);
	}

	Human2(String name, int age) {
		this.age = age;
		this.name = name;
	}

	Human2(String name) {
		this(name,10);
	}

	Human2(int age) {
		name = "미상";
		this.age = age;
	}

	Human2() {
		this("미상",10);
	}
}