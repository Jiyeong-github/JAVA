package sec06.ch06;

public class PolymoMission {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal pig = new Pig();
		Animal hamster = new Hamster();
		// Animal 타입으로는 runRail을 호출할 수 없음
		// 새롭게 햄스터 객체를 만들지 않고, 8번 라인의 hamster 변수에
		// 저장된 주소값을 활용하여 runRail을 호출할 것
		
		Hamster h = (Hamster) pig;
		

		System.out.println(ani instanceof Hamster);
		System.out.println(hamster instanceof Hamster);
		System.out.println(pig instanceof Hamster);
		// 강제형변화 후 에러가 안 터지면 true / 아니라면 false

		Hamster ham = (Hamster) hamster;// 형변화
		ham.runRail();

		PolymoMission a = new PolymoMission();
		a.cry(cat);
		a.cry(pig);
		a.cry(hamster);
	}
	// eclipse 벗어난 곳에서 static void 기준
	// PolymoMissio.cry()로 적어줬어야 함

	static void cry(Animal ani) { // ani로 Hamster 객체 주소값이 들어오면
		// howling -> runRail로 호출(다른 객체들은 하울링 고대로~)
		if(ani instanceof Hamster) {
			((Hamster) ani).runRail();
		}
	}
}

	class Pig extends Animal {
		@Override
		void howling() {
			System.out.println("oink oink");
		}
	}

class Hamster extends Animal {
//	@Override
//	void howling() {
//		System.out.println("찍찍");
//	}
	public void runRail() {
		System.out.println("쳇바퀴를 굴린다.");
	}
}