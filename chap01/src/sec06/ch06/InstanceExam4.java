package sec06.ch06;

public class InstanceExam4 {

	public static void main(String[] args) {
		// Car 객체화 2대
		// 첫번째 차의 name은 "소나타", cc는 2000
		// 두번째 차의 name은 "911", cc는 5000
		// 첫번째 차는 drive한다.
		// 두번째 차는 stop한다.

		Car car = new Car();
		Car truck = new Car();

		car = truck;
		System.out.println(car == truck);
		// reference 값끼리의 ==은 같은 주소냐고 묻는 격

		car.name = "소나타";
		car.cc = 2000;

		truck.name = "911";
		truck.cc = 5000;

		car.drive();
		truck.stop();

	}

}

class Car {
	String name;
	int cc;

	void drive() {
		System.out.printf("%s는 달린다.", name);
	}

	void stop() {
		System.out.printf("%s는 멈춘다.", name);
	}
}