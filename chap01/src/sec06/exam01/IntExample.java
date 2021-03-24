package sec06.exam01;
/*
 * 정수 모두 정리(4가지)
 */
public class IntExample {
	public static void main(String[] args) {
		char c='a'; //문자 하나만 저장 가능
		byte b=10;//-128~127 5ml
		short s=20; //2L
		int i=30;//4L 웬만하면 int 쓰면 됨
		long l=40;//8L
		
		s=(short)b;//자동형변환
		s=(short)i; //문제가 될 경우에는 안 쓰시거나 강제형변환
		
		/*short sss1=10;
		 * long lll2=10;
		 * long result=lll2+(long)sss1;*/
	}
}
