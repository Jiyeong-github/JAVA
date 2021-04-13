package practice;

public class ForPractice {

	public static void main(String[] args) {
		int star= (int)(Math.random()*8+2);
		
		for(int i=0;i<star;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
