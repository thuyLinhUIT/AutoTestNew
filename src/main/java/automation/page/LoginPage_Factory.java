package automation.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class LoginPage_Factory {
	private WebDriver driver;
	@FindBy(id = "email")
	WebElement textEmail;

	@FindBy(id = "password")
	WebElement textPass;

	@FindBy(xpath = "//button")
	WebElement buttonSingIn;
	
	@FindBy(xpath = "//a [@id=\"user-dropdown\"]") WebElement textAccout;
	
	@FindBy(xpath = "//a[text()=' Sign Out']") WebElement buttonSignOut;

	public LoginPage_Factory(WebDriver _driver) {
		// super();
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}

	public void LoginFunction(String email, String pass) {
		textEmail.clear();
		textEmail.sendKeys(email);

		textPass.clear();
		textPass.sendKeys(pass);

		buttonSingIn.click();
	}

	public void LogOutFuntion(String email, String pass) {
		LoginFunction(email,pass);
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		textAccout.click();
		buttonSignOut.click();

	}
	

}
