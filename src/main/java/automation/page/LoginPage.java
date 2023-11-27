package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.constant.CT_Account;



public class LoginPage {
private WebDriver driver;
public LoginPage (WebDriver _driver) {
	this.driver=_driver;
}
public void LoginFunction(String emailValue, String passValue) {
	WebElement email=driver.findElement(CT_Account.TEXT_EMAIL);
	if (email.isEnabled()) {
		email.clear();
		email.sendKeys(emailValue);
	}
	WebElement pass=driver.findElement(CT_Account.TEXT_PASSWORD);
	if(pass.isEnabled()) {
		pass.clear();
		pass.sendKeys(passValue);
	}
	
	WebElement loginButton =driver.findElement(CT_Account.BUTTON_SINGIN);
	if (pass.isEnabled()) {
		loginButton.click();
	}
	
}
}
