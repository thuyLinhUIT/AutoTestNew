package automation.testsuite;

import java.awt.Checkbox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day12_Checkbox extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

	}

	@Test
	public void ClickOnCheckBox() {
		// kieem tra khi trang mở ra thì defauld check đã được check vào hay chưa
		WebElement defauldChecked = driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/child::input"));
	boolean status=defauldChecked.isSelected();
	System.out.println("Status is "+status);
	WebElement clickOnThisChk=driver.findElement(By.xpath("//input[@id=\"isAgeSelected\" ]"));
	if (clickOnThisChk.isSelected()==false) {
		clickOnThisChk.click();
		System.out.println("check OK");
	}
	}
	
	@Test
	public void multiCheckBox() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> listCheckBox= 	driver.findElements(By.xpath("//div[normalize-space()=\"Multiple Checkbox Demo\"]/following::div[@class=\"checkbox\"]//input"));
		for (WebElement e : listCheckBox) {
			if (e.isSelected()==false) {
				e.click();
				System.out.println("check "+e+" da check");
			}
		}
	}

//	@AfterMethod
//	public void closeChromeDriver() {
//		driver.close();
//	}
}
