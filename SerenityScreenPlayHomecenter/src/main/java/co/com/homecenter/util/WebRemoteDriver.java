package co.com.homecenter.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebRemoteDriver {

	public static WebDriver driver;
	
	public static WebRemoteDriver hisBrowser()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-infobars");
		
		driver = new ChromeDriver();
		return new WebRemoteDriver();
	}
	
	public static WebDriver on(String url)
	{
		driver.get(url);
		return driver;
	}
}
