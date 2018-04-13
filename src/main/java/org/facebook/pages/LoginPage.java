package org.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	
	public HomePage loginPage(String email, String password)
	{
		 		 
		 driver.findElement(By.id("email")).sendKeys(email);
		 driver.findElement(By.id("pass")).clear();
		 driver.findElement(By.id("pass")).sendKeys(password);
		 
		 driver.findElement(By.xpath("//input[@type = 'submit']")).click();	
		 return new HomePage();
		  
		 
	}
	
	public void logout() throws InterruptedException
	{
		driver.findElement(By.id("userNavigationLabel")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//ul[@role = 'menu']/li[18]/a/span/span[text() = 'Log out']")).click();
		
	}

}
