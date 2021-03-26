package sec06.ch04;

public class IfMission2Another {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender = "여";
		int height = 172;

		final int MAN_STAND = 175;
		final int WOMAN_STAND = 163;

		int stand = MAN_STAND;

		if (gender.equals("남")) {
			// stand=MAN_STAND;
		} else if (gender.equals("여")) {
			stand = WOMAN_STAND;
		}

		if (height < stand) {
			System.out.println("평균 미만");
		} else if (height == stand) {
			System.out.println("평균");
		} else {
			System.out.println("평균 초과");
		}
	}
}
/*String gender="여";
 *int height=162;
 *
 *final int MAN_STAND=175;
 *final int WOMAN_STAND=163;
 *
 *int stand=MAN_STAND;
 *
 *if(gender.equals("남")){
 *}else if(gender/equals("여")){
 *stand=WOMAN_STAND;
 *}
 *if(height<stand){
 *System.out.println("평균 미만");
 *}else if(height==stand){
 *System.out.println("평균");
 *}else{
 *System.out.println("평균 초과");
 *}
 *}
 *}*/
