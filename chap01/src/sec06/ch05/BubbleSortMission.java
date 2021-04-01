package sec06.ch05;

import java.util.Arrays;

public class BubbleSortMission {

	public static void main(String[] args) {
		int[]arr= {8,7,3,1,6};
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=arr.length-1;i>0;i--) {
			for(int j=0;j<i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		//7,8,3,1,6 - 뒤의 작은 숫자들을 비교해서 땡긴다
		//7,3,8,1,6
		//7,3,1,8,6
		//7,3,1,6,8
		
		//3,7,1,6,8
		//3,1,7,6,8
		//3,1,6,7,8
		
		//1,3,6,7,8
		
		

	}

}
