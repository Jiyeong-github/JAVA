package sec06.ch03;

public class ForMission5_1 {

	public static void main(String[] args) {
		// 2*1=2 \t(좀 더 깔끔하게 처리 가능) 3*1=3..
		// 2*2=4 3*2=3..

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d*%d=%d\t", j, i, (j * i));
			}
			System.out.println();
		}
	}

}
/*for(int z=1;z<10;z++){
 * for(int i=2;i<10;i++){
 * System.out.printf(%d*%d=%d\t",i,z,(i*z));
 * }
 * System.out.println();*/
