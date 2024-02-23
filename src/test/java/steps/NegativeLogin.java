package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.TestBase;

public class NegativeLogin {
	public class LoginStepDefinition extends TestBase{

		LoginPage loginPage;

	@Given("User is on the codefios login page")
	public void user_is_on_the_codefios_login_page() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		driver.get("https://qa.codefios.com/login");
	 }

	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		loginPage.enterUserName(username);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password){
		loginPage.enterPassword(password);
	}

	@And("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickSubmit();
	}

	@Then("User should be landing on a dashboard page")
	public void user_should_be_landing_on_a_dashboard_page() {
	}
	}
}
