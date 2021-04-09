package practice;

public class CardMain {

	public static void main(String[] args) {

	}

	public static void println(String str) {
		System.out.println(str);
	}
	
	public static void println(Object obj) {
		String str=obj.toString();
		println(str);
	}
	
}
