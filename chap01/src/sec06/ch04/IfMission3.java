package sec06.ch04;

public class IfMission3 {

	public static void main(String[] args) {
		final int SCORE=(int)(Math.random()*20)+81;
		System.out.println("SCORE:"+SCORE);
		//SCORE 값은 81~100점 사이의 값이 됨. (실행할 때마다 달라짐)
		//91~100 A(97점 이상은 "A+", 96~94 "A", 93~90 "A-"
		//81~90 A(87점 이상은 "B+", 86~84 "B", 83~80 "B-"
		//나머지 C
		
		/*	String dGrade="D";
			char dGradeChar='';
			
			int restVal=SCORE%10;
			if(restVal>=7||restVal==0){dGradeChar='+';}
			else if(restVal<=3){dGradeChar='-';}
			
			if(SCORE>90){dGrade="A";}
			else if(SCORE>80){dGrade="B";}
			else if(SCORE>70){dGrade="C";}
			else{dGradeChar='';}
			
			System.out.printf("%s%c",dGrade,dGradeChar);
		*/
			if(SCORE>=97) {
				System.out.println("A+");
			}else if(SCORE>=94) {
				System.out.println("A");
			}else if(SCORE>=91) {
				System.out.println("A-");
			}else if(SCORE>=87) {
				System.out.println("B+");
			}else if(SCORE>=84) {
				System.out.println("B");
			}else {
				System.out.println("B-");
			}
	}
}
