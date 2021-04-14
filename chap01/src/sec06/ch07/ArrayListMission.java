package sec06.ch07;

public class ArrayListMission {

	public static void main(String[] args) {
		MyList list = new MyArrayList();

		list.add(10);
		list.add(20);
		// list.add(30);
		list.add(40);
		list.add(50);

		list.add(2, 30);

		System.out.println("---------------");

		int delVal = list.remove(1);
		System.out.println("delVal:"+delVal);//20

		/*
		 * 0 1 2 3 4 
		 * 10 20 30 40 50
		 * 20 지우고 1번 방에 30 넣기
		 * 
		 * */
		
		// 10,20,30,40,50
		int val = list.remove();

		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d:%d\n", i, list.get(i));
		}

		System.out.println(val);
	}

}
