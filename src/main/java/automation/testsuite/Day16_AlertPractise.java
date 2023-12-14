package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Account;

public class Day16_AlertPractise extends CommonBase {
//	@BeforeMethod
//	public void openChrome() {
//		driver = initChromeDriver("https://demo.guru99.com/test/delete_customer.php");
//	}
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://demo.automationtesting.in/Alerts.html");
	}
	

public void deleteCustomerSuccessfully() {
	type(By.xpath("//input[@name='cusid']"), "1234");
	click(By.xpath("//input[@name='submit']"));
	String msgConfirmString=driver.switchTo().alert().getText();
	assertEquals(msgConfirmString, "Do you really want to delete this Customer?");
	driver.switchTo().alert().accept();
	String msgNotify_DeleteSuccessfullyString=driver.switchTo().alert().getText();
	assertEquals(msgNotify_DeleteSuccessfullyString, "Customer Successfully Delete!");
	}
@Test
public void sayHello_Alert() {
	click(By .xpath("//a[normalize-space()='Alert with Textbox']"));
	click(By .xpath("//button[normalize-space()='click the button to demonstrate the prompt box']"));
	driver.switchTo().alert().sendKeys("Linh de thuong");
	driver.switchTo().alert().accept();
	assertTrue(isElementPresent(By.xpath("//p[contains(text(),' Linh de thuong')]")));
}
@AfterMethod
public void quitDriver() {
	driver.close();
}
}
