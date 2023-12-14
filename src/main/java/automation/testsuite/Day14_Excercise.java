package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Acc_Excersise_Day14;
import automation.constant.CT_Account;
import automation.page.LoginPage;
import automation.page.LoginPage_Factory_Day14;


public class Day14_Excercise extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Acc_Excersise_Day14.RISE_URL);
	}
	

//	@Test(priority = 1)
//	public void LoginSuccess() {
//		LoginPage_Factory_Day14 login = new LoginPage_Factory_Day14(driver);
//		//login.SignInClick();
//		login.LoginFunction("li@gmail.com", "123456");
//		assertTrue(isElementPresent(CT_Acc_Excersise_Day14.TEXT_COURSES));
//	}
	
//	@Test(priority = 2)
//	public void SignInNewAcc() {
//		LoginPage_Factory_Day14 login = new LoginPage_Factory_Day14(driver);
//		login.SignUpFuntion("linh", "thu1@gmail.com", "thu1@gmail.com", "123456","123456", "0989875644");
//		assertTrue(isElementPresent(CT_Acc_Excersise_Day14.TEXT_COURSES));
//	}
	
	@Test(priority = 3)
	public void ChangePassword() throws InterruptedException {
		LoginPage_Factory_Day14 login = new LoginPage_Factory_Day14(driver);
		//login.SignInClick();
		login.LoginFunction("li@gmail.com", "1234567");
		login.changePass("1234567","123456");

		login.LoginFunction("li@gmail.com", "123456");
		login.changePass("123456","1234567");
		assertTrue(isElementPresent(CT_Acc_Excersise_Day14.TEXT_COURSES));
	}
	
	@AfterMethod
	public void closeChromeDriver() {
		driver.close();
	}
}
