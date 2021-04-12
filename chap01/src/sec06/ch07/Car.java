package sec06.ch07;

public class Car {
	public void hoot() {
		System.out.println("빵빵");
	}

	public void openDoor() {
		// TODO Auto-generated method stub
		
	}
}
	class Bus extends Car {
		public void openDoor() {
			System.out.println("문을 열다.");
		}
		@Override
		public void hoot() {
			System.out.println("Bus honking");
		}
	}
	
	class LocalBus extends Bus {
	}
	
//	class LocalBus extends Car {
//		@Override
//		public void hoot() {
//			System.out.println("LocalBus honking");
//		}
//	}

	class Truck extends Car {
		@Override
		public void hoot() {
			System.out.println("Truck honking");
		}
	}

