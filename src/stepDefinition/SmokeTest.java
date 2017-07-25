package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.PendingException;

public class SmokeTest {

	WebDriver driver;

	@Given("^Open firefox browser and access the facebook application$")
	public void Open_firefox_browser_and_access_the_facebook_application()
			throws Throwable {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

	}

	@When("^Login with the valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void Login_with_the_valid_username_and_password(String uname,
			String pwd) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);
	}

	@Then("^User should be able to access the home page of the application$")
	public void User_should_be_able_to_access_the_home_page_of_the_application()
			throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	}

}
