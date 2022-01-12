package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import Utilities.DriverUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutline  extends DriverUtil{


		@Given("User navigates to Google Home page")
		public void user_navigates_to_google_home_page() throws InterruptedException {
		  initBrowser();
		  driver.get("https://google.com");
		}

		@When("User search for amazon webpage {string}")
		public void user_search_for_amazon_webpage(String webpage) {
		  driver.switchTo().activeElement().sendKeys(webpage);
		  driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		}

		@Then("User clicks on amazon link")
		public void user_clicks_on_amazon_link() {
		driver.findElement(By.xpath("//h3[text()='Amazon.in']")).click();
		}

		@Then("User enters iphone in search {string}")
		public void user_enters_iphone_in_search(String product) {
		    driver.findElement(By.xpath("//input[@type='text']" )).sendKeys(product);
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
		}

		@Then("User is able to validate price of iphone13")
		public void user_is_able_to_validate_price_of_iphone13() {
			String price = driver.findElement(By.xpath("//span[text()='69,900']")).getText();
			Assert.assertEquals(price, "69,900");
			tearDown();
		  
		}
}
