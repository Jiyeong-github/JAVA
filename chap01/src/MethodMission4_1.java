
public class MethodMission4_1 {

	public static void main(String[] args) {
		sumAllFromTo(2, 4);// void일 확률이 높음
		sumAllFromTo(4, 2);// 9 나오게 하기
	}
		public static void sumAllFromTo(int to, int from) {
			int sum=0;
			for(int i=to;i<=from;i++) {
				sum+=i;
			}
			for(int i=to;i>=from;i--) {
				sum+=i;
			}
			System.out.println("sum:"+sum);
	}

}
