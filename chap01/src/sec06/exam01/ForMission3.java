package sec06.exam01;

public class ForMission3 {

	public static void main(String[] args) {
		int star=(int)(Math.random()*6)+5;
		
		for(int i=0; i<star; i++)
		System.out.print("*");
		//star는 5~10사이 랜덤값
		//만약 star 값이 5이었다면 "*****"
		//만약 star 값이 8이었다면 "********"
	}

}
