
public class MethodExam3 {

	public static void main(String[] args) {
		int mon=12;
		printSeason(mon);
	}
	
	public static void printSeason(int mon) {//switch문은 break이 없으면 전부 다 출력 , return(for문에서의 break)
		switch(mon) {
		case 3: case 4: case 5:
			System.out.println("봄");
			return; //return에서 값 적지 말 것
		case 6: case 7: case 8:
			System.out.println("여름");
			return;
		case 9: case 10: case 11:
			System.out.println("가을");
			return;
		case 12: case 1: case 2:
			System.out.println("겨울");
			return;
		}
		System.out.println("잘못 입력하셨습니다.");
	}
}
