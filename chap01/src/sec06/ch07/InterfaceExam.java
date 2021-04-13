package sec06.ch07;

public class InterfaceExam {
//인터페이스명은 주로 형용사
	//다형성을 위해 사용
	public static void main(String[] args) {
		
		LGTv tv1 = new LGTv();
		SamsungTv tv2= new SamsungTv();
		RemoteControl rc1 = tv1;
		RemoteControl rc2 = tv2;

		rc1.volumeUp();
		rc2.volumeUp();
		
		rc1.volumeDown();
		rc2.volumeDown();
		
		rc1.chkVolume();
		rc2.chkVolume();
	}

}
