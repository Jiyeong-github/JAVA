package sec06.ch03;

public class CompareOperatorExam {
	public static void main(String[]args) {
		int num1=10;
		int num2=10;
		
		boolean result1=(num1==num2);
		boolean result2=(num1!=num2);
		boolean result3=(num1<=num2);
		boolean result4=(num1<num2);
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		System.out.println("result3="+result3);
		System.out.println("result4="+result4);
		
		System.out.println("-----------------");
		
		char ch1='a';//97
		char ch2='A';//65
		boolean result5=ch1<ch2;
		System.out.println("result5="+result5);
		System.out.println('a'==97);
		System.out.println(0.1==(double)0.1f);
		
			System.out.println(Double.compare(3.21,3.21f));
			//f지우면 0됨(=0이면 같다는 소리)
			
		//>,>=,<=,==,!= 원시형 숫자타입(include char)
			
		System.out.println("3.0==3.0f:"+(3.0==3.0f));
		System.out.println("3.5==3.5f:"+(3.0==3.0f));
		
		System.out.println("3.2==3.2f:"+(3.2==3.2f));
		System.out.println("(float)3.2d==3.2f:"+((float)3.2d==3.2f));
		// <,>,>=,<=,==,!= 원시형 숫자타입(include char)
		
		String str1= new String("A");
		String str2= str1;
		
		System.out.println("str1==str2:"+(str1==str2));//개중요 string에서는 ==비교 X
		System.out.println("str1.equals(str2):"+str1.equals(str2)); //equals 주는 거 정말 중요!
		System.out.println("str2.equals(str1):"+str2.equals(str1));
	}
}
