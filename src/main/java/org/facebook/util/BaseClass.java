package org.facebook.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {

	protected WebDriver driver;
	public Properties prop;

	@Test
	public void invokeBrowser() throws IOException {

		prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:\\Users\\preet\\eclipse-workspace\\PlatinumFacebook\\src\\main\\java\\configPage\\Config.properties");
		prop.load(ip);
		String browserType = prop.getProperty("browser");
		String url = prop.getProperty("url");

		if (browserType.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "chromeDriver.exe");
			driver = new ChromeDriver();
		}

		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
}


// @Parameters({"browserType","url"})
// @Test
// public void invokeBrowser(String browserType, String url) {
//
// if(browserType.equals("CH"))
// {
//
// System.setProperty("webdriver.chrome.driver","ChromeDriver.exe");
// driver = new ChromeDriver();
// }
