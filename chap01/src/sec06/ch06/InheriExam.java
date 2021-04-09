package sec06.ch06;

public class InheriExam {

	public static void main(String[] args) {
//		Cat cat = new Cat();
		KoShort ks = new KoShort();
		ks.howling();
//		cat.name = "고양이";
//		cat.age = 4;
//		cat.howling();
//		cat.lick();
	}
//cat.pee는 존재 자체를 몰라서 호출 불가
}
//다중 상속 불가 class Animal extends Spice, Object 이런 거 X
//Object는 자바 최상위 부모 - Object는 건들지 못함 (젤 먼저 만들어짐)
class Animal extends Object { // 그럼 cat은 이 내용을 사용 할 수 있음
//	Animal() { //생성자
//		super(); //생성자 바로 위에 있어야만 함;
//		System.out.println("Animal 생성자");
//	}

//	Animal(){
//		super();
//		System.out.println();
//	}
	String name;
	int age;

//	public Animal(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
	
	
	void howling() {
		System.out.println("운다");
	}
}

class Cat extends Animal { // 상속 키워드는 extends -> 상속 받고 싶은 키워드

//	Cat() {// super(바로 위 부모)랑 this 비슷(cat 객체 자신) : 대상만 다름
//		super();
//		System.out.println("Cat 생성자");
//	
// 생성자 호출은 다름 - Cat부터 시작 > Animal > Object

//	public Cat() {//호출될 수 있도록 유도해주기
//		super("",0);
//	}
	void lick() {
		System.out.printf("%s가 핥다\n.", name);
	}
	
	@Override //오버라이드가 성공하려면 부모 정의를 덮어서 쓰니까 이름 같아야 함
	//실수 분석용, 부모 메소드를 덮어쓰기
	//<>오버로딩 : 같은 거 여러 개 써버리기
	void howling() {
		System.out.println("야옹");
	}
}

class KoShort extends Cat {// KoShort은 Cat에게 영향을 못 미침
	//여기 안에 void howling이 없으면 부모에서 찾아냄 - Override 
	KoShort(){
		super();
		System.out.println("KoShort 생성자");
	}
	
	void pee() {
		System.out.printf("%s가 소변을 본다.\n", name);
	}
}