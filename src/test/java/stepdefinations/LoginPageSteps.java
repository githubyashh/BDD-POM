package stepdefinations;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	private String title;
	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://automationexercise.com/login");
	}

	@When("user checks title of the page")
	public void user_checks_title_of_the_page() {
		 this.title = loginpage.getLoginPageTitle();
		 System.out.println(title);

	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		Assert.assertTrue(this.title.equals(expectedTitle));
	}

	@When("user enters username {string}")
	public void user_enters_username(String id) {
		 loginpage.inputId(id);
	}

	@When("user enters password {string}")
	public void user_enters_password(String pass) {
		loginpage.inputPassword(pass);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginpage.loginClick();
	}

	@Then("user gets title of the page")
	public void user_gets_title_of_the_page() {
		this.title = loginpage.getLoginPageTitle();
		System.out.println(title);
	}

	@Then("login page title should be {string}")
	public void login_page_title_should_be(String expectedTitleAfter) {
		Assert.assertTrue(title.contains(expectedTitleAfter));
	}
	
}
