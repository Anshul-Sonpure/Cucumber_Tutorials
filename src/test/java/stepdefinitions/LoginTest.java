package stepdefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import Utilities.DriverUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginTest extends DriverUtil {
	
	
	
	@Given("^User navigates to SwagLabs page$")
	public void user_navigates_to_SwagLabs_page() throws Throwable {
      initBrowser();
      driver.get("https://www.saucedemo.com/");
	 
	}

	@When("^User enters valid login details$")
	public void user_enters_valid_login_details() throws Throwable {
		driver.findElement(By.xpath("//input[@id=\"user-name\"] ")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"] ")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"] ")).click();
				
		
	}
	
	@Then("^User is able to login into application$")
	public void user_is_not_able_to_login_into_application() throws Throwable {
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		String logout = driver.findElement(By.xpath("//a[text()='Logout']")).getText();
		Assert.assertEquals(logout, "LOGOUT");
		tearDown();
	}
	

	
	@And("^User enters username (.*) and password (.*)$")
	public void userCredentials(String username,String password) throws Throwable {
		driver.findElement(By.xpath("//input[@id=\"user-name\"] ")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id=\"password\"] ")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id=\"login-button\"] ")).click();
	}
	
	@Then("^User is not able to login into application$")
	public void user_is_able_to_login_into_application() throws Throwable {
		String error_msg = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3/text()")).getText();
		Assert.assertEquals(error_msg,"Username and password do not match");
		tearDown();
		
	}

	


}
