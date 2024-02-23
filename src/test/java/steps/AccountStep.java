package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.TestBase;

public class AccountStep extends TestBase {
  AccountPage  accountpage;
  
  
  
		  
  @Then("User is on the account list page")
  public void user_is_on_account_list_page() {
	  accountpage = PageFactory.initElements(driver, AccountPage.class);
  }
  
  @When("the user clicks on add account button")
  public void the_user_clicks_on_add_account_button() {
	  accountpage.ClickAddAccount();
  }
  
  @When("the user enters account name as {string}")
  public void the_user_enters_account_name_as(String accountname) {
	  accountpage.entercountname(accountname);
  }
 
  @When("the user enters description as {string}")
  public void the_user_enters_description_as(String description) {
	  accountpage.enterdescription(description); 
  }
  @When("the user enters initial balance as {string}")
  public void the_user_enters_intial_balance_as(String balance) {
	  accountpage.enterblance(balance);
  }
  
  @When("the user enters account number as {string}")
  public void the_user_enters_account_number_as(String accountnumber) {
	  accountpage.enteraccountnumber(accountnumber);
  }
  @When("the user enters contact person as {string}")
  public void the_user_enters_contact_person_as(String contact) {
	  accountpage.entercontact(contact);
  }
  
  @When("the user clicks the save button")  
  public void the_user_clicks_the_save_button() {
	  accountpage.clicksavebutton();
  }
  @Then ("User should be able to see account added alert")
  public void User_should_be_able_to_see_account_added_alert() {
  String actualText = accountpage.getAccountAddedSuccessAlertText();
  String expectedText = "Account Added Successfully.";
Assert.assertEquals("Success Alert is not matching", expectedText, actualText);

}
}
