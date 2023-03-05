package stepdefinations;


import org.junit.Assert;

import com.pages.HomePage;
import com.pages.ProductsPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProductsPageSteps {
	private int numberOfProducts;
	
	private HomePage homepage= new HomePage(DriverFactory.getDriver());
	private ProductsPage productsPage = new ProductsPage(DriverFactory.getDriver());
	
	@Given("user is navigated to Products Page")
	public void user_is_navigated_to_products_page() {
		DriverFactory.getDriver().get("https://automationexercise.com/products");
		
	}

	@Then("Product list is available")
	public void product_list_is_available() {
	 this.numberOfProducts= productsPage.listOfProducts().size();	
	System.out.println("This is total number of products available = "+ numberOfProducts);
	Assert.assertTrue(numberOfProducts>1);
	}
	

	

	
		
		
		
	}


