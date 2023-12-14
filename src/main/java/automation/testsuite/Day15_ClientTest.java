package automation.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

import automation.constant.CT_Account;
import automation.page.ClientPage;
import automation.page.LoginPage_Factory;


public class Day15_ClientTest extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Account.RISE_URL);
	}
	
	@Test
	public void AddClientSuccessfully () throws InterruptedException {
		LoginPage_Factory login= new LoginPage_Factory(driver);
		login.LoginFunction("admin@demo.com", "riseDemo");
		
		ClientPage client=new ClientPage(driver);
		client.AddClientFuntion("Linh Company", "Sara Ann");
		Thread.sleep(3000);
		isElementPresent(By.xpath(""));
	}
}
