
public class MethodMission1_1 {

	public static void main(String[] args) {
		whoIsBig(10, 30); // 콘솔> 30이 가장 크다
		whoIsBig(10, 9); // 콘솔> 10이 가장 크다
		whoIsBig(11, 25); // 콘솔> 25가 가장 크다

		int big = getBigNum(10, 30);//비
		System.out.println("big:" + big);// big:30
		//whoIsBig같은 거 넣지말기-왜ㅠ??
		
		big = getBigNum(10, 9);
		System.out.println("big:" + big);// big:10
	}// void형인가 비void형인지 확인 - 이 경우엔 비void

	public static int getBigNum(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		}
		return n2;
	}// return으로도 잘 나옴~!
}
