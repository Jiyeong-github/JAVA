package sec06.ch04;

import java.util.Scanner;
public class Exercise7 {

	public static void main(String[] args) {
			
		boolean run=true;
		int balance=0;
		Scanner scan = new Scanner(System.in);
		
		while(run){//true라면 case 4에 break MAIN;해줘야 함!
			System.out.println("----------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("----------");
			System.out.print("선택>");
			
			int choice =scan.nextInt();
			switch(choice) {
			case 1:
				System.out.print("입금액>");
				balance+=scan.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				balance-=scan.nextInt();
				break;
			case 3:
				System.out.print("잔고>:"+balance);
				break;
			case 4:
				run=false;
				break;
			default:
				System.out.println("1~4번만 입력해주세요.");
				continue;
			}
			
//			int choice=0;
//			choice=scanner.nextInt();
//			
//			if(choice==1) {
//				System.out.println("예금액>");
//				int deposit=scanner.nextInt();
//				balance=balance+deposit;
//			}else if(choice==2) {
//				System.out.println("출금액>");
//				int withdrawl=scanner.nextInt();
//				balance=balance-withdrawl;
//			}else if(choice==3) {
//				System.out.println("잔고>");
//				System.out.println(balance);
//			}else if(choice==4) {
//				System.out.println("프로그램 종료");
//			}
			

		}
	}

}
