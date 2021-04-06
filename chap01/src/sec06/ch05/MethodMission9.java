package sec06.ch05;
import java.util.Arrays;

public class MethodMission9 {

	public static void main(String[] args) {
		int[] arr = { 4, 8, 10, 11, 45 };

		// System.out.println(Arrays.toString(arr));
		String result = toString(arr);
		System.out.println(result);
	}

	public static String toString(int[] arr) {
		String aaa = "["; //Integer.toString(arr[0]);
		for (int i = 0; i < arr.length; i++) { 
			if (i == arr.length-1) {
				aaa = aaa + (arr[i]+"]");//샘 코드: aaa+=arr[i]+",";
			} else {
				aaa = aaa + (arr[i] + ", ");
			}
		}
		return aaa; 
		//return String.format("[%s]",str);
	}//array는 for문이랑 찰떡 궁합><
}
//