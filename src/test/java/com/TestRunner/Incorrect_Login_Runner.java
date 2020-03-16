package com.TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\src\\main\\resources\\feature\\Testcase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC05_TestPractice"},
		glue = {"com.StepDefinition"},
		monochrome = true
		)

public class Incorrect_Login_Runner {

}
