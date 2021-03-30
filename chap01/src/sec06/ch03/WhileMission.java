package sec06.ch03;

public class WhileMission {

	public static void main(String[] args) {
		//1~100 합계를 구하시오.(while문으로 해결)
		int sum=0;
		int i=1;
		//선언 위치 매우 중요 = while 위에 선언하기!
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println("합:"+sum);
		//합계:5050

	}

}
