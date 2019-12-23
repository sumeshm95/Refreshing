package com.StepDefinition;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before("@ert")
	public void initBrowser() {
		System.out.println("starting");
	}
	
	@After("@ert")
	public void closeBrowser() {
		System.out.println("ending");
		
	}
	
	

}
