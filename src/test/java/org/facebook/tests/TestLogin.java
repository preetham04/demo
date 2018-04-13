package org.facebook.tests;

import org.apache.log4j.Logger;
import org.facebook.pages.HomePage;
import org.facebook.pages.LoginPage;
import org.facebook.util.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestLogin extends BaseClass {

	
	WebDriver driver;
	
	LoginPage helper;
	HomePage homepage;
	Logger log = Logger.getLogger(TestLogin.class);

@Test
public void verifyLoginPage() throws InterruptedException {
	
	log.info("Launcjing chrome browser");
	helper = new LoginPage(driver);
	homepage = helper.loginPage(prop.getProperty("username"),prop.getProperty("password"));
	log.info("login page title is displayed");
	
}
}