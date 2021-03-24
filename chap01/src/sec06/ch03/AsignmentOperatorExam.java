package sec06.ch03;

public class AsignmentOperatorExam {
	public static void main(String[] args) {
		int n1=0; //=을 만나면 오른쪽부터 실행(쓰기)
		n1=n1+5;//읽기
		System.out.println("n1:"+n1);
		
		int n2=0;
		n2+=5;
		System.out.println("n2:"+n2);
		
		int n3=(10-3);
		//여기에 마이너스 복합식을 사용하여 4를 빼주세요.
		n3-=4;
		System.out.println("n3:"+n3);
		
		/*System.out.println("n1:"+n1);
		
		int n2=n1+10;
		
		System.out.println("n2:"+n2);
		System.out.println("n1:"+n1);
		
		n1=2;*/
	}
}
