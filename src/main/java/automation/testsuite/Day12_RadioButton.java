package automation.testsuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day12_RadioButton extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

	}
	@Test
	public void checkRadio() {
		List<WebElement> listRadio=driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		for (WebElement e : listRadio) {
			if (e.isSelected()==false) {
				System.out.println("check ok");
			}
		}
	}
	
	@AfterMethod
	public void closeChromeDriver() {
		driver.close();
	}
}
