package sec06.ch06;

public class ConstructorExam2 {

	public static void main(String[] args) {
		Tv2 tv = new Tv2();
		tv.displayState();
		// 일렉트로 50 inch 100Channel 50Volume
	}
}

class Tv2 {
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;

	Tv2() {//클래스명이랑 메소드명 같아야함!
		this("일렉트로",50,100,50);
	}//this.displayState를 이렇게도 데리고 올 수도 있다.
		
	void displayState(){//함수에 () 필수템!
		
	}
	Tv2(String brand, int inch, int maxChannel, int maxVolume) {
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}//오버로딩 가능가능~
}