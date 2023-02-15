package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	//1.By Locators:
	private By user = By.xpath("//input[@type='email']");
	private By password = By.cssSelector("input[type='password']");
	private By login = By.cssSelector("button[type='submit']");
	
	//2.Constructor of page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	 
	//3.Page Actions
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void inputId(String id) {
		driver.findElement(user).sendKeys(id);
	}
	public void inputPassword(String pass) {
		driver.findElement(password).sendKeys(pass);

	}
	public void loginClick() {
		driver.findElement(login).click();

	}
	
	public HomePage loginMethod(String id ,String pass ) {
		driver.findElement(user).sendKeys(id);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
		return new HomePage(driver);
	}
	
}

