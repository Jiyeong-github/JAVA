package sec06.ch06;
//해당 패키지 내 하위 패키지가 있어도 달라서 안 됨
public class AccessExam2 {

	public static void main(String[] args) {
		Access acc=new Access();
		//acc.num=10; -같은 패키지라도 프라이빗은 불가능
		
		acc.printNum(); // default라 가능
	}

}

