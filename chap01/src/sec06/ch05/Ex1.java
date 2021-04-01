package sec06.ch05;

import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		
		String[] menuNmArr = { "콜라", "사이다", "환타" };
		
		for(int i=0;i<menuNmArr.length;i++) {
			
			System.out.printf("menuNmArr[%d] : %s",i,menuNmArr[i]);
			System.out.println();//개행
			
		}
	}

}	
