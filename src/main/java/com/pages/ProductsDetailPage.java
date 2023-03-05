package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsDetailPage {
	private WebDriver driver;

	By YourName = By.id("name");
	By EmailAddress = By.id("email");
	By AddReview = By.id("review");
	By submit = By.id("button-review");

	
	public ProductsDetailPage(WebDriver driver) {
		this.driver = driver;
	}

	public void name(String Name) {
		 driver.findElement(YourName).sendKeys(Name);
	}

	public void email(String Email) {
		 driver.findElement(EmailAddress).sendKeys(Email);
	}

	public void review(String Review) {
		 driver.findElement(AddReview).sendKeys(Review);
	}
	public void submit() {
		driver.findElement(submit).click();
	}

}
