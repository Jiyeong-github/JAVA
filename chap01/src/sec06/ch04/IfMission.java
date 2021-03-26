package sec06.ch04;

public class IfMission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=81;
		//무한대로 늘어날 수 있는 else if
		if(score>=90) {//90~
			System.out.println("M 등급 D");
		} else if(score<=80) {//80~89
			System.out.println("M 등급 C");
		}else if(score>=70) {//70~79
			System.out.println("M 등급 B");
		}else {//~69
			System.out.println("M 등급 A");
		}
		System.out.println("끝");
	}
}
/*(
int score=81;
//무한대로 늘어날 수 있는 else if
if(score<70) {//~69
	System.out.println("M 등급 D");
} else if(score<80) {//70~79
	System.out.println("M 등급 C");
}else if(score<90) {//80~89
	System.out.println("M 등급 B");
}else {//90~
	System.out.println("M 등급 A");
}
System.out.println("끝");*/