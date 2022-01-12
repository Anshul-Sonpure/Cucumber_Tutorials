package stepdefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import Utilities.DriverUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CaptureGroup  extends DriverUtil {
	

@Given("^User navigates to (http.*com)$")
public void user_navigates_to_http_toolsqa_com(String url) throws Throwable {
	initBrowser();
	driver.get(url);
	
	
   
}

	@When("^User enter login name$")
	public void user_enter_login_name() throws Throwable {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("testuser3"); 
		 
	}

	@When("^User enter password$")
	public void user_enter_password() throws Throwable {
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("testuser@123");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}
	
	@Then("^User is able to login$")
	public void user_is_able_to_login() throws Throwable {
	   String welcome = driver.findElement(By.xpath("//b[text()='Welcome']")).getText();
	   String bal = driver.findElement(By.xpath("//b[text()='$515.50']")).getText();
	   Assert.assertEquals(welcome, "Welcome");
	   Assert.assertEquals(bal, "$515.50");
	   tearDown();
	   
	}

}
