package sec06.ch04;

public class ForMission6 {

	public static void main(String[] args) {
		int star = (int)(Math.random()*5)+3;
		// 3~7 사이 랜덤값
		// star=3; ***이 세칸씩!

		for(int i=1; i<=star; i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println(" ");//안에 "" 안해줘도 알아서 나옴
		}

	}
}
