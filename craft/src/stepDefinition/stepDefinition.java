package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import dataProvider.ConfigsFileReader;
import manager.PageObjectManager;
import pageObjects.HomePage;
import cucumber.api.java.en.Then;

public class stepDefinition {



private static final String String = null;
//====== Class Varaibles ============================	
  WebDriver driver;
  HomePage homePage;
  ConfigsFileReader configsFileReader;
  PageObjectManager pageObjectManager;
//===================================================
  
  
  /* @Given("^user is on application home page$")
   public void invokeApplication() {
	  configsFileReader = new ConfigsFileReader();
	  System.setProperty("webdriver.chrome.driver", configsFileReader.getDriverPath());
	  driver = new ChromeDriver();
	  driver.get(configsFileReader.getApplicationUrl());
	  driver.manage().window().maximize();
	  pageObjectManager = new PageObjectManager(driver);
	  homePage = pageObjectManager.getHomePage();
	  //homePage.click_searchDeButton();  
  }
  */

@Given("^User is at OKR login page$")
	public void invokeApplication() {
		  configsFileReader = new ConfigsFileReader();
		  System.setProperty("webdriver.chrome.driver", configsFileReader.getDriverPath());
		  driver = new ChromeDriver();
		  driver.get(configsFileReader.getApplicationUrl());
		  driver.manage().window().maximize();
		  pageObjectManager = new PageObjectManager(driver);
		 // homePage = pageObjectManager.getHomePage();
   }
   
   

@When("^User Enter \"([^\"]*)\" in Email field$")
public void user_Enter_in_Email_field(String EmailId){
    homePage.set_userName(EmailId);
   
}

@When("^User Enter \"([^\"]*)\" in Password field$")
public void user_Enter_in_Password_field(String Password) {
	homePage.set_userPassword(Password);
   
}

@Then("^User should be able to login successfully$")
public void user_should_be_able_to_login_successfully(){
	homePage.click_signUp();
   
}



@When("^User Enter \"([^\"]*)\" in Email field And User Enter \"([^\"]*)\" in Password field$")
public void user_Enter_in_Email_field_And_User_Enter_in_Password_field(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	homePage.set_userName(arg1);
	homePage.set_userPassword(arg2);
   
}

@When("^user click on Sign In Button$")
public void user_click_on_Sign_In_Button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(5000);
	homePage.click_signUp();
	Thread.sleep(5000);
	
	
	
}

@Then("^login should be sucessful$")
public void login_should_be_sucessful() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.close();
	
}
}

