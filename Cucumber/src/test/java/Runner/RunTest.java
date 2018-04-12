package Runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue= {"StepDefinitions"},tags= {"@facebook1"},
format= {"pretty","html:target/Destination","json:target/Destination/cucumber.json"})

//features =name of the folder where all feature file exist
//glue=package name of the step definition file
//tags=name of the tag to run which feature file needs to run
//format=report creation purpose
//pretty,html is for html report
//json is for json report

public class RunTest {

}
