package sec06.ch06;

public class ConstructorExam {
//객체지향 언어는 모든 생성자를 사용한다.
	// 생성자는 객체가 만들어질 때 무조건 호출을 해야 한다.
	public static void main(String[] args) {
		// 생성자를 배우는 0407
		Tv tv1 = new Tv();
//		tv1.volumeUp();
//		tv1.currentVolume++;
		
		tv1.brand= "Samsung";
		tv1.inch=100;
		tv1.maxChannel=200;
		tv1.maxVolume=100;
		tv1.displayState();
		//Samsung 100inch 100Channel 100Volume
//		tv1.volumeUp();
//		tv1.volumeUp();
//		tv1.volumeUp();
//		
//		tv1.displayVolume(); //현재 볼륨 : 3
//		tv2.displayVolume();
		
		Tv tv2=new Tv("LG",200,150,200);
		tv2.displayState();
		//LG 200inch 150Channel 200Volume
	}
}

class Tv {
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;

	Tv(String brand, int inch, int maxChannel, int maxVolume) {
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	
	}

	// 기본 생성자
	// 생성자 vs 메소드
	// 이름은 클래스명이랑 같다
	// 리턴타입이 없다(int/void 쓰지 말 것)
	// 접근지시어는 쓸 수 있음
	// 생성자는 객체를 생성할 때만 사용 가능
	// 기본 생성자는 컴파일러가 생성자가 하나도 없을 시 넣어준다.
	Tv() {
		System.out.println("TV 기본 생성자");
	}
	
	void displayState() {
		System.out.printf("%s %dinch %dChannel %dVolume\n", brand, inch, maxChannel, maxVolume);
	}
//
//	void volumeUp() {// 리턴 값을 받지 않겠다'
//		int currentVolume = 0; // -젤 가까운 변수를 사용한다고 이걸 쓰면 답이 0이 됨
//		this.currentVolume++; // 자기 자신의 주소값
//		// currentVolume+=2;
//	}
//
//	void displayVolume() {
//		System.out.printf("볼륨은 %d이다.\n", currentVolume);
//	}// sysout("현재 볼륨:"+currentVolume);
}
