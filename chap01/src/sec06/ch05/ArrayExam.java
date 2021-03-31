package sec06.ch05;

public class ArrayExam {

	public static void main(String[] args) {
		// 배열(같은 타입의 변수를 여러개 사용하기 편하기 위해 사용하는 것)
		//1,100,200,34,33
		
		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12;
		n2=10;
		n3=n2+4;
		
		//byte,short,int,long,boolean,char,float,double
		//변수 크게 분류(원시형(Primitive Type), 참조형(Reference Type))
//		double[]intArr=new double[100];
//		boolean[]intArr=new boolean[100];
		String[]intArr=new String[10];
		System.out.println("strArr[1]:"+strArr[1]);
		int len=300;
		
		//방법 1 - int[] : 참조형
		int[] intArr=new int[len];//정수에 몇 칸 들어갈 지 [] 적어주기
		System.out.println("intArr[1]:"+intArr[1]);
		//방법 2
		System.out.println("--------------");
		int[] intArr2= {10,20,30};
		
		intArr2[1]=2000; //20에서 2000으로 바뀐 상태
		
		for(int i=0;i<3;i++) {
			System.out.printf("intArr2[%d]:%d\n",i,intArr2[i]);
		}
		
	//	int[] intArr=new int[100]; 
//		intArr[0]=11;
//		intArr[1]=12;
//		intArr[19]=13;
//		intArr[3]=intArr[19]+4;
	}

}
