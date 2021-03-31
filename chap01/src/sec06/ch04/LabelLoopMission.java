package sec06.ch04;

public class LabelLoopMission {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 10; i++) {
			for (int z = 100; z < 110; z++) {
				System.out.printf("%d-%d\n", i, z);

				if (z == 102) {
					break;
				}
			}
			System.out.println("0331");
		}
		System.out.println("끝");

	}

}
