package sec06.ch07;

public class PolyExam2 {

	public static void main(String[] args) {
		// instanceof는 상속관계일 때 사용하는 기능

		Car car1 = new LocalBus();
		LocalBus b1 = (LocalBus) car1;
		System.out.println(car1 instanceof LocalBus);

		Bus bus1 = (Bus) car1;
		System.out.println(car1 instanceof Bus);

		System.out.println("------------");

		Car car2 = new Bus();
		System.out.println(car2 instanceof LocalBus);
		// car2는 버스 객체이고 LocalBus는 자식객체라서 false

		Car car3 = new Truck();//Car type은 Car, Truck, LocalBus 등등
		Truck truck = new Truck(); //Truck
//Bus,LocalBus		Bus bus4=(Bus)truck; 
		System.out.println(car3 instanceof Bus);
		
	}

}
