package automation.testsuite;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.page.LoginPage;
	
public class Day13_LoginTest extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Account.RISE_URL);
	}

	@Test(priority = 1)
	public void LoginSuccess() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("admin@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Account.DASHBOARD_TEXT).isDisplayed());
	}

	@Test(priority = 2)
	public void LoginFailIncorectEmail() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("admin-wrong@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Account.AUTHENTICATION_ALERT).isDisplayed());
	}

	@Test(priority = 3)
	public void LoginFailIncorectPass() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("admin@demo.com", "riseDemo-wrong");
		// assertFalse(driver.findElement(CT_Account.DASHBOARD_TEXT).isDisplayed());
		assertTrue(driver.findElement(CT_Account.AUTHENTICATION_ALERT).isDisplayed());
	}
}
