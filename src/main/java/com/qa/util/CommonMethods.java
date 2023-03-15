package com.qa.util;


import org.openqa.selenium.WebDriver;


public class CommonMethods {
	
	private WebDriver driver;

	public void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(Constants.implicitlyWait_time, Constants.implicitlywait_TimeUnit);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
