package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountPage {

	WebDriver driver;

	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//strong[contains(text(),'List Accounts')]")
	WebElement Accounts_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@class=\"btn btn-primary\"]")
	WebElement ADDCUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account_name']")
	WebElement ACCOUNTNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//textarea[@id='description']")
	WebElement DESCRIPTION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement BALANCE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement ACCOUNTNUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement CONTACTPERSON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id='accountSave']")
	WebElement SAVEBUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Account Added Successfully.')]")
	WebElement ACCOUNT_ADDED_SUCCESS_ALERT_ELEMENT;
	
	public void ClickAddAccount() {
		ADDCUSTOMER_ELEMENT.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void entercountname(String accountname) {
		ACCOUNTNAME_ELEMENT.sendKeys(accountname);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterdescription(String description ) {
		DESCRIPTION_ELEMENT.sendKeys(description);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterblance(String balance) {
		BALANCE_ELEMENT.sendKeys(balance);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enteraccountnumber(String accountnumber) {
		ACCOUNTNUMBER_ELEMENT.sendKeys(accountnumber);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void entercontact(String contact) {
		CONTACTPERSON_ELEMENT.sendKeys(contact);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void clicksavebutton() {
		SAVEBUTTON_ELEMENT.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public String getAccountAddedSuccessAlertText() {
		return ACCOUNT_ADDED_ELEMENT.getText();

	}
	}
