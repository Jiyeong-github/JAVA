package sec06.ch06;

public class StaticExam2 {

	public static void main(String[] args) {

		Toy2.makeCount = 10;
		Toy2 t1 = new Toy2();

		System.out.println("Toy2:" + Toy2.makeCount);
		System.out.println("Toy3:" + Toy3.makeCount);

	}

	class Toy3 {
		static int makeCount = 0;
	}

	class Toy2 {
		static int makeCount = 0;

		Toy2() {
			Toy3.makeCount++;
		}
	}
//		Toy2 t1=new Toy2();
//		Toy2 t2=new Toy2();
//		
//		System.out.println("장난감 생산 갯수:"+t1.makeCount);
//		System.out.println("장난감 생산 갯수:"+t2.makeCount);
//		System.out.println("장난감 생산 갯수:"+Toy2.makeCount);
//	}
//}
//
//class Toy2{//객체가 여러개라도 변수는 하나
//	static int makeCount;
//	
//	Toy2() {
//		makeCount++;
//	}
//}
//
//class Toy3{
//	static int makeCount=0; //static 안 붙이면 늘어날 수 있음, 각각의 makecount가 있는 거임
//}
//
//class Toy{
//	static int makeCount=0;
//	Toy(){
//		makeCount++;
//	}
}
