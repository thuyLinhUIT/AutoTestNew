package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.constant.CT_Acc_Excersise_Day13;

public class LoginPage_Excercise_Day13 {
	private WebDriver driver;

	public LoginPage_Excercise_Day13(WebDriver driver) {
		// super();
		this.driver = driver;
	}

	public void LoginFuntion(String userValue, String passValue) {
		WebElement username = driver.findElement(CT_Acc_Excersise_Day13.TEXT_USERNAME);
		WebElement password = driver.findElement(CT_Acc_Excersise_Day13.TEXT_PASSWORD);
		WebElement submitButton = driver.findElement(CT_Acc_Excersise_Day13.BUTTON_SUBMIT);

		if (username.isEnabled()) {
			username.clear();
			username.sendKeys(userValue);
		}

		if (password.isEnabled()) {
			password.clear();
			password.sendKeys(passValue);
			submitButton.click();
		}
	}
	public void LogOutFuntion() {
		WebElement logOut_Button=driver.findElement(CT_Acc_Excersise_Day13.BUTTON_LOGOUT);
		logOut_Button.click();
	}
	
}
