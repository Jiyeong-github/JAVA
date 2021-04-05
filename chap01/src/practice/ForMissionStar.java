package practice;

public class ForMissionStar {

	public static void main(String[] args) {
		int star=(int)(Math.random()*6+5);
		
		for(int i=star; i>0; i--) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

//		for(int z=0;z<20;z++) {
//			System.out.println("ㅎㅇ");
//		} //0~20 : 21번
//		
	}

}

