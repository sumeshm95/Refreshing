package com.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPage {

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	   System.out.println("hello");
	}

	@When("I complete action")
	public void i_complete_action() {
	    System.out.println("its working");
	}
	
	@When("I completed action")
	public void i_completed_action() {
		System.out.println("its working");
	    
	}
	@When("I complete action {string} {string}")
	public void i_complete_action(String string, String string2) {
	    System.out.println(string  +string2);
	   
	}




}



