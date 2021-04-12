package practice;

public class CardMain {

	public static void main(String[] args) {
		CardDeck cd= new CardDeck();
		
		Card card1=cd.getOneCard();
		System.out.println(card1);
		
		System.out.println("------------");
		
		cd.printAll();
	}
	//=이 있으면 void가 아님

//	public static void println(String str) {
//		System.out.println(str);
//	}
//	
//	public static void println(Object obj) {
//		String str=obj.toString();
//		println(str);
//	}
//	
	
	
}
	