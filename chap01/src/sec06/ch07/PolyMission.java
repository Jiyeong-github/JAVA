package sec06.ch07;

public class PolyMission {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Bus();
		Car car3 = new LocalBus();
		Car car4 = new Truck();

		// Bus,LocalBus 객체였다면 openDoor 메소드 호출
		// 그 외는 hoot 메소드 호출
		blowClaxon(car1);
		blowClaxon(car2);
		blowClaxon(car3);
		blowClaxon(car4);
	}

	public static void blowClaxon(Car a) {

			if (a instanceof Bus) {
				((Bus) a).openDoor();
			} else {
				a.hoot();
			}
		}
	}

