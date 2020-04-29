package manager;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import cucumber.api.Scenario;
import pageObjects.HomePage;



public class PageObjectManager  {

	public WebDriver driver;
	private HomePage homePage;
	/*
	 * public ExtentReports extent; public static ExtentTest scenarioDef; public
	 * static ExtentTest features; public String reportLocation =
	 * "/TransaviaCucumberTests/Report";
	 */
	
	
	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}
	
	
	public HomePage getHomePage(){

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}
	
	
	
}
