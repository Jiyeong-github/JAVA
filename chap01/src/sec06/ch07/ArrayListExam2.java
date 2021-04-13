package sec06.ch07;

import java.util.ArrayList;
import java.util.List;

import sec06.ch06.blackjack.Card;

public class ArrayListExam2 {

	public static void main(String[] args) {
		List<Card> list = new ArrayList();
//<Card> 제네딕(제약사항) - 들어갈 수 있는 건 카드 객체 주소 값
		Card c1=new Card("","");
		
		list.add(c1);
		
		Card c2=list.get(0);
	}

}
