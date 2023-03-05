package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	
	By username = By.xpath("//ul[@class='nav navbar-nav']//li[10]");
	By products = By.linkText("Products");

	
	public HomePage (WebDriver driver) {
		this.driver= driver;
	}
	
	public String getUsername() {
		return driver.findElement(username).getText();
	}
	public String HomePageTitle() {
		return driver.getTitle();
	}
	
//	public ProductsPage getProductsPage() {
//		 driver.findElement(products).click();
//		 return new ProductsPage(driver);
//	}
}
