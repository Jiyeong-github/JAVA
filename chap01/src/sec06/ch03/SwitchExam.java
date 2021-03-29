package sec06.ch03;

public class SwitchExam {

	public static void main(String[] args) {
		int val=2;
		switch(val) {
		case 1:
			System.out.println("값은 1이다.");
			break;
		case 2:
			System.out.println("값은 2이다.");
			break;
		case 3:
			System.out.println("값은 3이다.");
			break;
		default://break 없으면 여러 개가 같이 실행됨. 있으면 중간에 있든 말든 상관 X
			System.out.println("값은 1~3이 아니다.");
			break;
	}
		System.out.println("끝");
}
}
