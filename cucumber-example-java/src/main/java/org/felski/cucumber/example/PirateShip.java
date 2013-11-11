package org.felski.cucumber.example;

public class PirateShip {

	int piratesCount;
	
	public PirateShip(int piratesCount){
		this.piratesCount = piratesCount;
	}
	
	public void attack(int numberOfAttackingNinjas){
		//fight!
		piratesCount = piratesCount - numberOfAttackingNinjas;
	}
	
	public int getPiratesCount() {
		return piratesCount;
	}

}
