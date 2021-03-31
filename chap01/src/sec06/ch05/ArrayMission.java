package sec06.ch05;

public class ArrayMission {

	public static void main(String[] args) {
		//정수형 배열 생성(10칸짜리)
		//모든 방에 정수값 20을 세팅
		//for문 활용
		//각 방은 string 타입
		
		int[]intArr=new int[10];
		
		for(int i=0;i<intArr.length;i++/*i<10;i++*/) {
			intArr[i]=20;
		} //intArr[1] 어쩌고 하는 거 보다 for문이 더 편하다
		
		for(int i=0;i<intArr.length;i++/*i<10;i++*/) {
			System.out.printf("intArr[%d]:%d\n",i,intArr[i] );
		}
		
	}

}
