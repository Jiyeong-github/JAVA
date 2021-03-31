package sec06.ch04;

public class ForMission9 {

	public static void main(String[] args) {
		/*int star = 5;

		for (int i = 0; i <star; i++) {
			System.out.print("_");
		}
		for (int j = 0; j < star- 1; j++) {
			System.out.print("*");
		}
		System.out.println();

		// ___* 01234 0
		// __** 56789 1
		// _***
		// ****

	}

}*/
		
		//for문 3개로 해결하기
		/*for() {
			for(;;) {}
			for(;;) {}
		}
		
		//for 2개+if로 해결 가능
		for() {
			for(;;) {
				if() {}
			}
			}*/ 
		
		for(int i=1;i<=star;i++) {
			for(int z=i;z<star;z++) {
				System.out.print("_");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int j=star;j>0;j--) {
			for int k=1;k<=star;k++){
				if(k<1) {System.out.print("_");}
				else {System.out.print("*");
				}
				System.out.println();
			}
		}
		
		int before=0;int idx=0;
		for(int i=0;i<star*star;i++) {
			int z=1 / star;
			if(before!=z) {
				System.out.println();
				before=z;
				idx=0;
			}
			if(idx<star-before) {
				System.out.print("_");
			}else{
				System.out.print("*");
			}
		}
		}
		for(int i=0;i<star*star;i++) {
			int z=satar-(i/star);
		}
		}
