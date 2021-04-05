import java.util.Scanner;

public class MethodMission7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = null;

		do {
			System.out.print("성별:");
			String gender = scan.next();

			System.out.print("키:");
			int height = scan.nextInt();

			String result = chk(gender, height);
			System.out.println(result);
			// "성별:남, 키:170cm, 평균 미만"
			// "성별:여, 키:169cm, 평균"

			System.out.print("계속 하시겠습니까?");
			answer = scan.next();
		} while (!answer.equals("y"));
		System.out.println("끝");
		scan.close();
	}

	public static String chk(String gender, int height) {

		int stand1 = 175;
		int stand2 = 163;
		String result = "평균";

		if (gender.equals("남") || gender.equals("여")) {
		} else {
			return ("다시 선택해주세요.");
		}

		if (gender.equals("남") && height < stand1) {
			result += "미만";
		} else if (gender.equals("남") && height > stand1) {
			result += "이상";
		}

		if (gender.equals("여") && height < stand2) {
			result += "미만";
		} else if (gender.equals("여") && height > stand2) {
			result += "이상";
		}
		System.out.println();
		return "성별:" + gender + ", 키:" + height + "cm," + result;

	} //샘은 switch 쓰심
}

/*switch(gender){
 * case"여":
 * stand=163;
 * break;
 * case"남":
 * stand=175;
 * break;
 * default:
 * return "성별을 잘못 입력했습니다.";
 * }
 * 
 * if(height>stand){
 * result="평균 초과";
 * }else if(height<stand){
 * result="평균 미만";
 * }
 * System.out.printf("성별:%s,키:%dcm,%s\n"gender,height,result); <실무 자주 X
 * return String.format("성별:%s, 키:%dcm, %s", gender,height,result); <최고임;
 * */
