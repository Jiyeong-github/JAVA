package practice;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] intArr = new int[10];

		for (int i = 0; i < intArr.length; i++) {
			intArr[i]=20;
		}
		
		for(int j=0; j<intArr.length; j++) {
			System.out.printf("intArr[%d]:%d\n",j,intArr[j]);
		}

	}

}
