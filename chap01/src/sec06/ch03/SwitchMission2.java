package sec06.ch03;

public class SwitchMission2 {

	public static void main(String[] args) {
		String pos="과장";
		
		//pos 값이 "부장"이면 "700만원"
		//pos 값이 "과장"이면 "500만원"
		//나머지 pos 값은 "300만원"
		
		switch(pos) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default://break 없으면 여러 개가 같이 실행됨. 있으면 중간에 있든 말든 상관 X
			System.out.println("300만원");
			break;
	}
	
	}

}
