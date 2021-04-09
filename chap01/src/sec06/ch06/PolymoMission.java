package sec06.ch06;

public class PolymoMission {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster hamster = new Hamster();

		PolymoMission a = new PolymoMission();
		a.cry(cat);
		a.cry(pig);
		a.cry(hamster);
	}
	//eclipse 벗어난 곳에서 static void 기준
	//PolymoMissio.cry()로 적어줬어야 함

	void cry(Animal animal) {
		animal.howling();
	}
}

class Pig extends Animal {
	@Override
	void howling() {
		System.out.println("oink oink");
	}
}

class Hamster extends Animal {
	@Override
	void howling() {
		System.out.println("찍찍");
	}
}