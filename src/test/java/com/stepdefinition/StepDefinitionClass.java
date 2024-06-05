package com.stepdefinition;

import com.pageexe.LoginPageExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass extends LoginPageExe {
	@Given("Launch the URL")
	public void launch_the_url() {
		browserLaunch();
	}

	@When("Enter the username {string}")
	public void enter_the_username(String name) {
		
	}

	@When("Enter the password {string}")
	public void enter_the_password(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Click the Login button")
	public void click_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Validate the Home page")
	public void validate_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
}
