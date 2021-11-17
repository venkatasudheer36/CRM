package searchform;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/main/resources/fullsearchform",glue={"search"},tags = {"@tag"})
public class TestRunner {

}
