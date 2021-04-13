package sec06.ch07.starcraft;

public class Medic implements Bionic {
	private int currentHP = 10;
	private final int MAX_HP = 20;
	
	public int getCurrentHP() {
		return currentHP;
	}
	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}
	
	public void heal(Object unit) {
	
		if(this==unit||!(unit instanceof Bionic)) {//예외가 발생할 수 있는 상황
			System.out.println("치료할 수 없습니다.");
			return;
		}
		
			if(unit instanceof Marine) {
				Marine marine=(Marine)unit;
				marine.setCurrentHP(marine.getMAX_HP());
				
			}else if(unit instanceof Medic) {
				Medic medic=(Medic)unit;
				medic.setCurrentHP(medic.MAX_HP);
			}
	}
}
