
public class MethodMission6 {

	public static void main(String[] args) {
		int score = getRandomScore(50, 100);
		// 50~100사이의 랜덤 숫자 나오게 하기!
		char grade = getGrade(score);
		// 90점 이상일 시 A
		// 80점 이상일 시 B
		// 70점 이상일 시 C
		// 60점 이상일 시 D
		// 나머지는 E
		char grade2 = getGrade2(score);
		// ?8이상이거나 100점이면 '+'
		// ?3이하면 '-'
		// 나머지는 ''빈칸 리턴
		System.out.printf("%d:%c%c\n", score, grade, grade2);
	}//%c는 char 값

	public static int getRandomScore(int a, int b) {
		return (int) (Math.random() * (b - a + 1) + a);
	}

	public static char getGrade(int score) {
		char grade = 'E';

		if (score >= 90) {
			return 'A';
		} else if (score >= 80) {
			return 'B';
		} else if (score >= 70) {
			return 'C';
		} else if (score >= 60) {
			return 'D';
		}
		return grade;
	}

	public static char getGrade2(int score) {
		char grade2=' ';
		//원샷원큐로 int mod=score%10; 도 가능!
		if(score%10>=8||grade2==100) {
			return '+';
		}else if(score%10<=3) {
			return '-';
		}
		
		return grade2;
	}
//public static char getGrade(int score){
	/*switch(score/10){
	 * case 10:case9:return 'A';
	 * case 8:return 'B';
	 * case 7:return 'C';
	 * case 6:return 'D';
	 *}
	 *return 'E';
	 * */
}
