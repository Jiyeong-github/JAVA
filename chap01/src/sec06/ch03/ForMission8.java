package sec06.ch03;

public class ForMission8 {

	public static void main(String[] args) {
		int star = (int) (Math.random() * 5 + 3);
		System.out.println("star:" + star);

		for (int i = 0; i <= star; i++) {
			for (int z = star; z > i; z--) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = star; i > 0; i--) {
			for (int z = i; z > 0; z--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
 * for(int i=star;i>0;i--){ for(int z=0;z>i;z++)P System.out.print("*"); }
 * System.out.println(); }
 */
