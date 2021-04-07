package sec06.ch06;

public class InstanceExam5 {

	public static void main(String[] args) {
		Car[] carArr = new Car[5]; //5개 칸
		
		carArr[0]=new Car();
		
		carArr[0].name ="그랜저";
		

	}

}

class Car {
	
	String name;
	int price;
	
}