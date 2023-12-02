package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Acc_Excersise_Day13;
import automation.constant.CT_Account;

import automation.page.LoginPage_Factory;

public class LoginTest_Factory extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Account.RISE_URL);
	}

	@Test(priority = 1)
	public void LoginSuccess() {
		LoginPage_Factory login = new LoginPage_Factory(driver);
		login.LoginFunction("admin@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Account.DASHBOARD_TEXT).isDisplayed());
	}

	@Test(priority = 2)
	public void LoginFailIncorectEmail() {
		LoginPage_Factory login = new LoginPage_Factory(driver);
		login.LoginFunction("admin-wrong@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Account.AUTHENTICATION_ALERT).isDisplayed());
	}
	@Test (priority = 3)
	public void LogOuttSuccess() {
		LoginPage_Factory login = new LoginPage_Factory(driver);
		
		login.LogOutFuntion("admin@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Account.BUTTON_SINGIN).isDisplayed());
	}
	@Test(priority = 1)
	public void LoginSuccessIS() {
		LoginPage_Factory login = new LoginPage_Factory(driver);
		login.LoginFunction("admin@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Account.DASHBOARD_TEXT).isDisplayed());
	}
	@AfterMethod
	public void closeChromeDriver() {
		driver.close();
	}
}
