package org.felski.cucumber.example;

import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AttackScenario {

	private PirateShip pirateShip;

	@Given("^a ship with (\\d*) pirates$")
	public void setUpShip(int numberOfPirates){
		pirateShip = new PirateShip(numberOfPirates);
	}
	
	@When("^(\\d*) ninjas attacks$")
	public void attack(int numberOfNinjas){
		pirateShip.attack(numberOfNinjas);
	}
	
	@Then("^(\\d*) pirates should left$")
	public void survivers(int expectedSurvivers){
		assertTrue(pirateShip.getPiratesCount()+" pirates survived!", pirateShip.getPiratesCount() == expectedSurvivers);
	}
	
}
