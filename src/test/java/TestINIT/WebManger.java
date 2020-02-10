package TestINIT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.PropFileReader;

public class WebManger {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		if(PropFileReader.getProp("config", "browser").equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "//Users//poojabhandari//Desktop//SELENIUM_TRAINING//chromedriver");
		// System.setProperty("webdriver.gecko.driver","//Users//poojabhandari//Desktop//SELENIUM_TRAINING//geckodriver");
		driver = new ChromeDriver();
		}
		return driver;
	}

}
