package sec06.ch04;

public class IfExam2 {
	public static void main(String[] args) {
		int score=81;
		//무한대로 늘어날 수 있는 else if
		if(score>=90) {
			System.out.println("등급 A");
		} else if(score>=80) {
			System.out.println("등급 B");
		}else if(score>=70) {
			System.out.println("등급 C");
		}else {
			System.out.println("등급 D");
		}
		System.out.println("끝");
	}
}
