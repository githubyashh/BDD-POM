package com.qa.factory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.util.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	private ElementUtil elementUtil = new ElementUtil();
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	public WebDriver initialize(String browser) {
		System.out.println("Browser is: " + browser);
		
		if(browser.contains("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();

			if(browser.contains("headless")) {
			options.addArguments("headless");
			
			}
			tlDriver.set(new ChromeDriver(options));

		} else if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		} else {
			WebDriverManager.edgedriver().setup();
			tlDriver.set(new EdgeDriver());
		}
		getDriver().manage().deleteAllCookies();
		//elementUtil.implicitlyWait();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	public static synchronized  WebDriver getDriver() {
		return tlDriver.get();
	}
	
}
