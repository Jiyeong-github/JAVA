package sec06.ch07;

public class PolyExam {
	/*
	 * 1. 부모타입은 자식 객체 참조, 저장 가능 
	 * 2. 자식타입은 부모 객체를 참조, 저장 불가능 3. 변수타입은 메소드 후출 여부만 결정함
	 * (자기가 아는 것만 호출 가능) 호출이 되었다면 실행되는 것은 객체 기준
	 */

	public static void main(String[] args) {
		Car car1 = new Bus(); // 버스(자식) 객체 가리키기 가능
		Car car2 = new Car();
		Car car3 = new LocalBus();

		Bus bus1 = (Bus) car1;
		bus1.openDoor();
		bus1.hoot();

		Car carP = bus1;
		carP.hoot();

		System.out.println("-----일-----");
		Car carP2 = new Truck();
		Truck truck1 = (Truck) carP2;
		Car carP3=truck1;
		carP3.hoot(); //트럭을 가리키고 있음

		System.out.println("-----이-----");
		Car carP4=new LocalBus();
		Bus bus2=(Bus)carP4;
		LocalBus b=(LocalBus)bus2;
		b.hoot();
		
		
		System.out.println("끝!");
	}

}
