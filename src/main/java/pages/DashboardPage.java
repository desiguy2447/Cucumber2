package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//Strong[contains(text(),'Dashboard')]")
	WebElement DASHBOARD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'List Accounts')]")
	WebElement Accounts_ELEMENT;
	
	public String DashboardInfo() {
		 return DASHBOARD_ELEMENT.getText();
			}

	public void clickAccounts() {
		Accounts_ELEMENT.click();
		}

	}

