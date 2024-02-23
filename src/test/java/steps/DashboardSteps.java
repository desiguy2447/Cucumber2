package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.TestBase;

public class DashboardSteps extends TestBase{
	
	DashboardPage dashboardPage;
	
@Then("User is on the dashboard page")
  public void user_is_on_the_dashboard_page() {
	dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	  }
@When("User clicks on List Accounts")
  public void user_clicks_on_List_Accounts(){
  		dashboardPage.clickAccounts();
  }
      

}
  		 


