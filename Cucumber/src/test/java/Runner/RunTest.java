package Runner;



import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue= {"StepDefinitions"},tags= {"@tastykhana"},
format= {"pretty","html:target/Destination","json:target/Destination/cucumber.json"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})

//features =name of the folder where all feature file exist
//glue=package name of the step definition file
//tags=name of the tag to run which feature file needs to run
//format=report creation purpose
//pretty,html is for html report
//json is for json report

public class RunTest {
	@AfterClass
	public static void writeExtentReport() {
		//Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		//Reporter.loadXMLConfig(new File("/Cucumber/target/Configs/extent-config.xml"));
	}

}
