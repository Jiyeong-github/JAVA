package sec06.ch04;

public class IfExam {
	public static void main(String[] args) {
		int score=90;
		
		if(score>=90) {
			System.out.println("score가 90보다 큽니다.");
			System.out.println("등급A");
		}
		
		if(score<90) {
			System.out.println("score가 90보다 작습니다.");
			System.out.println("등급 B");
		}
		System.out.println("끝");
		
		System.out.println("-------------");
		
		if(score>=90) {
			System.out.println("score가 90보다 큽니다.");
			System.out.println("등급A");
		}
		
		else{
			System.out.println("score가 90보다 작습니다.");
			System.out.println("등급 B");
		}
		System.out.println("끝2");
	}
}
