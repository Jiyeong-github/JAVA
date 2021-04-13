package sec06.ch07.starcraft;

public class StarcraftMain {

	public static void main(String[] args) {
		Medic medic = new Medic();
		Medic medic2 = new Medic();
		Marine marine = new Marine();
		Tank tank = new Tank();

		System.out.println("medic-hp:"+medic.getCurrentHP());
		System.out.println("medic2-hp:"+medic2.getCurrentHP());
		System.out.println("marine-hp:"+marine.getCurrentHP());
		
		medic.heal(medic);
		medic.heal(medic2);
		medic.heal(marine);
		medic.heal(tank);
		
		System.out.println("medic-hp:"+medic.getCurrentHP());
		System.out.println("medic2-hp:"+medic2.getCurrentHP());
		System.out.println("marine-hp:"+marine.getCurrentHP());
	}

}
