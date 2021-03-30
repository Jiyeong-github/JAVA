package sec06.ch03;

public class ForMisson2 {

	public static void main(String[] args) {
		int sum=0;
		//1~3 숫자를 더하시오.
		
		/*
		int sum=0;
		 
		sum=sum+1;
		System.out.println("sum:"+sum);
		
		sum=sum+2;
		System.out.println("sum:"+sum);

		sum=sum+3;
		System.out.println("sum:"+sum);*/
		//for문을 이용하여 1~20 숫자를 전부 더하시오.
		
		for (int i=1; i <=20; i++) {
			sum+=i;}
		System.out.println("1~20의 합:"+sum);
	}

}

/*
 int sum=0;
 for (int i=1; i <=20; i++) {
			sum=sum+i;
			System.out.println("sum:"+sum); }
		System.out.println("sum:"+sum); */
 