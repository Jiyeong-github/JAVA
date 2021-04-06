package sec06.ch06;//패키지가 중요한 이유 : 구별, 웹 도메인 기준으로 만듦

//com.naver.프로젝트명.model.클래스명(.이 최소 2개 들어감)

public class InstanceExample {// public class는 자바 파일명이랑 같아야만 가능

	public static void main(String[] args) {
			Dog dog=new Dog(); //type은 변수명(dog)=new(객체화를 시켜주는 키워드) 그냥 new Dog 쓰면 만들자마자 소멸, Dog dog은 위치를 알려줌!
			//대문자로 시작하는 건 Reference(참조 변수) , 전부 다 주소값(메모리)
			Dog puppy=new Dog();
			dog.name="송이";
			puppy.name="쏭이";
			
			dog.bark();//주소값. <<.하는 순간 접근하는 거!
			//byte, short, int,long,float,double,char,boolean //을 제외하고는 참조 변수
			puppy.bark();
	}

}

//멤버필드(값을 저장할 수 있는 것 - 명사 담당)
//멤버메소드(값을 수정할 수 있는 것 - 동사 담당) 
class Dog {// 클래스는 여러개 있어도 상관 X
	// 클래스 이름은 항상 대문자
	String name;
	String jong;
	int age;
	// 위에 녀석들은 전역변수

	void bark() {
// 지역변수		String name; 
		System.out.printf("%s가 멍멍\n",name);
	}
}