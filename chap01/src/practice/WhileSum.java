package practice;

public class WhileSum {

	public static void main(String[] args) {
		int sum=0;
		int a=1;
		while(a<=1000) {
			sum+=a;
			a++;
		}
		System.out.println("합:"+sum);
	}

}
