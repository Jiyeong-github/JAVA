
public class MethodMission {

	public static void main(String[] args) {
		whoIsBig(10, 30); //콘솔> 30이 가장 크다
		whoIsBig(10, 9); //콘솔> 10이 가장 크다
		whoIsBig(11, 25); //콘솔> 25가 가장 크다

		enter1();
		System.out.printf(enter2());
		// System.out.println();
		System.out.println("ㅎㅇ");
		
	}//void형인가 비void형인지 확인 - 이 경우엔 비void

	 public static void whoIsBig(int n1, int n2) {
		 int big=n1;
		 if(n1<n2) {
			 big=n2;
		 }
		 System.out.printf("%d이 가장 큽니다.\n",big);
	 }
	 
	 public static void enter1() {
		 
		 System.out.println();
	 }
	 
	 public static String enter2() {
		 
		 return "\n";
	 }
}
