package sec06.ch05;

public class ArrayMission2 {

	public static void main(String[] args) {
		// 정수형 배열 생성(10칸짜리)
		// 1~10까지 순차적으로 대입 for
		// 각방의 값을 콘솔 출력 for
		// 입력과 출력은 분리

		int[]intArr=new int[10];
		//객체 지향 언어는 업무 분리가 아주 중요~ 입력과 출력을 분리시키기!
		
		for(int i=0;i<intArr.length;i++) {
			intArr[i]=i+1;
		}
		for(int i=0;i<intArr.length;i++) {
			System.out.printf("intArr[%d]:%d\n",i,intArr[i]);
		}
		
//		int[] intArr = new int[10]; //정수형 배열 생성
//		
//		for(int i=0;i < intArr.length; i++) {
//			intArr[i]=i+1;
//		}
//
//		for (int i = 0; i < intArr.length; i++/* i<10;i++ */) {
//			System.out.printf("intArr[%d]:%d\n", i, intArr[i]);
//		}

	}
}
