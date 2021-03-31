package sec06.ch04;

public class WhileMission2 {

	public static void main(String[] args) {
//		int sum=0;
//		int i=1;
//		
//		int val=(int)(Math.random()*11); //0~10사이 랜덤값
//		System.out.println("val:"+val);
//		
//		while(val!=0) {
//			sum=sum+val;
//			val=(int)(Math.random()*11);
//			System.out.println("val:"+val);
//		}
//		
//		System.out.println("sum:"+sum);
//		//0이 아니면 계속 sum이에 더하기. (0 나올 때까지 반복문)
//		//sum 지금까지 더한 값 출력
//	}
//
//}

		int sum = 0;

		while (true) {
			int val = (int) (Math.random() * 11);
			System.out.println("val:" + val);
			if (val == 0) {
				break;
			}
			sum += val;
		}
		System.out.println("sum:" + sum);
	}
}
