package contacts;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/main/resources/contacts",glue={"contacts"},tags = {""})
public class TestRunner
{
}


