package sec06.ch03;

public class WhileExam2 {

	public static void main(String[] args) {
		int i = 0;
		while (true) {// 무한루프
			i++;
			if (i == 10) {
				break;
			}

		}
		//System.out.println("i:" + i);
		if (i % 2 == 0) {
			continue;
		}
		System.out.println("i:"+i);
	}for(int k = 0;k<10;k++);
	{
		if (k % 2 == 0) {
			continue;
		}
		System.out.println("k:" + k);
	}
}}
