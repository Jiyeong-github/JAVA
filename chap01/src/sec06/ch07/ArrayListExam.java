package sec06.ch07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import sec06.ch06.blackjack.Card;

public class ArrayListExam {
//넣는 거 add, 빼는 거 get ->object형태로 빼낼 시 형변화 필수
	
	public static void main(String[] args) {
		List list = new ArrayList(); // List가 더 부모임
//		List list2 = new LinkedList();

		list.add(10);
		list.add(10.1);
		list.add("d");
		list.add(new Card("", ""));

		int val2 = (int) list.get(0);
		System.out.println("val2:" + val2);

		Object obj = list.get(1);
		double val = (double) obj;
		System.out.println("val:" + val);

//		Box box1 = new Box();
//		box1.val = 10;
//
//		Box box2 = new Box();
//		box1.val = 20;
//
//		box1.nextBox = box2;
	}

	class Box {
		int val;
		Box nextBox;
	}

}
