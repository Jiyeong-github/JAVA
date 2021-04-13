package sec06.ch07;
//다형성의 끝판왕
//상수 저장용
//접근지시어 : private(같은 클래스), default(같은 패키지)
// protected, public(인터페이스에서 안 써주면 걍 다 public임)

public interface RemoteControl {
	int AGE = 10; //public, final, static 다 붙음
	
	void volumeUp(); //앞에 public abstract가 생략되어 있음
	void volumeDown();
	void chkVolume(); //내용을 못 넣어서 static은 만들 수 없음
	//현재는 구현부가 없음
	
	
}
//객체화 불가능
//다중 상속 가능
//변수 가질 수 없음(무조건 상수)
//구현부에 있는 메소드 가질 수 없음(추상 메소드만 가질 수 있음)
//부모 타입 역할
//자식한테 추상 메소드 오버라이딩 강제성 부여