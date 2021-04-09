package sec06.ch06.blackjack;

public class CardDeck {
//Card 클래스 활용
//카드 패턴 : Spades, Hearts, Diamonds, Clubs
//카드 심볼 : A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
//52개의 Card 객체를 담을 수 있는 은닉화된 전역 배열 상수 존재

	private final Card[] CARD_ARR = new Card[52];
	// Card 객체를 담으려면 Card 배열이어야만 함
	// static 붙이는 순간 객체 생성이랑 거리가 멀어짐, 배열 각 방과 상관 X
	// final 들어가면 값을 못 바꿈

	private String[] patternArr = { "Spades", "Hearts", "Diamonds", "Clubs" };
	private String[] symbolArr = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	// 기본 생성자 정의
	public CardDeck() { // public class 어쩌고 - public 어쩌고(생성자)
		int k = 0;
		for (int i = 0; i < patternArr.length; i++) {
			for (int j = 0; j < symbolArr.length; j++) {
				CARD_ARR[k] = new Card(patternArr[i],symbolArr[j]);
				
				System.out.println(CARD_ARR[k]);
				k++;
			} 
		}
		
	}
//정수값을 String으로 변환하는 법 ->String.vaLueOf();
//아니면 Interger.toString();
}

//모든 다른 값을 가지고 있는 52개의 Card 객체를 생성한다.
//(하나의 패턴은 13개의 심볼을 가질 수 있다.)
//배열에 모든 Card 객체를 담는다.