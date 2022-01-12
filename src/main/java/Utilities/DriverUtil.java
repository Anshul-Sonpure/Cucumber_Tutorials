package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtil {

	public WebDriver driver = null;
	
	

	public void initBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
	}



	public void tearDown() {
		driver.quit();
		
	}
	
	
}
