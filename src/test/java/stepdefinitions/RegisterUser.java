package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.testng.Assert;

import Utilities.DriverUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RegisterUser extends DriverUtil {
	

	
	@Given("^User navigates to parabank website$")
	public void user_navigates_to_parabank_website() throws Throwable {
		
		initBrowser();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
	}

	@When("^User click on Register link$")
	public void user_click_on_Register_link() throws Throwable {
	    driver.findElement(By.xpath("//a[text()='Register'] ")).click();
	}

	@Then("^User enters all the details$")
	public void user_enters_all_the_details(DataTable testdata) throws Throwable {
		
		 Map<String, String> data = testdata.asMap(String.class,String.class);
		 driver.findElement(By.xpath(" //input[@name=\"customer.firstName\"]")).sendKeys(data.get("First Name"));
		 driver.findElement(By.xpath(" //input[@name=\"customer.lastName\"]")).sendKeys(data.get("Last Name"));
		 driver.findElement(By.xpath(" //input[@name=\"customer.address.street\"]")).sendKeys(data.get("Address"));
		 driver.findElement(By.xpath(" //input[@name=\"customer.address.city\"]")).sendKeys(data.get("City"));
		 driver.findElement(By.xpath(" //input[@name=\"customer.address.state\"]")).sendKeys(data.get("State"));
		 driver.findElement(By.xpath(" //input[@name=\"customer.address.zipCode\"]")).sendKeys(data.get("Zip Code"));
		 driver.findElement(By.xpath(" //input[@name=\"customer.phoneNumber\"]")).sendKeys(data.get("Phone"));
		 driver.findElement(By.xpath(" //input[@name=\"customer.ssn\"]")).sendKeys(data.get("SSN"));
		 driver.findElement(By.xpath(" //input[@name=\"customer.username\"]")).sendKeys(data.get("Username"));
		 driver.findElement(By.xpath(" //input[@name=\"customer.password\"]")).sendKeys(data.get("Password"));
		 driver.findElement(By.xpath(" //input[@name=\"repeatedPassword\"]")).sendKeys(data.get("Confirm"));
		
		 
	}

	@Then("^User clicks on Register$")
	public void user_clicks_on_Register() throws Throwable {
	  driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();
	}

	@Then("^User is taken to User Home page$")
	public void user_is_taken_to_User_Home_page() throws Throwable {
		String welcome = driver.findElement(By.xpath("//h1[text()='Welcome testuser2']" )).getText();
		Assert.assertEquals(welcome, "Welcome testuser3" );
		tearDown();
	    
	}

}
