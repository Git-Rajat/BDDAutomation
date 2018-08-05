package org.testingWorld.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.testingWorld.automation.assertions.Compare;
import org.testingWorld.automation.base.CreateDriverInstance;
import org.testingWorld.automation.pages.LoginPage;

import cucumber.annotation.en.*;
import junit.framework.Assert;

public class Steps {
    WebDriver driver;
    LoginPage login;
	@Given("^User is on Login Page$")
	public void User_is_on_Login_Page() throws Throwable {
	    CreateDriverInstance driverInstance=new CreateDriverInstance();
	    driver=driverInstance.generateDriverInstance();
	}

	@When("^User enters username$")
	public void User_enters_username() throws Throwable {
	 login=new LoginPage(driver);
	 login.enterUserName("Rajat");
	   
	}

	@When("^User enters password$")
	public void User_enters_password() throws Throwable {
	 login.enterPassword("heelo13");   
	}

	@When("^User clicks on SignIn Button$")
	public void User_clicks_on_SignIn_Button() throws Throwable {
	    login.clickSignInButton();
	}

	@SuppressWarnings("deprecation")
	@Then("^User logged in Successfully$")
	public void User_logged_in_Successfully() throws Throwable {
		Assert.assertTrue(Compare.validatePageUrl(driver, "https://www.facebook.com"));
	    
	}

	@When("^User enters Incorrect username$")
	public void User_enters_Incorrect_username() throws Throwable {
		login=new LoginPage(driver);
		login.enterUserName("Raj");
	  
	}

	@Then("^User should not be logged in.$")
	public void User_should_not_be_logged_in() throws Throwable {
	    login.enterPassword("edoe");
	}

}
