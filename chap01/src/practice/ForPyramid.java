package practice;

import sec06.ch07.RemoteControl;

public class ForPyramid {

	public static void main(String[] args) {
		
		System.out.println(RemoteControl.AGE);
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<=10-i;j++) {
				System.out.println(" ");
			}
			for(int z=0;z<=2*i;z++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
