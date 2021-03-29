package sec06.ch03;

public class SwitchMission3 {

	public static void main(String[] args) {
		int season=(int)(Math.random()*12)+1;
		//Math.random() 메소드를 이용하여 1~12값만 나오게 처리
				//(switch로 해결)season 값이 3~5값이면 "봄", 6~8 "여름", 9~11 "가을" 12,1,2는  "겨울"
	System.out.println("season:"+season);
		switch(season) {
		case 3: case 4: case 5:
		System.out.println("봄");
		break;
		case 6: case 7: case 8:
		System.out.println("여름");
		break;
		case 9: case 10: case 11:
		System.out.println("가을");
		break;
		case 12: case 1: case 2:
		System.out.println("겨울");
		break;
		}
	}

}
