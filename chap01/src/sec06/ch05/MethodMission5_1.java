package sec06.ch05;

public class MethodMission5_1 {
// 중복된 소스 최대한 제거
// 메소드는 재활용 극대화
	public static void main(String[] args) {

		int star = 5;
		printStarLine(star);// *****

		star = 3;//int를 두 번이나 선언할 수 없다
		printStarLine(star);// ***
	}

	public static void printStarLine(int a) {
		for (int i = 0; i < a; i++) {//star는 a니까^__^
				System.out.print("*");
			}
		}
	}

