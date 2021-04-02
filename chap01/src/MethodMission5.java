
public class MethodMission5 {

	public static void main(String[] args) {
		int rNum = getRandomNum();// 0~9
		System.out.println("rNum:" + rNum);
		// rNum=getRandomNum(int max);//오버로딩

		rNum = getRandomNum(20);// 0~19
		rNum = getRandomNum(5); // 0~4

		rNum = getRandomNum(5, 10);// 5~10 랜덤값으로 주세요
		rNum = getRandomNum(10, 20);// 10~20
		
		System.out.println();
	}
	
	public static int getRandomNum() {
		return(int)(Math.random()*10);
	}

	public static int getRandomNum(int max) {// 이름 맞출 필요x,타입 중요
		return (int) (Math.random() * max);// 다이나믹=변수를 씀, 넘어오는 값으로 실행됨(매개변수)
	}

	public static int getRandomNum(int a,int b) {
		return (int) (Math.random() * (b-a+1)+a);
	}
	
}
