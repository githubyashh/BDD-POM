package stepdefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps {
	
	private LoginPage loginpage=new LoginPage(DriverFactory.getDriver());
	private HomePage homepage;
	private String loginName;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> credentialList= dataTable.asMaps();
		String username = credentialList.get(0).get("username");
		String password = credentialList.get(0).get("password");
		
		DriverFactory.getDriver().get("https://automationexercise.com/login");
		homepage = loginpage.loginMethod(username, password);
		
	}

	@Given("user is on Home Page")
	public void user_is_on_home_page() {
		homepage.HomePageTitle();
	}

	@Then("check username of an account")
	public void check_username_of_an_account() {
		 this.loginName = homepage.getUsername();
	}

	@Then("username should be {string}")
	public void username_should_be(String expectedName) {
		Assert.assertTrue(loginName.equals(expectedName));
	}
	

}
