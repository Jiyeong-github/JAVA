package sec06.ch03;

public class SwitchMission {

	public static void main(String[] args) {
		int time=(int)(Math.random()*4)+8; //Math.random() 임의적인 값(0~0.999까지)이 나옴. 1이 절대 안 나옴!현재 이 식은 8~11까지 나옴.
		System.out.println("time:"+time);
		//8~11 사이의 정수 값이 time 변수에 대입됨.
		
		//time이 8이면 "출근합니다."
		//time이 9이면 "회의를 합니다."
		//time이 10이면 "업무롤 봅니다."
		//나머지 시간에는 외근을 갑니다.
	
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
			break;
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("업무롤 봅니다.");
			break;
		default://break 없으면 여러 개가 같이 실행됨. 있으면 중간에 있든 말든 상관 X
			System.out.println("나머지 시간에는 외근을 갑니다.");
			break;
	}
	
	}

}
