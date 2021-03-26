package sec06.ch04;

public class IfMission2 {
//남자 평균키:175
//여자 평균키:163

	public static void main(String[] args) {

		/*
		 * String gender="남"; //"여";
		 * 
		 * System.out.println(gender.equals("남"));
		 * System.out.println(gender.equals("여"));
		 * 
		 * if(height<170) { System.out.println("평균 미만"); }else if(height>=170) {
		 * System.out.println("평균"); }else if(height>=176) {
		 * System.out.println("평균 초과"); } //남,170>평균 미만 //남,175>평균 //남,176>평균 초과 } if
		 * (gender.equals("남")){ System.out.println("남자입니다.");
		 */

		String gender = "남"; // "여";
		int height = 174;
/*String gender="남";
 * int height=173;
 * 
 * if(gender.equals("남")){
 * if*/
		
		if (gender.equals("남")) {
			if (height < 175) {
				System.out.println("평균 미만");
			} else if (height == 175) {
				System.out.println("평균");
			} else {
				System.out.println("평균 초과");
			}
		} else if (gender.equals("여")) {
			if (height < 163) {
				System.out.println("평균 미만");
			} else if (height == 163) {
				System.out.println("평균");
			} else {
				System.out.println("평균 초과");
			}
		} else {
			System.out.println("측정할 수 없습니다.");
		}
	}
}

/*
 * 
 * (height < 170) { System.out.println("평균 미만"); }else if (height <= 175) {
 * System.out.println("평균");
 * 
 * } else if (height > 175) { System.out.println("평균 초과"); }
 * 
 * if (gender.equals("여")) { }else if (height < 162) {
 * System.out.println("평균 미만"); } else if (height <= 163) {
 * System.out.println("평균"); } else if (height > 163) {
 * System.out.println("평균 초과"); } // 남,170>평균 미만 // 남,175>평균 // 남,176>평균 초과 } }
 */
