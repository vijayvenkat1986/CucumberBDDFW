package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SoftwareTester {

	@Given("^I am a \"(.*)\" software tester$")
	public void i_am_a_good_software_tester(String testerType)  {
		//If alphabets RegEx should be [a-zA-Z]{1,}
		//If Numericals, Alphabets it should be [^\"]*
		//If anything, .*
		System.out.println("Given>> I am a "+testerType +" software tester");
	}

	@When("^I go to work$")
	public void i_go_to_work() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When >> I go to work");
	}

	@And("^I \"(.*)\" with it$")
	public void i_involve_with_it(String workType) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("And >> I "+workType+ " with it");
	}

	@Then("^My boss \"(.*)\" me$")
	public void my_boss_loves_me(String bossReaction)  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then >> My boss "+bossReaction+ " me");
	}
}
