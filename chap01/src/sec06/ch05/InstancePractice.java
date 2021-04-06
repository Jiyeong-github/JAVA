package sec06.ch05;

public class InstancePractice {
	public static void main(String[] args) {

		String[] menuNmArr = { "한식", "양식", "일식", "중식", "동남아식" };
		String[] mainMnArr = { "갈비", "파스타", "스시", "탕수육", "분짜" };
		Food[] foodArr = new Food[5];

		for (int i = 0; i < foodArr.length; i++) {
			Food food = new Food();

			food.food = menuNmArr[i];
			food.main = mainMnArr[i];

			foodArr[i] = food;
		}
		
		PrintMenu(foodArr);
		
	}

	public static void PrintMenu(Food[] foodArr) {
		String str="<메뉴>\n0. 종료\n";
		
		for(int i=0;i<foodArr.length;i++) {
			str+= String.format("%d. %s(%s)\n",i+1,foodArr[i].food,foodArr[i].main);
		}
		System.out.println(str);
	}
}
