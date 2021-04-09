package sec06.ch06;

public class PolymoExam {
//메소드 기준으로만 다형성 기억하기
//1. 부모타입의 변수는 자식 객체를 가리킬 수 있음
//2. 자식타입의 변수는 부모 객체를 가리킬 수 없음
//#자신의타입의 변수는 자신의 객체를 가리킬 수 있음
//3. *중요* 가리켰다면 타입은 아는 메소드만 호출 가능
//호출이 되었다면, 기준은 객체이다.

	public static void main(String[] args) {
		Animal ani_1 = new Cat();
		// 불가능 Cat cat1 = new Animal();
		Cat cat = (Cat) ani_1; // 자동형변화 해주면 됨
//형변화 불가로 에러가 터짐!	Cat cat1=(Cat)new Animal("",0); 
		Animal ani_2 = cat;
		
		ani_2.howling();
		cat.howling(); //가리키는 타입이 다르더라도 실행 기준은 객체
//호출 불가, lick의 존재를 모름!		ani_1.lick(); 
		cat.lick();
		//메소드가 호출할 수 있는 범위가 달라짐ani
		System.out.println("끝");
	}
//자식이 부모와 같거나 더 많은 메소드를 가질 수 있음
}
