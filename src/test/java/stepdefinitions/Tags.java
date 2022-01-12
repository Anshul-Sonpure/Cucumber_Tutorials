package stepdefinitions;

import io.cucumber.java.en.*;

public class Tags {
	@Given("Smoke testing Env details")
	public void smoke_testing_env_details() {
	  System.out.println("smoke_testing_env_details ");
	}
	
	@Given("Regression testing Env details")
	public void regression_testing_env_details() {
		 System.out.println("regression_testing_env_details");
	}

	@Given("Some major bugs fixes")
	public void some_major_bugs_fixes() {
		 System.out.println("some_major_bugs_fixes ");
	}
}
