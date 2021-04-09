package sec06.ch06.blackjack;

public class Card {
//카드패턴 문자열 값을 저장할 수 있는 pattern 멤버필드 존재
//카드심볼 문자열 값을 저장할 수 있는 symbol 멤버필드 존재
//멤버필드는 은닉화 - private
//카드 String 값
//멤버필드 값을 주입할 수 있는 overloaded 생성자
//멤버필드 카드패턴의 getter 메소드
//멤퍼필드 카드심볼의 getter 메소드

	private String pattern;
	private String symbol;

	public Card(String pattern, String symbol) {// void 써주면 메소드 됨
		super();
		this.pattern = pattern;
		this.symbol = symbol;
	}

	public String getPattern() {
		return this.pattern;
	}

	public String getSymbol() {
		return symbol;
	}
	
	@Override
	public String toString() {
		return pattern+"("+symbol +")";
	}
}
