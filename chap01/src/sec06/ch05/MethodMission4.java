package sec06.ch05;

public class MethodMission4 {

	public static void main(String[] args) {
		int rNum = getRandomNum(); // 0~9까지의 수
		System.out.println("rNum:" + rNum);
		//rNum=getRandomNum(int max);//오버로딩
		
		int a=20;
		rNum=getRandomNum(a);//int type 정의하지 말기
		rNum=getRandomNum(5); //0~4
	}

	public static int getRandomNum(int max) {//이름 맞출 필요x,타입 중요
		return(int)(Math.random()*max);//다이나믹=변수를 씀, 넘어오는 값으로 실행됨(매개변수)
	}
		public static int getRandomNum() {
			return(int)(Math.random()*10);
		}//return 옆에 정수형(int형)
	}

