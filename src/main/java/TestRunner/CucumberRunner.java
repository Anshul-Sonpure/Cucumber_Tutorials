package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions (
		features = "Features/Tags.feature",
		glue = {"stepdefinitions"},
		monochrome = true,
		plugin = {"pretty","html:reports/cucumber-reports"},
		tags = "@smoke or @prodfix and not @regression"
		)
public class CucumberRunner {

}
