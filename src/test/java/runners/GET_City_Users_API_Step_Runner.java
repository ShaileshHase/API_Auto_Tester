package runners;
import org.testng.annotations.AfterClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
		features = "src\\main\\java\\features\\GET_City_Users_API.feature"
        ,glue={"step"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:test-output/cucumber-reports/report.html"},
 //       plugin = { "pretty" },
        monochrome = true
        )
public class GET_City_Users_API_Step_Runner extends AbstractTestNGCucumberTests {
	@AfterClass
	public static void writeExtentReport() {
		
		com.cucumber.listener.Reporter.assignAuthor("Shailesh Hase");
		
		
	}
	
	
	
	

}

	
	
