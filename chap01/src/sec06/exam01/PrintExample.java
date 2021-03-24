package sec06.exam01;

public class PrintExample {
	public static void main(String[] args) {
		System.out.println("하");
		System.out.println("호");
		System.out.println("후");
		System.out.println(); //개행 systemout ctrl+space bar
		System.out.print("하");
		System.out.print("호");
		System.out.print("후");
		System.out.println(); //개행
		System.out.println(); //개행
		System.out.print("하\n");
		System.out.print("호\n");
		System.out.print("후\n");//자동으로 \가 들어간 상태
		//TODO: System.out.printf 
		
		char bloodType='0';
		int age=10;
		float weight=30.4f;
		String name="홍길동";
		//하드코딩
		System.out.println("제 이름은"+name+"이며, 나이는"+age+"살이고, 혈액형은"+
		bloodType+"형이고, 몸무게는"+weight+"kg입니다.");
		System.out.printf("제 이름은 %s이며, 나이는 %1d살이고, 혈액형은 %c형이고, 몸무게는 %fkg입니다.",name,age,bloodType,weight);
		
		char ch='c';
		System.out.printf("%d:%c",(int)ch,ch);
	}
}
