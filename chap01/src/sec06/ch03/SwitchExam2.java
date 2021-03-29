package sec06.ch03;

public class SwitchExam2 {
//switch는 문자열 비교할 때 좋음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String habbit="수영";
		
		switch(habbit) {
		case "수영": case "등산":
			System.out.println("건강한 취미입니다.");
			break;
		case "술" : case "담배":
			System.out.println("비건전한 취미입니다.");
		}

	}

}
