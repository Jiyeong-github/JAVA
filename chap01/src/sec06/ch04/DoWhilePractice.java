package sec06.ch04;

import java.util.Scanner;

public class DoWhilePractice {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("종료하시려면 q를 입력하세요");

		Scanner scanner = new Scanner(System.in);
		String inputString;

		do {
			System.out.print(">");
			inputString = scanner.nextLine(); // 입력한 문자열을 얻음
			System.out.println(inputString);
		} while (!inputString.equals("q"));// 문자열 비교시 equals 메소드 이용

		System.out.println();
		System.out.println("프로그램 종료");
	}

}
