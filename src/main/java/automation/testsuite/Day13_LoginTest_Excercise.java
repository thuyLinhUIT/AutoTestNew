package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Acc_Excersise_Day13;
import automation.page.LoginPage_Excercise_Day13;

public class Day13_LoginTest_Excercise extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Acc_Excersise_Day13.RISE_URL);
	}
	@Test (priority = 1)
	public void LoginSuccess() {
		LoginPage_Excercise_Day13 login_Excercise= new LoginPage_Excercise_Day13(driver);
		login_Excercise.LoginFuntion("student", "Password123");
		assertTrue(driver.findElement(CT_Acc_Excersise_Day13.SUCCESS_TEXT).isDisplayed());
	}
	
	@Test (priority = 2)
	public void LoginFailincorrectUser() {
		LoginPage_Excercise_Day13 login_Excercise= new LoginPage_Excercise_Day13(driver);
		login_Excercise.LoginFuntion("studentIncorrect", "Password123");
		assertTrue(driver.findElement(CT_Acc_Excersise_Day13.ALERT_INCORRECT_USER).isDisplayed());
	}
	@Test (priority = 3)
	public void LoginFailincorrectPass() {
		LoginPage_Excercise_Day13 login_Excercise= new LoginPage_Excercise_Day13(driver);
		login_Excercise.LoginFuntion("student", "incorrectPassword");
		assertTrue(driver.findElement(CT_Acc_Excersise_Day13.ALERT_INCORRECT_PASSWORD).isDisplayed());
	}
	@Test (priority = 4)
	public void LoginFailincorrectUserAndPass() {
		LoginPage_Excercise_Day13 login_Excercise= new LoginPage_Excercise_Day13(driver);
		login_Excercise.LoginFuntion("studentIncorrect", "incorrectPassword");
		assertTrue(driver.findElement(CT_Acc_Excersise_Day13.ALERT_INCORRECT_USER).isDisplayed());
	}
	
	@Test (priority = 5)
	public void LogOuttSuccess() {
		LoginPage_Excercise_Day13 login_Excercise= new LoginPage_Excercise_Day13(driver);
		login_Excercise.LoginFuntion("student", "Password123");
		login_Excercise.LogOutFuntion();
		assertTrue(driver.findElement(CT_Acc_Excersise_Day13.BUTTON_SUBMIT).isDisplayed());
	}
	@AfterMethod
	public void closeChromeDriver() {
		driver.close();
	}
}
