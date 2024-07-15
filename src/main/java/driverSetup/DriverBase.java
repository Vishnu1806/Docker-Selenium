package driverSetup;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverBase {

	public static WebDriver setup(String browser) throws MalformedURLException {
		RemoteWebDriver driver = null;
		URL url = new URL("http://localhost:4444/wd/hub");;
		switch (browser) {
		case "chrome":
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			chromeOptions.setBrowserVersion("124");
			//driver  = new ChromeDriver();
			driver = new RemoteWebDriver(url, chromeOptions);
			break;
		case "edge":
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			driver = new RemoteWebDriver(url, edgeOptions);
			break;

		}
		return driver;
	}

}
