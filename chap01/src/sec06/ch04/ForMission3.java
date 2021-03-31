package sec06.ch04;

public class ForMission3 {

	public static void main(String[] args) {
		int star=(int)(Math.random()*6)+5;
			System.out.println("star:"+star);
			
			//0,1,2,3,4 i<=star하면 5번 돌게 됨
		for(int i=0; i<star; i++) {
		System.out.print("*");}
		System.out.println("\n끝"); 
		//star는 5~10사이 랜덤값
		//만약 star 값이 5이었다면 "*****"
		//만약 star 값이 8이었다면 "********"
	}

}
