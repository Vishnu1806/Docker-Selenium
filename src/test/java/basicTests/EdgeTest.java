package basicTests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driverSetup.DriverBase;

public class EdgeTest {
	@Parameters({"browser"})
	@Test
	public void titleTest(String browser) throws MalformedURLException{
		
		WebDriver driver  = DriverBase.setup(browser);
		driver.get("https://demoqa.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
