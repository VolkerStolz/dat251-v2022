package no.hvl.dat251;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NameSplittingSteps {
	
	String theSuppliedFullName;
	
//  Using cucumber expressions
//
	@Given("the full name {string}")
	public void the_full_name_Atle_Patle(String fullName) {
		theSuppliedFullName = fullName;
	}

	@When("we split the name")
	public void we_split_the_name() {
	}

	@Then("the first name should be {string}")
	public void the_first_name_should_be_Atle(String expectedFirstName) {
		assertEquals(expectedFirstName, NameSplitter.getFirstName(theSuppliedFullName));
	}

	@Then("the last name should be {string}")
	public void the_last_name_should_be_Patle(String expectedLastName) {
		assertEquals(expectedLastName, NameSplitter.getLastName(theSuppliedFullName));
	}

//  Using regular expressions
//
//	@Given("^the full name \"(.*)\"$")
//	public void the_full_name_Atle_Patle(String fullName) {
//		theSuppliedFullName = fullName;
//	}
//
//	@When("^we split the name$")
//	public void we_split_the_name() {
//	}
//
//	@Then("^the first name should be \"(.*)\"$")
//	public void the_first_name_should_be_Atle(String expectedFirstName) {
//		assertEquals(expectedFirstName, NameSplitter.getFirstName(theSuppliedFullName));
//	}
//
//	@Then("^the last name should be \"(.*)\"$")
//	public void the_last_name_should_be_Patle(String expectedLastName) {
//		assertEquals(expectedLastName, NameSplitter.getLastName(theSuppliedFullName));
//	}

}
