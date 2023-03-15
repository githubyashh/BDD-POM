package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.Scenario;

public class TestNGHooks {
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configreader;
	Properties prop;
	
	@BeforeMethod
	public void getProperty() {
		configreader = new ConfigReader();
		 prop = configreader.init_prop();
	}
	
	@BeforeMethod
	public void launchBrowser() {
		String browserName = System.getProperty("browser") != null ? System.getProperty("browser") : prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.initialize(browserName);
	}
	
	@AfterClass
	public void quitBrowser() {
		driver.quit();
	}
	
	@AfterClass
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			String ssName= scenario.getName().replaceAll("", "_");
			byte[] screeenShotPath= ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screeenShotPath, "image/png", ssName);
					
		}
	}
}
