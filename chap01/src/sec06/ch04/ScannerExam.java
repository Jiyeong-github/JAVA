package sec06.ch04;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("나이를 입력하세요:");
		int age=scan.nextInt(); //이게 버그가 많음
		
		System.out.printf("당신의 나이는 %d살입니다.\n",age);
		System.out.println("끝");
	}

}
