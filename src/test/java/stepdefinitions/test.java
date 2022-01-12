package stepdefinitions;

import org.testng.annotations.Test;

import Utilities.DriverUtil;

public class test extends DriverUtil{
	
	@Test
	public void setup() throws InterruptedException
	{
		initBrowser();
		driver.get("https://google.com");
		driver.close();
	}

}
