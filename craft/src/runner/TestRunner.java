package runner;

import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
	 
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/features"
			,glue={"stepDefinition"}
			//,tags={"@Regression"}
			,dryRun=false
			,monochrome=true
			,plugin = {"pretty", "html:Reports"})
			        
		//{"pretty", "html:Reports"})

	public class TestRunner {	 
			/*
			 * @AfterClass public static void writeExtentReport() {
			 * Reporter.loadXMLConfig(new File("configs/report.xml"));
			 * 
			 * }
			 */
	
}
	
	
