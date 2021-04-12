package sec06.ch07;

public abstract class Animal {// 추상클래스(abstract)
	private int age;
	private String name;

//구현구 있&없 - > 클래스
	public abstract void howling(); // 추상메소드
// 구현구 없는 건 메소드

	public void breath() {
		System.out.println("숨 쉰다.");
	}

	// 오버라이딩 무조건 해줘야 함!
	class Cat extends Animal {

		@Override
		public void howling() {
			System.out.println("야옹");
		}
	}

	class Dog extends Animal {

		public void howling() {
			System.out.println("야옹");
		}
	}
}