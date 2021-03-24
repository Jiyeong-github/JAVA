package sec06.ch03;

public class LogicalOperatorExam {
	public static void main(String[] args) {
		//&&(and) - false 있음 false,||(or) - true가 하나라도 있음 true,!(not)
		
		boolean res1=(1>7)&&true&&true;
		System.out.println("res1:"+res1);
		
		boolean res2=(10>2)||false||false;
		System.out.println("res2:"+res2);
		//!res2 치면 결과 반대로 출력, ||!false하면 true 출력
		
		int n=2;
		boolean res=false&&	(1<n++);
		System.out.println("n:"+n);
	}
}
