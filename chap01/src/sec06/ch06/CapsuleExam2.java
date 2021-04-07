package sec06.ch06;

public class CapsuleExam2 {

	public static void main(String[] args) {
		Human2 h1 = new Human2(); // name : 미상, age :10
		Human2 h2 = new Human2("평강공주"); // name : 평강공주, age:10
		Human2 h3 = new Human2(30); // name : 미상, age :30
		Human2 h4 = new Human2("이순신", 20); // name : 이순신, age: 20

		h1.whoAmI();
		h2.whoAmI();
		h3.whoAmI();
		h4.whoAmI();
		
	}
	

}
