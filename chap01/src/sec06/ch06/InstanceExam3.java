package sec06.ch06;

public class InstanceExam3 {// 주소 값이 왔다 갔다 거림

	public static void main(String[] args) {
		int mainNum = 10; // 리터럴 값

		Box box1 = new Box(); // 주소 값
		box1.num = 10;

		changeNum(mainNum);
		System.out.println("mainNum:" + mainNum);

		changeBoxNum(box1);// 위에서 복사해서
		System.out.println("box.num:" + box1.num);
	}


	public static void changeNum(int num) {// mainNum이랑 다른 거임
		num = 20;
	}

	public static void changeBoxNum(Box box2) {// 주소값을 바꾼 적 없고 걍 접근한거임-다른 변수임~여기서도 복사해서 알려줌
		box2 = new Box();
		box2.num = 20;
	}
}

class Box{
	int num;
}


