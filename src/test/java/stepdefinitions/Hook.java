package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Hook {
	WebDriver driver;
	@Before
	public void initBrowser() {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		
		driver = new FirefoxDriver();

		driver.manage().window().maximize();

	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("User navigates to saucedemo page")
	public void user_navigates_to_saucedemo_page() {
		driver.get(" https://www.saucedemo.com/" );
	}

	@When("User Login with valid login details")
	public void user_login_with_valid_login_details() {
		driver.findElement(By.xpath("//input[@id=\"user-name\"] ")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"] ")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"] ")).click();
	}

	@Then("User add a product to cart")
	public void user_add_a_product_to_cart() {
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack'] ")).click();
		
	}

	@Then("User Logout")
	public void user_logout() {
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

	}

}
