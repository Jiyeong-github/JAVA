package sec06.ch05;

import java.util.Arrays;

public class ArraySortExam {

	public static void main(String[] args) {
		int[] arr= {88,65,23,1,900,42,95};
		//88이랑 65 배열 바꾸는 방법? quick temp도 있음 ㅎ
		//멤버필드 X 상수만 
		
		
		int temp=arr[1];
		arr[1]=arr[0];
		arr[0]=temp;
		
		System.out.println(Arrays.toString(arr));
	}

}
