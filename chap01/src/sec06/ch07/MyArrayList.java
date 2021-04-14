package sec06.ch07;

public class MyArrayList implements MyList {
	private int[] arr;

	public MyArrayList() {
		arr = new int[0];
	}

	@Override
	public void add(int value) {
		int[] temp = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = value;
		arr = temp;

		for (int v : arr) {
			System.out.println(v);
		}
	}

	@Override
	public void add(int i, int j) {
		int[] temp = new int[arr.length + 1];

		for (int y = 0; y < i; y++) {
			temp[y] = arr[y];
		}
		temp[i] = j;
		for (int z = i + 1; z < temp.length; z++) {
			temp[z] = arr[z - 1];
		}
		arr = temp;
	}

	/*
	 * 샘 코드
	 * 
	 */

	public int remove(int i) {
		int[] temp = new int[arr.length - 1];

		for (int a = 0; a < temp.length; a++) {
			if (a < i) {
				temp[a] = arr[a];
			} else {
				temp[a] = arr[a + 1];
			}
		}
		int a = arr[i];
		arr = temp;
		return a;
	}

	@Override
	public int remove() {
		int[] temp = new int[arr.length - 1];

		for (int i = 0; i < arr.length - 1; i++) {
			temp[i] = arr[i];
		}
		int a = arr[arr.length - 1];
		arr = temp;

		return a;
	}

	@Override
	public int size() {
		return arr.length;
	}// 오버라이딩 빼주면 안 된다

	@Override
	public int get(int index) {
		return arr[index];
	}

}
