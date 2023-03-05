package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
	private WebDriver driver;
	
	By totalProducts = By.xpath("//div[@class='choose']/ul/li/a");
	By firstItem = By.xpath("//a[@href = '/product_details/1']");

	
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public List<WebElement> listOfProducts() {
		List<WebElement> list = driver.findElements(totalProducts);
		
		ArrayList<WebElement> arraylist = new ArrayList<>();
		arraylist.addAll(list);
		return list;
	}
	
	public void firstItem() throws InterruptedException {
		//((JavascriptExecutor)driver).executeScript("argument[0].scrollIntoView()", firstItem);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		driver.findElement(firstItem).click();
		
	}
	
	
}
