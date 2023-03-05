package stepdefinations;

import com.pages.LoginPage;
import com.pages.ProductsDetailPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProductsDetailPageSteps {
	private ProductsDetailPage productsDetailPage = new ProductsDetailPage(DriverFactory.getDriver());
	private LoginPage loginpage=new LoginPage(DriverFactory.getDriver());

	@Given("user is on products detail page")
	public void user_is_on_products_detail_page() {
		
		 DriverFactory.getDriver().get("https://automationexercise.com/product_details/1");
	
	}
	
	@Then("user enters {string} ,gives {string} and describes {string}")
	public void user_enters_gives_and_describes(String name, String email,String review ) {
		productsDetailPage.name(name);
		productsDetailPage.email(email);
		productsDetailPage.review(review);
	    
	}
	
	@Then("user click on submit")
	public void user_click_on_submit() {
		productsDetailPage.submit();
	}




}
