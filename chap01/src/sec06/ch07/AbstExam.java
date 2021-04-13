package sec06.ch07;

public class AbstExam {

	public static void main(String[] args) {
//추상클래스는 객체화 불가능!		Animal animal = new Animal();
		
		Animal ani=new Cat();
		ani.breath();
	}
}
//객체화 불가능
//다중 상속 불가능
//변수 가질 수 있음
//상수 가질 수 있음
//구현부에 있는 메소드 가질 수 있음
//추상메소드 가질 수 있음
//부모타입 역할만 함
//자식한테 추상 메소드 오버라이딩 강제성 부여