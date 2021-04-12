package sec06.ch06;

public class PolyExam2 {
	/*
	 * 1. 부모타입은 자식객체 주소 값 참조 가능(가리킬 수 있음) 
	 * 2. 자식타입은 부모객체 주소 값 참조 불가능
	 */

	public static void main(String[] args) {
		Animal ani1 = new Hamster();
		Animal ani2 = new Animal();
		// Animal ani3 = new String();
		Hamster ham = (Hamster)ani1;
		
//자식타입이 부모객체 참조 불가능		Hamster ham=ani2;
		System.out.println("끝");
	}
}
