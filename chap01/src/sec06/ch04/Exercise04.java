package sec06.ch04;

public class Exercise04 {

	public static void main(String[] args) {

		while (true) {
			int z = (int) (Math.random() * 6 + 1);
			int j = (int) (Math.random() * 6 + 1);

			System.out.println("(" + z + "," + j + ")" + "=" + (z + j));
			if (z + j == 5) {
				break;
			}
		}

//		for(int i=1;i<=6;i++) {
//			for(int j=1;j<=6;j++) {
//				if(i+j==5) {
//					System.out.println("("+i+","+j+")"+"="+(i+j));
//					break;
//				}else {
//					continue;
//				}
//			}
//		}
	}

}
